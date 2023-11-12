package hackcodingblocks.DP;

import java.util.Arrays;

public class CoinExchange_II {
    public static void main(String[] args) {
        int[] coins = {1, 2, 5};
        int amount = 5;
        int[][] dp = new int[amount + 1][coins.length + 1];
        for (int[] row : dp) Arrays.fill(row, -1);
        System.out.println(coin(coins, 0, amount, dp));
    }

    static int coin(int[] arr, int i, int target, int[][] dp) {
        if (target == 0) return 1;
        if (i == arr.length) return 0;

        if (dp[target][i] != -1) return dp[target][i];

        int inc = 0;
        if (target >= arr[i]) {
            inc = coin(arr, i, target - arr[i], dp);
        }

        int exc = coin(arr, i + 1, target, dp);
        return dp[target][i] = inc + exc;
    }

    static int coinExchangeBU(int[] coins, int amount) {
        int[][] dp = new int[amount + 1][coins.length + 1];
        Arrays.fill(dp[0], 1);

        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                int inc = 0, exc = 0;
                if (i >= coins[j - 1]) {
                    inc = dp[i - coins[j - 1]][j];
                }
                exc = dp[i][j - 1];
                dp[i][j] = inc + exc;
            }
        }
        return dp[dp.length - 1][dp[0].length - 1];
    }
}
