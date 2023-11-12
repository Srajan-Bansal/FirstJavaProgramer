package hackcodingblocks.DP;

import java.util.*;

/*
Any programmer worth his salt would be familiar with the famous Longest Common Subsequence problem. Mancunian was asked to solve the same by an incompetent programmer. As expected, he solved it in a flash. To complicate matters, a twist was introduced in the problem.

In addition to the two sequences, an additional parameter k was introduced. A k-ordered LCS is defined to be the LCS of two sequences if you are allowed to change atmost k elements in the first sequence to any value you wish to. Can you help Mancunian solve this version of the classical problem?

Input Format
The first line contains three integers N, M and k, denoting the lengths of the first and second sequences and the value of the provided parameter respectively. The second line contains N integers denoting the elements of the first sequence. The third line contains M integers denoting the elements of the second sequence.

Constraints
1 <= N, M <= 2000
1 <= k <= 5
1 <= element in any sequence <= 109

Output Format
Print the answer in a new line.

Sample Input
5 5 1
1 2 3 4 5
5 3 1 4 2
Sample Output
3
* */

public class LCS_K_Ordered {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(), m = sc.nextInt(), k = sc.nextInt();

        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) arr1[i] = sc.nextInt();

        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) arr2[i] = sc.nextInt();

        int[][][] dp = new int[n][m][k + 1];
        for (int[][] arr : dp) {
            for (int[] row : arr) Arrays.fill(row, -1);
        }
        System.out.println(kOrderedLCS(arr1, 0, arr2, 0, k, dp));
    }


    static int kOrderedLCS(int[] arr1, int i, int[] arr2, int j, int k, int[][][] dp) {
        if (i == arr1.length || j == arr2.length) return 0;

        if (dp[i][j][k] != -1) return dp[i][j][k];

        int res = 0;
        if (arr1[i] == arr2[j]) {
            res = kOrderedLCS(arr1, i + 1, arr2, j + 1, k, dp) + 1;
        } else {
            res = kOrderedLCS(arr1, i + 1, arr2, j, k, dp);
            res = Math.max(res, kOrderedLCS(arr1, i, arr2, j + 1, k, dp));
            if (k > 0) {
                res = Math.max(res, kOrderedLCS(arr1, i + 1, arr2, j + 1, k - 1, dp) + 1);
            }
        }
        return dp[i][j][k] = res;
    }
}
