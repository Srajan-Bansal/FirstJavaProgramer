package ElementsOfProgramming.Stack;

import java.util.Arrays;

public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 16;
    private int ptr;

    public CustomStack() {
        this(DEFAULT_SIZE);
        this.ptr = -1;
    }

    public CustomStack(int size) {
        this.data = new int[size];
        this.ptr = -1;
    }

    public boolean isFull() {
        return ptr == data.length - 1;
    }

    public boolean isEmpty() {
        return ptr == -1;
    }

    public void push(int item) {
        if (isFull()) {
            System.out.println("Stack is Full");
            return;
        }
        data[++ptr] = item;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return data[ptr--];
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return data[ptr];
    }

    public int getPtr() {
        return ptr + 1;
    }

    @Override
    public String toString() {
        return "CustomStack{" +
                "data=" + Arrays.toString(data) +
                ", ptr=" + ptr +
                '}';
    }

    public static void main(String[] args) {
        CustomStack stack = new CustomStack(4);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println(stack.getPtr());
        System.out.println(stack);
    }
}
