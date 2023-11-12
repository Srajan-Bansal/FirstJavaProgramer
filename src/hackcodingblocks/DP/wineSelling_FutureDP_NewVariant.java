package hackcodingblocks.DP;

public class wineSelling_FutureDP_NewVariant {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 1, 4};
//        System.out.println(sell(arr, 0, arr.length - 1, 1));
//
//        int[][] dp = new int[arr.length][arr.length];
//        System.out.println(sellTD(arr, 0, arr.length - 1, 1, dp));

        System.out.println(sellBU(arr));
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

    static int sellBU(int[] arr) {
        int[][] dp = new int[arr.length][arr.length];

        int year = arr.length;
        for (int i = 0; i < dp.length; i++) {
            dp[i][i] = arr[i] * year;
        }
        year--;

        // j - i = slide
        for (int slide = 1; slide < dp.length; slide++) {
            for (int j = slide; j < dp.length; j++) {
                int i = j - slide;
                int first = year * arr[i] + dp[i + 1][j];
                int second = year * arr[j] + dp[i][j - 1];
                dp[i][j] = Math.max(first, second);
            }
            year--;
        }
        return dp[0][dp.length - 1];
    }
}
