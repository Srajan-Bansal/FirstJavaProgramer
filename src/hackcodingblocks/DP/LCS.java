package hackcodingblocks.DP;

import java.util.Arrays;

public class LCS {
    public static void main(String[] args) {

    }

    public int longestCommonSubsequence(String text1, String text2) {
        int[][] dp = new int[text1.length()][text2.length()];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return longestCommonSubsequence(text1, 0, text2, 0, dp);
    }

    int longestCommonSubsequence(String text1, int i, String text2, int j, int[][] dp) {
        if (i == text1.length() || j == text2.length()) return 0;

        if (dp[i][j] != -1) return dp[i][j];

        int count = 0;
        if (text1.charAt(i) == text2.charAt(j)) {
            count = 1 + longestCommonSubsequence(text1, i + 1, text2, j + 1, dp);
        } else {
            int fs = longestCommonSubsequence(text1, i + 1, text2, j, dp);
            int ss = longestCommonSubsequence(text1, i, text2, j + 1, dp);
            count = Math.max(fs, ss);
        }
        return dp[i][j] = count;
    }

    static int longestCommonSubsequenceBU(String text1, String text2) {
        int[][] dp = new int[text1.length() + 1][text2.length() + 1];

        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                int count = 0;
                if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                    count = 1 + dp[i - 1][j - 1];
                } else {
                    int fs = dp[i - 1][j];
                    int ss = dp[i][j - 1];
                    count = Math.max(fs, ss);
                }
                dp[i][j] = count;
            }
        }
        return dp[dp.length - 1][dp[0].length - 1];
    }
}
