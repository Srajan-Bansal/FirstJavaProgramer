package hackcodingblocks.Math.BitMasking;

import java.util.*;

/*
Given an array of n integers, find subarray whose xor is maximum. A subarray is a contiguous part of array.

Input Format
First line contains single integer n (1<=n<=1000). Next line contains n space separated integers

Constraints
1 <= n <= 1000
1 <= A[i] <=1000

Output Format
Print xor of the subarray whose xor of all elements in subarray is maximum over all subarrays.

Sample Input
4
1 2 3 4
Sample Output
7
* */

public class Maximum_XOR_Subarray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        int xorResult = 0;
        int startIdx = 0;
        int endIdx = 0;
        int answer = 0;

        while (endIdx < n) {
            xorResult ^= array[endIdx];

            while (xorResult < answer && startIdx < endIdx) {
                xorResult ^= array[startIdx];
                startIdx++;

                if (xorResult >= answer) {
                    break;
                }
            }

            answer = Math.max(answer, xorResult);
            endIdx++;
        }

        System.out.println(answer);
    }
}