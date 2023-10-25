package hackcodingblocks.Tree;

import ElementsOfProgramming.Trees.TreeLeetcode;

import java.util.LinkedList;
import java.util.Queue;

public class LeftView implements TreeLeetcode {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(6);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(7);

        TreeLeetcode.printTree(root);
        leftView(root);
    }

    static void leftView(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();

                if (i == 0) System.out.println(node.val);

                if (node.right != null) queue.offer(node.right);
                if (node.left != null) queue.offer(node.left);
            }
        }
    }
}
