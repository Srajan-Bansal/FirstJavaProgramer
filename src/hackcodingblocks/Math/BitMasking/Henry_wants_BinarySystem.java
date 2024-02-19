package hackcodingblocks.Math.BitMasking;

import java.util.*;
/*
King Henry VIII wants to break away from the catholic church. He has found an alternate for most of the catholic ways. Now finally he wants to change the decimal system.

Someone from his court suggests he should implement the binary number system. So he hands you the task of finding the number of 1s in each number in its binary form till a number N.

Given an integer n, Print an array ans of length n + 1 such that for each i (0 <= i <= n), ans[i] is the number of 1's in the binary representation of i.

Note: It is very easy to come up with a solution with a runtime of O(n log n). Can you do it in linear time O(n) and possibly in a single pass? Can you do it without using any built-in function (i.e., like _builtinpopcount in C++)?

Input Format
First line takes an integer N(size of array)

Constraints
0 <= n <= 10^5

Output Format
Print an array ans, where each ans[i] is the number of 1's in the binary representation of i.

Sample Input
5
Sample Output
0 1 1 2 1 2
Explanation
0 --> 0
1 --> 1
2 --> 10
3 --> 11
4 --> 100
5 --> 101
* */

public class Henry_wants_BinarySystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int j = 0;

        while (j <= n) {
            int count = 0;
            int i = j;
            while (i != 0) {
                int rightMostSetBit = i & -i;
                i -= rightMostSetBit;
                count++;
            }

            System.out.print(count + " ");
            j++;
        }
        System.out.println();
    }
}