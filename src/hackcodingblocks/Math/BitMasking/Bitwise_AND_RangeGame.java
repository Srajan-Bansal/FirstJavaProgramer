package hackcodingblocks.Math.BitMasking;

import java.util.*;
/*
Given two integers left and right that represent the range [left, right], print the bitwise AND of all numbers in this range, inclusive.

Input Format
First line contains two integers left and right.

Constraints
0 <= left <= right <= 231 - 1

Output Format
Print Bitwise AND of the given range.

Sample Input
5 7
Sample Output
4
Explanation
5 AND 6 AND 7 = 4.
* */

public class Bitwise_AND_RangeGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int left = scanner.nextInt();
        int right = scanner.nextInt();

        int result = 0;
        int bitPos = 31; // Maximum number of bits for integers

        for (int i = 31; i >= 0; i--) {
            int flag = 0;
            for (int j = left; j <= right; j++) {
                if ((j & (1 << i)) == 0) {
                    flag = 1;
                    break;
                }
            }

            if (flag == 0) {
                result |= (1 << i);
            }
        }

        System.out.println(result);
    }
}