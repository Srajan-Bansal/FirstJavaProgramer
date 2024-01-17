import ElementsOfProgramming.Trees.LevelOrder;
import Kunal_Kushwaha.LinkedList.Questions.LinkedListLeetcode;
import ElementsOfProgramming.Trees.TreeLeetcode;

import java.security.PublicKey;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Solution implements LinkedListLeetcode, TreeLeetcode {

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
//        Integer[] nums = {-10,9,20,null,null,15,7};
//        TreeNode root = TreeLeetcode.levelOrderConstructTree(nums);
//        TreeLeetcode.printTree(root);
//        System.out.println(s.maxPathSum(root));
    }


    class DiaPair {
        boolean isOne = false;

        public DiaPair() {

        }
    }
}