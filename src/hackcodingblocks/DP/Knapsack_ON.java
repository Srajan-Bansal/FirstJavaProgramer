package hackcodingblocks.DP;

import java.util.*;

public class Knapsack_ON {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), cap = sc.nextInt();

        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) arr[i][1] = sc.nextInt();
        for (int i = 0; i < n; i++) arr[i][0] = sc.nextInt();

        Arrays.sort(arr, (a, b) -> a[1] - b[1]);

        int[][] dp = new int[arr.length + 1][cap + 1];
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                for (int k = 1; k * arr[i - 1][1] <= j; k++) {
                    if (k * arr[i - 1][1] <= j) {
                        dp[i][j] = Math.max(dp[i - 1][j - k * arr[i - 1][1]] + k * arr[i - 1][0], dp[i - 1][j]);
                    } else {
                        dp[i][j] = dp[i - 1][j];
                    }
                }
            }
        }

        System.out.println(dp[dp.length - 1][dp[0].length - 1]);
    }
}