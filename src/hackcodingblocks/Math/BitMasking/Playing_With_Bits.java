package hackcodingblocks.Math.BitMasking;

import java.util.*;

/*
Prateek Bhayia likes to play with bits. One day Prateek bhayia decides to assign a task to his student Sanya. You have help Sanya to complete this task. Task is as follows - Prateek Bhayia gives Q queries each query containing two integers a and b. Your task is to count the no of set-bits in for all numbers between a and b (both inclusive)

Input Format
Read Q - No of Queries, Followed by Q lines containing 2 integers a and b.

Constraints
Q,a,b are integers.

Output Format
Q lines, each containing an output for your query.

Sample Input
2
1 1
10 15
Sample Output
1
17
* */

public class Playing_With_Bits {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int testCaseCount = scanner.nextInt();

        while (testCaseCount-- > 0) {
            computeSolution(scanner);
        }
    }

    public static void computeSolution(Scanner scanner) {
        int lowerLimit = scanner.nextInt();
        int upperLimit = scanner.nextInt();
        int totalCount = 0;

        for (int num = lowerLimit; num <= upperLimit; num++) {
            int temp = num;
            while (temp != 0) {
                int rightMostSetBit = temp & -temp;
                temp -= rightMostSetBit;
                totalCount++;
            }
        }

        System.out.println(totalCount);
    }
}

