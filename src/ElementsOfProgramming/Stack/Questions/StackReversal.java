package ElementsOfProgramming.Stack.Questions;

import java.util.Stack;

public class StackReversal {
    static void reverse(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }
        int item = stack.pop();
        reverse(stack);
        insert(stack, item);
    }

    static void insert(Stack<Integer> stack, int data) {
        if (stack.isEmpty()) {
            stack.push(data);
            return;
        }
        int item = stack.pop();
        insert(stack, data);
        stack.push(item);
    }

}
