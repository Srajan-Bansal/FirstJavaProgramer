package hackcodingblocks.DP;

import java.util.Arrays;
import java.util.Scanner;

/*
It's Valentine's Day in Russia today. as we all know number of girls in Russia is more than number of boys 😜 hence boys have an extra advantage while choosing girl for the valentine evening. Each boy has certain number of chocolates and each girl has certain number of candies. Now you being the anchor of evening wants to pair all the boys with girls such that the sum of absolute difference between boy's chocolate and girl's candy in a pair is minimized. Ofcourse some of the girls will remain unpaired but that's okay as we are in Russia 😜

Input Format
The first line consists of two integers N and M. then follow N integers in second line. Then follow M integers in third line. M >= N

Constraints
1 <= N <= 5000
1 <= M <= 5000
M >= N
1 <= chocolates <= 1000000
1 <= candies <= 1000000

Output Format
The only line which consists of required sum of absolute differences.

Sample Input
2 5
4 5
1 2 3 4 5
Sample Output
0
Explanation
we can pair boy numbered 1 with girl numbered 4 and boy numbered 2 with girl numbered 5
* */

public class ValintineMagic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();

        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) arr1[i] = sc.nextInt();

        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) arr2[i] = sc.nextInt();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int[][] dp = new int[n][m];
        System.out.println(russian(arr1, 0, arr2, 0, dp));
    }

    static int russian(int[] arr1, int i, int[] arr2, int j, int[][] dp) {
        if (i == arr1.length) return 0;
        if (j == arr2.length) return 10000000;

        if (dp[i][j] != 0) return dp[i][j];

        int take = Math.abs(arr1[i] - arr2[j]) + russian(arr1, i + 1, arr2, j + 1, dp);
        int donot = russian(arr1, i, arr2, j + 1, dp);

        return dp[i][j] = Math.min(take, donot);
    }
}
