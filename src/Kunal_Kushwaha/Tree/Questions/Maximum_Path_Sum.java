package Kunal_Kushwaha.Tree.Questions;

import ElementsOfProgramming.Trees.TreeLeetcode;


public class Maximum_Path_Sum implements TreeLeetcode {
    int maxSum = 0;

    public int maxPathSum(TreeNode root) {
        DiaPair pair = helper(root);
        return maxSum;
    }

    private DiaPair helper(TreeNode root) {
        if (root == null) return new DiaPair();

        DiaPair left = helper(root.left);
        DiaPair right = helper(root.right);
        DiaPair curr = new DiaPair();

        if (left.sum >= 0 && right.sum >= 0) {
            int sum = left.sum + right.sum + root.val;
            maxSum = Math.max(maxSum, sum);
            curr.sum = sum;
        } else {
            curr.sum = root.val;
        }

        return curr;
    }

    private static class DiaPair {
        int sum = 0;
    }
}
