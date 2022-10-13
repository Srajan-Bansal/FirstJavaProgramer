package ElementsOfProgramming.Stack;

import java.util.Stack;

public class Palindrome {
    public static void main(String[] args) {
        String str = "aXa";

        System.out.println(palindrome(str));
    }

    static boolean palindrome(String str) {
        char[] arr = str.toCharArray();
        Stack<Character> stack = new Stack<>();

        int i = 0;
        while (arr[i] != 'X') {
            stack.push(arr[i]);
            i++;
        }
        i++;

        while (i < arr.length) {
            if (stack.isEmpty()) return false;
            if (stack.pop() != arr[i]) return false;
            i++;
        }
        return true;
    }
}
