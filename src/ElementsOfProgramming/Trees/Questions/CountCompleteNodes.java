package ElementsOfProgramming.Trees.Questions;

import ElementsOfProgramming.Trees.TreeLeetcode;
import java.util.*;

public class CountCompleteNodes implements TreeLeetcode {
    public int countNodes(TreeNode root) {
        if (root == null) return 0;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int count = 0;

        while (!queue.isEmpty()) {
            count++;
            TreeNode curr = queue.poll();
            if (curr.left != null) queue.offer(curr.left);
            if (curr.left != null && curr.right != null) queue.offer(curr.right);
        }
        return count;
    }
}
