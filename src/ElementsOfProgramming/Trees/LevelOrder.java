package ElementsOfProgramming.Trees;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrder implements TreeLeetcode {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(12);
        root.right = new TreeNode(9);
        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(6);
        root.left.right.left = new TreeNode(122);

//        levelOrderTraversal(root);
//        levelOrderTraversal_Line_by_Line_method2(root);
    }

    static void levelOrderTraversal(TreeNode root) {
        if (root == null) return;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode curr = queue.poll();
            System.out.print(curr.val + " ");

            if (curr.left != null) queue.add(curr.left);
            if (curr.right != null) queue.add(curr.right);
        }
    }

    static void levelOrderTraversal_Line_by_Line(TreeNode root) {
        /* 2
            12 9
            5 6 7
        * */
        if (root == null) return;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        queue.offer(null);
        while (queue.size() > 1) {
            TreeNode curr = queue.poll();

            if (curr == null) {
                System.out.println();
                queue.offer(null);
                continue;
            }
            System.out.print(curr.val + " ");

            if (curr.left != null) queue.offer(curr.left);
            if (curr.right != null) queue.offer(curr.right);
        }
    }

    static void levelOrderTraversal_Line_by_Line_method2(TreeNode root) {
        /* 2
            12 9
            5 6 7
        * */
        if (root == null) return;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int count = queue.size();

            for (int i = 0; i < count; i++) {
                TreeNode curr = queue.poll();
                System.out.print(curr.val + " ");

                if (curr.left != null) queue.add(curr.left);
                if (curr.right != null) queue.add(curr.right);
            }
            System.out.println();
        }
    }
}
