package ElementsOfProgramming.Trees.Questions;

import ElementsOfProgramming.Trees.TreeLeetcode;

public class ChildrenSum implements TreeLeetcode {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
//        root.left = new TreeNode(12);
//        root.right = new TreeNode(9);
//        root.left.left = new TreeNode(5);
//        root.left.right = new TreeNode(6);
//        root.left.right.left = new TreeNode(122);

        root.left = new TreeNode(1);
        root.right = new TreeNode(1);

        System.out.println(childrenSum(root));
    }

    static boolean childrenSum(TreeNode root) {
        if (root == null) return true;
        if (root.left == null && root.right == null) return true;

        int sum = 0;
        if (root.left != null) sum += root.left.val;
        if (root.right != null) sum += root.right.val;

        return root.val == sum && childrenSum(root.left) && childrenSum(root.right);
    }
}