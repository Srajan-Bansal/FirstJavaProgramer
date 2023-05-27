package hackcodingblocks.stack.questions;

import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
        int[] arr = {11, 2, 3, 23, 13, 9, 15};
        nextGreaterElement(arr);
    }

    static void nextGreaterElement(int[] arr) {
        int[] ans = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            while (!stack.isEmpty() && arr[i] > arr[stack.peek()]) {
                ans[stack.pop()] = arr[i];
            }
            stack.push(i);
        }
        while (!stack.isEmpty()) {
            ans[stack.pop()] = -1;
        }
        for (int i = 0; i < ans.length; i++) {
            System.out.println(arr[i] + "," + ans[i]);
        }
    }
}
