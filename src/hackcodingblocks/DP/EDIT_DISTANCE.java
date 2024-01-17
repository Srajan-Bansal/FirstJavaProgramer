package hackcodingblocks.DP;

import java.util.*;

// SPOGE EDIT_DISTANCE Question

public class EDIT_DISTANCE {
    public static void main(String[] args) {
        String A = "food", B = "monkey";
        int[][] dp = new int[A.length() + 1][B.length() + 1];
        for (int[] row : dp) Arrays.fill(row, -1);

        System.out.println(convert(A, 0, B, 0, dp));
    }

    static int convert(String A, int i, String B, int j, int[][] dp) {
        if (i == A.length()) return B.length() - j;
        if (j == B.length()) return A.length() - i;

        if (dp[i][j] != -1) return dp[i][j];

        char a = A.charAt(i), b = B.charAt(j);
        int count = 0;
        if (a == b) {
            count = convert(A, i + 1, B, j + 1, dp);
        } else {
            int delete = convert(A, i + 1, B, j, dp);
            int insert = convert(A, i, B, j + 1, dp);
            int replace = convert(A, i + 1, B, j + 1, dp);

            count = Math.min(delete, Math.min(insert, replace)) + 1;
        }

        return dp[i][j] = count;
    }
}
