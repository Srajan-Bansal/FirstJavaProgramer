package hackcodingblocks.DP;

import java.util.*;

public class Traingle {
    public static void main(String[] args) {

    }

    public int calculateMinimumHP(int[][] dungeon) {
        int[][] dp = new int[dungeon.length + 1][dungeon[0].length + 1];
        for (int[] row : dp) Arrays.fill(row, -1001);
        int val = HP(dungeon, 0, 0, dp);

        return val;
    }

    public int HP(int[][] dungeon, int r, int c, int[][] dp) {
        if (r == dungeon.length - 1 && c == dungeon[0].length - 1) return dungeon[r][c];
        if (r == dungeon.length || c == dungeon[0].length) return Integer.MIN_VALUE;

        if (dp[r][c] != -1001) return dp[r][c];

        int h = HP(dungeon, r, c + 1, dp);
        int v = HP(dungeon, r + 1, c, dp);
        return dp[r][c] = Math.min(1, Math.max(h, v) + dungeon[r][c]);
    }
}