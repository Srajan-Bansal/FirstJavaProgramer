package hackcodingblocks.DP;

import java.util.*;

/*
You are provided a sequence of number. All numbers of that sequence is in increasing order (including 1) and whose only prime factors are 2, 3 or 5 (except 1). You need to find the nth number of that sequence.

Input Format
First line contains integer t which is number of test case. For each test case, it contains an integer n.

Constraints
1<=t<=100 1<=n<=10000

Output Format
Print nth number of that sequence.

Sample Input
2
7
10
Sample Output
8
12
Explanation
Sequence : 1, 2, 3, 4, 5, 6, 8, 9, 10, 12, …..
* */

public class UglyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long[] dp = new long[n];
            dp[0] = 1;

            long x2 = 2, y3 = 3, z5 = 5;
            int a = 0, b = 0, c = 0;

            for (int i = 1; i < n; i++) {
                long min = Math.min(x2, Math.min(y3, z5));
                dp[i] = min;

                if (x2 == min) x2 = dp[++a] * 2;
                if (y3 == min) y3 = dp[++b] * 3;
                if (z5 == min) z5 = dp[++c] * 5;
            }
            System.out.println(dp[n - 1]);
        }
    }
}