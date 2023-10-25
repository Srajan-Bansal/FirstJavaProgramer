package hackcodingblocks.Tree;

import ElementsOfProgramming.Trees.TreeLeetcode;

import java.util.Map;
import java.util.TreeMap;

public class BottomView implements TreeLeetcode {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(6);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(5);

        TreeLeetcode.printTree(root);

        Map<Integer, Integer> map = new TreeMap<>();
        bottomView(root, 0,  map);
        System.out.println(map);
    }

    static void bottomView(TreeNode root, int level, Map<Integer, Integer> map) {
        if (root == null) return;

        map.put(level, root.val);

        bottomView(root.left, level - 1, map);
        bottomView(root.right, level + 1,  map);
    }
}
