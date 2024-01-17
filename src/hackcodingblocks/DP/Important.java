package hackcodingblocks.DP;

public interface Important {
    public default int path(int[][] grid, int r, int c, int[][] dp) {
        if (r == grid.length || c == grid[0].length) return 1;
        if (r == grid.length - 1 && c == grid[0].length - 1) return Integer.MAX_VALUE;

        if (dp[r][c] != -1) return dp[r][c];

        int h = path(grid, r + 1, c, dp);
        int v = path(grid, r, c + 1, dp);
        return dp[r][c] = Math.max(h,v) + grid[r][c];
    }

    // When to return Integer.MAX_VALUE

    // WE return the Max Value only when you are not adding value if you did like
    // int h =  grid[r][c] + path(grid, r + 1, c, dp);
    // dp[r][c] = grid[r][c] +  Math.max(h,v);

    // Then in base case it will add something that can cause overflow that why add at last OR
    // (Important) Use less value the MAX and more than constraints
    // Another ex. Valintine Magic, Minimum Falling Path Sum - I, II
}
