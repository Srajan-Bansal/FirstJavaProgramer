package hackcodingblocks.Tree;

import ElementsOfProgramming.Trees.TreeLeetcode;

import java.util.*;

public class Vertical_Sum implements TreeLeetcode {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(6);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(7);

        Map<Integer, Integer> map = new TreeMap<>();
        verticalSum(root, 0, map);
        System.out.println(map);
    }

    static void verticalSum(TreeNode root, int level, Map<Integer, Integer> map) {
        if (root == null) return;

        verticalSum(root.left, level - 1, map);
        map.put(level, map.getOrDefault(level, 0) + root.val);
        verticalSum(root.right, level + 1, map);
    }

}
