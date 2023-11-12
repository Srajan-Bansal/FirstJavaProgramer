package hackcodingblocks.DP;

import java.util.*;

public class LCS_threeStrings {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String text1 = sc.next(), text2 = sc.next(), text3 = sc.next();

//        Integer[][][] dp = new Integer[text1.length()][text2.length()][text3.length()];
        int[][][] dp = new int[text1.length()][text2.length()][text3.length()];
        for (int[][] arr : dp) {
            for (int[] row : arr) Arrays.fill(row, -1);
        }
        System.out.println(lcsStrings(text1, 0, text2, 0, text3, 0, dp));

    }

    static int lcsStrings(String text1, int i, String text2, int j, String text3, int k, int[][][] dp) {
        if (i == text1.length() || j == text2.length() || k == text3.length()) return 0;

        if (dp[i][j][k] != -1) return dp[i][j][k];

        int res = 0;
        if (text1.charAt(i) == text2.charAt(j) && text1.charAt(i) == text3.charAt(k)) {
            res = 1 + lcsStrings(text1, i + 1, text2, j + 1, text3, k + 1, dp);
        } else {
            res = lcsStrings(text1, i, text2, j, text3, k + 1, dp);
            res = Math.max(res, lcsStrings(text1, i, text2, j + 1, text3, k, dp));
            res = Math.max(res, lcsStrings(text1, i + 1, text2, j, text3, k, dp));
        }

        return dp[i][j][k] = res;
    }
}
