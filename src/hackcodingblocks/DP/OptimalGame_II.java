package hackcodingblocks.DP;

import java.util.*;

/*
Piyush and Nimit are playing a coin game. They are given n coins with values x1, x2 …. xn where 'n' is always even. They take alternate terms. In each turn, a player picks either the first coin or the last coin from the row and removes it from the row. The value of coin is received by that player. Determine the maximum value that Piyush can win with if he moves first. Both the players play optimally.

Input Format
First line contains the number of coins 'n'.
Second line contains n space separated integers where ith index denotes the value of ith coin.

Constraints
1 < N <= 10000 , N is always even
0 <= Ai <= 1000000

Output Format
Print a single line with the maximum possible value that Piyush can win with.

Sample Input
4
1 2 3 4
Sample Output
6
Explanation
Piyush will pick the coin 4. Then Nimit can pick either 1 or 3. In both the cases Piyush picks coin 2 and wins with a total of 6.
* */

public class OptimalGame_II {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        long[][] dp = new long[n][n];
        for (long[] row : dp) Arrays.fill(row, -1);
        System.out.println(game(arr, 0, n - 1, dp));
    }

    static long game(int[] arr, int i, int j, long[][] dp) {
        if (i > j) return 0;

        if (dp[i][j] != -1) return dp[i][j];

        long ans1 = arr[i] + Math.min(game(arr, i + 2, j, dp), game(arr, i + 1, j - 1, dp));
        long ans2 = arr[j] + Math.min(game(arr, i + 1, j - 1, dp), game(arr, i, j - 2, dp));
        return dp[i][j] = Math.max(ans1, ans2);
    }
}