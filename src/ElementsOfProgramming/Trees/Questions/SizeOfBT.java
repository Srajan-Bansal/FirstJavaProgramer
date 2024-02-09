package ElementsOfProgramming.Trees.Questions;

import ElementsOfProgramming.Trees.TreeLeetcode;

public class SizeOfBT implements TreeLeetcode {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(12);
        root.right = new TreeNode(9);
        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(6);
        root.left.right.left = new TreeNode(122);


        TreeLeetcode.printTree(root);
        System.out.println(sizeOfBT(root));
    }

    public static int sizeOfBT(TreeNode root) {
        if (root == null) return 0;
        return 1 + sizeOfBT(root.left) + sizeOfBT(root.right);
    }
}
