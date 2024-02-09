import ElementsOfProgramming.Trees.LevelOrder;
import Kunal_Kushwaha.LinkedList.Questions.LinkedListLeetcode;
import ElementsOfProgramming.Trees.TreeLeetcode;
import hackcodingblocks.Graph.GraphLeetcode;

import java.util.*;

public class Solution implements LinkedListLeetcode, TreeLeetcode, GraphLeetcode {

    static void inOrder(TreeNode root) {
        if (root == null) return;
        inOrder(root.left);
        System.out.print(root.val + " -> ");
        inOrder(root.right);
    }

    public static void main(String[] args) {
//        TreeNode root = new TreeNode(1);
//        root.left = new TreeNode(2);
//        root.left.left = new TreeNode(4);
//        root.left.right = new TreeNode(6);
//        root.right = new TreeNode(3);
//        root.right.left = new TreeNode(5);
//        root.right.right = new TreeNode(7);
//        TreeLeetcode.printTree(root);

        Solution s = new Solution();
//        Integer[] nums = {1,2,4,5,3};
//        TreeNode root = TreeLeetcode.levelOrderConstructTree(nums);
//        TreeLeetcode.printTree(root);
//        System.out.println(s.isCousins(root, 4, 5));

    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        List<List<Integer>> list = new ArrayList<>();
            List<Integer> temp = new ArrayList<>();
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                temp.add(node.val);

                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
            }
            list.add(temp);
        }
        return list;
    }
}