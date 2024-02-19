package hackcodingblocks.Math.BitMasking;

import java.util.*;

/*
We are given an array containg n numbers. All the numbers are present thrice except for one number which is only present once. Find the unique number. Only use - bitwise operators, and no extra space.

Input Format
First line contains the number n. Second line contains n space separated number.

Constraints
N < 10^5

Output Format
Output a single line containing the unique number

Sample Input
7
1 1 1 2 2 2 3
Sample Output
3
Explanation
3 is present only once
* */

public class Unique_NumberIII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println(findSolution(array));
    }

    public static int findSolution(int[] array) {
        int tn = Integer.MAX_VALUE;
        int thp1 = 0;
        int thp2 = 0;

        for (int i = 0; i < array.length; i++) {
            int currentWithTn = array[i] & tn;
            int currentWithThp1 = array[i] & thp1;
            int currentWithThp2 = array[i] & thp2;

            tn = tn & (~currentWithTn);
            thp1 = thp1 | currentWithTn;

            thp1 = thp1 & (~currentWithThp1);
            thp2 = thp2 | currentWithThp1;

            thp2 = thp2 & (~currentWithThp2);
            tn = tn | currentWithThp2;
        }

        return thp1;
    }
}