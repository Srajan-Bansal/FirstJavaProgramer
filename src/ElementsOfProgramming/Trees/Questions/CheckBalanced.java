package ElementsOfProgramming.Trees.Questions;

import ElementsOfProgramming.Trees.TreeLeetcode;

public class CheckBalanced implements TreeLeetcode {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(12);
        root.right = new TreeNode(9);
        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(6);
        root.left.left.left = new TreeNode(100);
        root.left.right.left = new TreeNode(122);

//        root.left = new TreeNode(1);
//        root.right = new TreeNode(1);
        System.out.println(checkBalanced(root));
    }

    // O(N^2)
    static boolean checkBalancedTree(TreeNode root) {
        if (root == null) return true;

        int left = height(root.left);
        int right = height(root.right);

        return Math.abs(left - right) <= 1 && checkBalancedTree(root.left) && checkBalancedTree(root.right);
    }

    static int height(TreeNode root) {
        if (root == null) return 0;
        return Math.max(1 + height(root.left), 1 + height(root.right));
    }

    // O(N) -1 for unbalanced else balanced
    static int checkBalanced(TreeNode root) {
        if (root == null) return 0;
        int left = checkBalanced(root.left);
        if (left == -1) return -1;

        int right = checkBalanced(root.right);
        if (right == -1) return -1;

        if (Math.abs(left - right) > 1) return -1;
        else return Math.max(left, right) + 1;
    }
}