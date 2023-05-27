package hackcodingblocks.stack.questions;

import java.util.Stack;

public class LastValue {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

//        System.out.println(lastValue(stack));
        reverse(stack, stack.peek());
        System.out.println(stack);
    }

    static void reverse(Stack<Integer> stack, int ele) {
        if (stack.isEmpty()) {
            stack.push(ele);
            return;
        }
        int item = stack.pop();
        reverse(stack, item);
    }

    static void insert(Stack<Integer> stack, int ele) {
        if (stack.isEmpty()) {
            stack.push(ele);
            return;
        }
        int item = stack.pop();
        insert(stack, item);
        stack.push(item);
    }

    static int lastValue(Stack<Integer> stack) {
        if (stack.size() == 1) {
            return stack.peek();
        }
        int item = stack.pop();
        int x = lastValue(stack);
        stack.push(item);
        return x;
    }
}
