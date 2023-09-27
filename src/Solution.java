import Kunal_Kushwaha.LinkedList.Questions.LinkedListLeetcode;
import ElementsOfProgramming.Trees.TreeLeetcode;

import java.util.*;

public class Solution implements LinkedListLeetcode, TreeLeetcode {

    static void inOrder(TreeNode root) {
        if (root == null) return;
        inOrder(root.left);
        System.out.print(root.val + " -> ");
        inOrder(root.right);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(8);
        root.left.left = new TreeNode(0);
        root.left.left.left = new TreeNode(0);
        root.left.right = new TreeNode(1);
        root.right = new TreeNode(5);
        root.right.right = new TreeNode(6);
        root.right.right.left = new TreeNode(0);

        TreeLeetcode.printTree(root);
        Solution s = new Solution();
        s.verticalTraversalTop(root);
    }

    private void verticalTraversalTop(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        Map<Integer, Integer> map = new HashMap<>();
        int height = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            TreeNode last = null, first = null;
            boolean temp = false;
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                last = node;
                if (!temp) {
                    first = node;
                    temp = true;
                }
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            map.put(-height, first.val);
            if (first != last) {
                map.put(height, last.val);
            }
            height++;
        }

        System.out.println(map);
    }
}

