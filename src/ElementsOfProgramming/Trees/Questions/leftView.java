package ElementsOfProgramming.Trees.Questions;

import ElementsOfProgramming.Trees.TreeLeetcode;

public class leftView implements TreeLeetcode {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(12);
        root.right = new TreeNode(9);
        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(6);
        root.left.right.left = new TreeNode(122);

    }

    static void leftView(TreeNode root) {
        if (root == null) return;


        leftView(root.left);
        leftView(root.right);
    }
}
