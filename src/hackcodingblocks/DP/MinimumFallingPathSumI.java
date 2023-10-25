package hackcodingblocks.DP;

import java.util.Arrays;

public class MinimumFallingPathSumI {
    public static void main(String[] args) {

    }

    public int minFallingPathSum(int[][] matrix) {
        int[][] dp = new int[matrix.length][matrix[0].length];
        for (int[] row : dp) {
            Arrays.fill(row, -101);
        }

        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < matrix[0].length; i++) {
            ans = Math.min(ans, minFallingPathSum(matrix, 0, i, dp));
        }
        return ans;
    }

    public static int minFallingPathSum(int[][] arr, int row, int col, int[][] dp) {
        if (row == arr.length || col == arr[0].length || col < 0) return Integer.MAX_VALUE;
        if (row == arr.length - 1) return arr[row][col];

        if (dp[row][col] != -101) return dp[row][col];

        int left = minFallingPathSum(arr, row + 1, col - 1, dp);
        int right = minFallingPathSum(arr, row + 1, col + 1, dp);
        int down = minFallingPathSum(arr, row + 1, col, dp);
        return dp[row][col] = Math.min(left, Math.min(right, down)) + arr[row][col];
    }
}
