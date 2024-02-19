package hackcodingblocks.Math.BitMasking;

import java.util.*;

/*
We are given an array containg n numbers. All the numbers are present twice except for one number which is only present once. Find the unique number without taking any extra spaces and in linear time. ( Hint - Use Bitwise )

Input Format
First line contains the number n. Second line contains n space separated number.

Constraints
n < 10^5

Output Format
Output a single line containing the unique number

Sample Input
7
1 1 2 2 3 3 4
Sample Output
4
Explanation
4 is present only once
* */

public class Unique_NumberI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        computeSolution(scanner);
    }

    public static void computeSolution(Scanner scanner) {
        int arrayLength = scanner.nextInt();

        int []inputArray = new int[arrayLength];
        for(int i = 0; i < inputArray.length; i++){
            inputArray[i] = scanner.nextInt();
        }

        int xorResult = inputArray[0];
        for(int i = 1; i < arrayLength; i++){
            xorResult ^= inputArray[i];
        }

        int rightMostSetBit = xorResult & -xorResult;
        int firstNumber = 0;
        int secondNumber = 0;

        for(int i = 0; i < arrayLength; i++){
            if((inputArray[i] & rightMostSetBit) == rightMostSetBit){
                firstNumber ^= inputArray[i];
            }
            else{
                secondNumber ^= inputArray[i];
            }
        }

        System.out.println(Math.min(firstNumber, secondNumber) + " " + Math.max(firstNumber, secondNumber));

    }
}