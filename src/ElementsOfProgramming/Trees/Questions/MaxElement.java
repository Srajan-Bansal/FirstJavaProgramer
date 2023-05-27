package ElementsOfProgramming.Trees.Questions;

import ElementsOfProgramming.Trees.TreeLeetcode;

public class MaxElement implements TreeLeetcode {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(12);
        root.right = new TreeNode(9);
        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(6);

//        System.out.println(maxElement(root));
        System.out.println(maxHeight(root));
    }

    static int maxHeight(TreeNode root) {
        if (root == null) return 0;

        return Math.max(1 + maxHeight(root.left), 1 + maxHeight(root.right));
    }

    static int maxElement(TreeNode root) {
        if (root == null) return 0;

        int num = root.val;
        int left = maxElement(root.left), right = maxElement(root.right);
        return Math.max(num, Math.max(left, right));
    }
}
