package hackcodingblocks.DP;

public class wineSelling_FutureDP_NewVariant {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 1, 4};
//        System.out.println(sell(arr, 0, arr.length - 1, 1));
//
//        int[][] dp = new int[arr.length][arr.length];
//        System.out.println(sellTD(arr, 0, arr.length - 1, 1, dp));

    }

    static int sell(int[] arr, int i, int j, int year) {
        if (i > j) return 0;

        int first = year * arr[i] + sell(arr, i + 1, j, year + 1);
        int second = year * arr[j] + sell(arr, i, j - 1, year + 1);

        return Math.max(first, second);
    }

    static int sellTD(int[] arr, int i, int j, int year, int[][] dp) {
        if (i > j) return 0;

        if (dp[i][j] != 0) return dp[i][j];

        int first = year * arr[i] + sellTD(arr, i + 1, j, year + 1, dp);
        int second = year * arr[j] + sellTD(arr, i, j - 1, year + 1, dp);

        return dp[i][j] = Math.max(first, second);
    }
}
