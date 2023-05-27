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

        levelOrderTraversal(root);
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
}
