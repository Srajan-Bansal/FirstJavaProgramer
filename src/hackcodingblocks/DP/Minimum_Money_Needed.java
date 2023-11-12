package hackcodingblocks.DP;

import java.util.*;
/*
Cody went to the market to buy some oranges for his N friends. There he finds oranges wrapped in packets, with the price of i^th packet as val[i].
Now he wants to buy exactly W kg oranges, so he wants you to tell him what minimum price he should pay to buy exactly W kg oranges. Weight of i^th packet is i kg. If price of i^th packet is -1 then this packet is not available for sale. The market has infinite supply of orange packets.

Input Format
First line of input contains two space separated integers N and W, the number of friend he has and the amount of Oranges in kilograms which he should buy.

The second line contains W space separated integers in which the i^th integer specifies the price of a ‘i’kg apple packet. A value of -1 denotes that the corresponding packet is unavailable

Constraints
1 <= N,W,val[ ] <= 10^3

Output Format
Output a single integer denoting the minimum price Code should pay to get exactly W kg oranges. Else print -1 if it is not possible to fill the bag.

Sample Input
5 5
1 2 3 4 5
Sample Output
5
* */

public class Minimum_Money_Needed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();

        int[] arr = new int[m + 1]; // Prices for different weights
        for (int i = 1; i <= m; i++) arr[i] = sc.nextInt();

        int[] dp = new int[m + 1];
        Arrays.fill(dp, -1); // Initialize memoization array

        int min = findPrice(arr, n, m, dp);
        System.out.println(min >= Integer.MAX_VALUE ? -1 : min);
    }

    static int findPrice(int[] arr, int n, int m, int[] dp) {
        if (m == 0) return 0;

        if (dp[m] != -1) return dp[m];

        int min = Integer.MAX_VALUE;
        for (int i = 1; i <= m; i++) {
            if (arr[i] != -1) {
                if (m - i >= 0) {
                    int val = findPrice(arr, n, m - i, dp);
                    if (val != Integer.MAX_VALUE) {
                        min = Math.min(min, arr[i] + val);
                    }
                }
            }
        }
        return dp[m] = min;
    }

    // BU
    public static int minPriceOfOranges(int N, int W, int[] prices) {
        int[] dp = new int[W + 1];
        Arrays.fill(dp, Integer.MAX_VALUE); // Initialize with maximum value

        dp[0] = 0; // Base case: cost to get 0 kg oranges is 0

        for (int weight = 1; weight <= W; weight++) {
            for (int packetWeight = 1; packetWeight <= weight; packetWeight++) {
                if (prices[packetWeight] != -1 && dp[weight - packetWeight] != Integer.MAX_VALUE) {
                    dp[weight] = Math.min(dp[weight], dp[weight - packetWeight] + prices[packetWeight]);
                }
            }
        }

        return dp[W];
    }
}
