package hackcodingblocks.DP;

import java.util.Arrays;

public class CombinationsSum4 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        System.out.println(combinationSum4(nums, 4));
    }

    public static int combinationSum4(int[] nums, int target) {
        int[] dp = new int[target + 1];
        Arrays.fill(dp, -1);
        return combinations(nums, target, dp);
    }

    public static int combinations(int[] arr, int target, int[] dp) {
        if (target == 0) return 1;

        if (dp[target] != -1) return dp[target];

        int count = 0;
        for (int j = 0; j < arr.length; j++) {
            if (target >= arr[j]) {
                count += combinations(arr, target - arr[j], dp);
            }
        }
        return dp[target] = count;
    }
}