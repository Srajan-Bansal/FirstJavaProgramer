package hackcodingblocks.DP;

import java.util.Arrays;

public class fibonacci {
    public static void main(String[] args) {
        int n = 5;
        int[] dp = new int[n + 1];
//        System.out.println(fiboTD(n, dp));
//        System.out.println(Arrays.toString(dp));
        for (int i = 0; i < n; i++) {
            System.out.println(fiboConst(i));
        }
    }

    static int fiboBU(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i < dp.length; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    static int fiboTD(int n, int[] dp) {
        if (n < 2) return n;

        if (dp[n] != 0) {
            return dp[n];
        }

        return dp[n] = fiboTD(n - 1, dp) + fiboTD(n - 2, dp);
    }

    static int fibo(int n) {
        if (n < 2) return n;

        return fibo(n - 1) + fibo(n - 2);
    }

    static int fiboConst(int n) {
        if (n < 2) return n;
        int a = 0, b = 1, c = 0;

        for (int i = 1; i < n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }
}
