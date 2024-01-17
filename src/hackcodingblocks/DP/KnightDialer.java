package hackcodingblocks.DP;

import java.util.Arrays;
import java.util.List;

// LEETCODE
public class KnightDialer {
    int[][] grid = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9},
            {-1, 0, -1}
    };

    List<Integer[]> moves = List.of(
            new Integer[]{2, 1}, new Integer[]{2, -1},
            new Integer[]{1, 2}, new Integer[]{1, -2},
            new Integer[]{-1, 2}, new Integer[]{-1, -2},
            new Integer[]{-2, 1}, new Integer[]{-2, -1}
    );

    int MOD = 1_000_000_007;

    public int knightDialer(int n) {
        int[][][] dp = new int[4][3][n];
        for (int[][] arr : dp) for (int[] row : arr) Arrays.fill(row, -1);

        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] != -1) {
                    count = (count + knightDialer(n, i, j, dp)) % MOD;
                }
            }
        }
        return count;
    }

    public int knightDialer(int n, int row, int col, int[][][] dp) {
        if (n == 0) return 1;
        if (dp[row][col][n] != -1) return dp[row][col][n];

        int count = 0;
        for (Integer[] move : moves) {
            int x = row + move[0], y = col + move[1];
            if (isValid(x, y) && n > 0) {
                count = (count + knightDialer(n - 1, x, y, dp)) % MOD;
            }
        }
        return dp[row][col][n] = count;
    }

    boolean isValid(int i, int j) {
        if (i >= 0 && j >= 0 && i < grid.length && j < grid[0].length) return grid[i][j] != -1;
        return false;
    }
}
