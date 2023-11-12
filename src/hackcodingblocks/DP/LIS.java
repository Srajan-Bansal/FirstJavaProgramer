package hackcodingblocks.DP;

import java.util.*;

public class LIS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        System.out.println(longestIncreasingSubsequence(arr));
    }

    static int longestIncreasingSubsequence(int[] arr) {
        int[] dp = new int[arr.length];
        dp[0] = arr[0];

        int val = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > dp[val - 1]) {
                dp[val++] = arr[i];
                continue;
            }

            int start = 0, end = val - 1, count = -1;
            while (start <= end) {
                int mid = start + (end - start) / 2;

                if (dp[mid] >= arr[i]) {
                    count = mid;
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            dp[count] = arr[i];
        }
        return val;
    }
}