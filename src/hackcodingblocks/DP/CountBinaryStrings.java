package hackcodingblocks.DP;

import java.util.*;

public class CountBinaryStrings {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//
//        for (int p = 1; p <= t; p++) {
//            int n = sc.nextInt();
//            Long[] dp = new Long[n + 1];
//            System.out.println(count(n, 0, dp));
//        }
//    }
//
//    public static long count(int x, int idx, Long[] dp) {
//        if (idx >= x) {
//            return 1L;
//        }
//
//        if (dp[idx] != null) {
//            return dp[idx];
//        }
//
//        return dp[idx] = count(x, idx + 2, dp) + count(x, idx + 1, dp);
//    }

        // My approach
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();

            long[][] dp = new long[n + 1][2];
            for (long[] row : dp) Arrays.fill(row, -1);
            System.out.println(countString(n, 0, 0, dp));
        }
    }

    static long countString(int n, int i, int last, long[][] dp) {
        if (i == n) return 1;

        if (dp[i][last] != -1) return dp[i][last];

        long zero = countString(n, i + 1, 0, dp);
        long one = 0;
        if (last == 0) {
            one = countString(n, i + 1, 1, dp);
        }
        return dp[i][last] = zero + one;
    }
}
