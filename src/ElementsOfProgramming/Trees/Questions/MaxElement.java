package ElementsOfProgramming.Trees.Questions;

import ElementsOfProgramming.Trees.TreeLeetcode;

import java.util.LinkedList;
import java.util.Queue;

public class MaxElement implements TreeLeetcode {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(12);
        root.right = new TreeNode(9);
        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(6);
        root.left.right.left = new TreeNode(122);

//        System.out.println(maxElement(root));
//        System.out.println(maxHeight(root));
        System.out.println(maxElement_LevelOrder(root));
    }

    static int maxElement_LevelOrder(TreeNode root) {
        if (root == null) return Integer.MIN_VALUE;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int max = root.val;

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            max = Math.max(max, node.val);
            if (node.left != null) queue.offer(node.left);
            if (node.right != null) queue.offer(node.right);
        }
        return max;
    }

    static int maxHeight(TreeNode root) {
        if (root == null) return Integer.MIN_VALUE;

        return Math.max(1 + maxHeight(root.left), 1 + maxHeight(root.right));
    }

    static int maxElement(TreeNode root) {
        if (root == null) return Integer.MIN_VALUE;

        int num = root.val;
        int left = maxElement(root.left), right = maxElement(root.right);
        return Math.max(num, Math.max(left, right));
    }
}
