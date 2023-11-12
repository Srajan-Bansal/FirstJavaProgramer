package hackcodingblocks.DP;

import java.util.*;

/*
You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed. All houses at this place are arranged in a circle. That means the first house is the neighbor of the last one. Meanwhile, adjacent houses have a security system connected, and it will automatically contact the police if two adjacent houses were broken into on the same night.

Given an integer array nums representing the amount of money of each house, Print the maximum amount of money you can rob tonight without alerting the police.

Input Format
First line takes an integer N(size of array)
Second line containing n space separated integer describing array

Constraints
1 <= N <= 100
0 <= nums[i] <= 1000

Output Format
Print the maximum amount of money you can rob tonight without alerting the police.

Sample Input
3
2 3 2
Sample Output
3
Explanation
You cannot rob house 1 (money = 2) and then rob house 3 (money = 2), because they are adjacent houses.
* */

public class HouseRob_II {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        int ans = Math.max(rob(arr, 0, n - 2), rob(arr, 1, n - 1));
        System.out.println(ans);
    }

    static int rob(int[] arr, int low, int high) {
        int end = 0, count = 0;
        for (int i = low; i <= high; i++) {
            count = Math.max(arr[i] + end, end = count);
        }

        return count;
    }
}
