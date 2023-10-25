package hackcodingblocks.DP;

import java.util.Arrays;

public class MinimumFallingPathSumII {
    public static void main(String[] args) {

    }

    public int minFallingPathSum(int[][] grid) {
        int[][] dp = new int[grid.length][grid[0].length];
        for (int[] row : dp) {
            Arrays.fill(row, -101);
        }

        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < grid[0].length; i++) {
            ans = Math.min(ans, minFallingPathSum(grid, 0, i, dp));
        }
        return ans;
    }

    static int minFallingPathSum(int[][] arr, int row, int col, int[][] dp) {
        if (row == arr.length - 1) return arr[row][col];

        if (dp[row][col] != -101) return dp[row][col];

        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < arr[0].length; i++) {
            if (i != col) {
                ans = Math.min(ans, minFallingPathSum(arr, row + 1, i, dp));
            }
        }
        return dp[row][col] = ans + arr[row][col];
    }
}
