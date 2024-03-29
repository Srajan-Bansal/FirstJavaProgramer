package hackcodingblocks.DP;

import java.util.Arrays;

public class CherryPickup_II {
    public int cherryPickup(int[][] grid) {
        int[][][] dp = new int[grid.length][grid[0].length][grid[0].length];
        for (int[][] arr : dp) for (int[] row : arr) Arrays.fill(row, -1);

        return cherryPickup(grid, 0, 0, grid[0].length - 1, dp);
    }

    private int[] moves = {-1, 0, 1};

    public int cherryPickup(int[][] grid, int r, int c1, int c2, int[][][] dp) {
        if (c1 == c2 || Math.min(c1, c2) < 0 || Math.max(c1, c2) == grid[0].length) return 0;
        if (r == grid.length - 1) return grid[r][c1] + grid[r][c2];

        if (dp[r][c1][c2] != -1) return dp[r][c1][c2];

        int ans = 0;
        for (int i : moves) {
            for (int j : moves) {
                ans = Math.max(ans, cherryPickup(grid, r + 1, c1 + i, c2 + j, dp));
            }
        }
        return dp[r][c1][c2] = ans + grid[r][c1] + grid[r][c2];
    }
}
