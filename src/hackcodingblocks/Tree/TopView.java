package hackcodingblocks.Tree;

import ElementsOfProgramming.Trees.TreeLeetcode;

import java.util.Map;
import java.util.TreeMap;

public class TopView implements TreeLeetcode {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(6);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(7);

        TreeLeetcode.printTree(root);

        Map<Integer, Integer> map = new TreeMap<>();
        topView(root, 0,  map);
        System.out.println(map);
    }

    static void topView(TreeNode root, int level, Map<Integer, Integer> map) {
        if (root == null) return;

        if (!map.containsKey(level)) {
            map.put(level, root.val);
        }

        topView(root.left, level - 1, map);
        topView(root.right, level + 1,  map);
    }
}
