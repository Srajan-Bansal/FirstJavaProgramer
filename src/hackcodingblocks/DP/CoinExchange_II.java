package hackcodingblocks.DP;

import java.util.Arrays;

public class CoinExchange_II {
    public static void main(String[] args) {
        int[] coins = {1, 2, 5};
        int amount = 5;
        int[][] dp = new int[amount + 1][coins.length];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j] = -1;
            }
        }
        System.out.println(coinExchange(coins, amount, 0, dp));
    }

    static int coinExchange(int[] coins, int amount, int i, int[][] dp) {
        if (amount == 0) return 1;
        if (i == coins.length) return 0;

        if (dp[amount][i] != -1) return dp[amount][i];

        int inc = 0, exc = 0;
        if (amount >= coins[i]) {
            inc = coinExchange(coins, amount - coins[i], i, dp);
        }
        exc = coinExchange(coins, amount - coins[i], i + 1, dp);
        return dp[amount][i] = inc + exc;
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
