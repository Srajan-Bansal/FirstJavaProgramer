package Kunal_Kushwaha.Stack;

import java.util.Arrays;

public class CustomStack {
    protected  int[] data;
    private static final int DEFAULT_SIZE = 10;
    int ptr = 0;
    public CustomStack() {
        this(DEFAULT_SIZE);
    }

    public CustomStack(int size) {
        this.data = new int[size];
    }

    public boolean push(int item) throws StackException{
        if (isFull()) {
            throw new StackException("Cannot push to a full Stack!!");
        }
        data[ptr++] = item;
        return true;
    }

    public int pop() throws StackException{
        if (isEmpty()) {
            throw new StackException("Cannot pop from an empty Stack!!");
        }
        return data[ptr--];
    }

    public int peek(int item) throws StackException {
        if (isEmpty()) {
            throw new StackException("Cannot peek from an empty Stack!!");
        }
        return data[ptr];
    }

    public boolean isFull() {
        return ptr == data.length;
    }
    public boolean isEmpty() {
        return ptr == 0;
    }

    public int size() {
        return ptr;
    }

    @Override
    public String toString() {
        return "CustomStack{" +
                "data=" + Arrays.toString(data) +
                ", ptr=" + ptr +
                '}';
    }

    public static void main(String[] args) throws StackException {
        CustomStack stack = new CustomStack(3);

        stack.push(1);
        stack.push(2);
        stack.push(2);

        System.out.println(stack);
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
    }
}
