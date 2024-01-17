package Kunal_Kushwaha.Tree.Questions;

import ElementsOfProgramming.Trees.TreeLeetcode;

public class Maximum_Sum_BST implements TreeLeetcode {
    int maxSum = 0;

    public int maxSumBST(TreeNode root) {
        helper(root);
        return maxSum;
    }

    private Result helper(TreeNode node) {
        if (node == null) {
            return new Result(true, Integer.MAX_VALUE, Integer.MIN_VALUE, 0);
        }

        Result leftResult = helper(node.left);
        Result rightResult = helper(node.right);

        if (leftResult.isBST && rightResult.isBST && leftResult.maxVal < node.val && node.val < rightResult.minVal) {
            int sum = leftResult.sum + rightResult.sum + node.val;
            maxSum = Math.max(maxSum, sum);
            return new Result(true, Math.min(leftResult.minVal, node.val), Math.max(rightResult.maxVal, node.val), sum);
        } else {
            return new Result(false, 0, 0, 0);
        }
    }

    private static class Result {
        boolean isBST;
        int minVal;
        int maxVal;
        int sum;

        Result(boolean isBST, int minVal, int maxVal, int sum) {
            this.isBST = isBST;
            this.minVal = minVal;
            this.maxVal = maxVal;
            this.sum = sum;
        }
    }
}
