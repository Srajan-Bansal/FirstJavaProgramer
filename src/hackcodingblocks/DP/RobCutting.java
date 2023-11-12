package hackcodingblocks.DP;

import java.util.*;

/*
Given a rod of length n and a list of prices of rods of length of i, where 1<=i<=n, find the optimal way to cut the rod into smaller rods to maximize profit.The rod of length i has a value price[i-1].

Input Format
An integer N representing length of prices array. Prices array. An integer n representing rod length

Constraints
1<=n<=1000
1<=prices[i]<=1000

Output Format
An integer representing maximum profit

Sample Input
8
1 5 8 9 10 17 17 20
4
Sample Output
10
Explanation
Best: Cut the rod into two pieces of length 2 each to gain revenue of 5 + 5 = 10

Cut Profit 4 9 1, 3 (1 + 8) = 9 2, 2 (5 + 5) = 10 3, 1 (8 + 1) = 9 1, 1, 2 (1 + 1 + 5) = 7 1, 2, 1 (1 + 5 + 1) = 7 2, 1, 1 (5 + 1 + 1) = 7 1, 1, 1, 1 (1 + 1 + 1 + 1) = 4
* */

public class RobCutting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        n = sc.nextInt();
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        System.out.println(rodCutting(arr, n, dp));
    }


    static int rodCutting(int[] arr, int n, int[] dp) {
        if (n == 0) return 0;
        if (n < 0) return Integer.MIN_VALUE;

        if (dp[n] != -1) return dp[n];

        int count = 0;
        for (int i = 1; i <= arr.length; i++) {
            count = Math.max(count, arr[i - 1] + rodCutting(arr, n - i, dp));
        }

        return dp[n] = count;
    }
}
