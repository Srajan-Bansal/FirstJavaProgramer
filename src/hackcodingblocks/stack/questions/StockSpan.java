package hackcodingblocks.stack.questions;

import java.util.*;

public class StockSpan {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(stockSpan(arr)));
    }

    static int[] stockSpan(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int[] span = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            while (!stack.isEmpty() && arr[i] > arr[stack.peek()]) {
                System.out.println(stack + "start");
                stack.pop();
                System.out.println(stack + "end");
            }
            if (stack.isEmpty()) span[i] = 1;
            else span[i] = i - stack.peek();
            stack.push(i);
        }
        return span;
    }
}
