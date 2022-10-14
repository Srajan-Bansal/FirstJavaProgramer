package ElementsOfProgramming.Stack;

public class TwoStack_Array {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    private final int size;
    private int ptr1;
    private int ptr2;

    public TwoStack_Array() {
        this.data = new int[DEFAULT_SIZE];
        this.size = DEFAULT_SIZE;
        ptr1 = -1;
        ptr2 = data.length;
    }

    public TwoStack_Array(int size) throws Exception {
        if (size < 2) throw new Exception("size < 2 is not permissible");
        this.data = new int[size];
        this.size = size;
        ptr1 = -1;
        ptr2 = size;
    }

    public void push(int stackId, int item) throws Exception {
        if (ptr1 == ptr2 - 1) throw new Exception("Array is Full");
        if (stackId == 1) {
            data[ptr1++] = item;
        } else {
            data[ptr2--] = item;
        }
    }

    public int pop(int stackId) throws Exception {
        if (stackId == 1) {
            if (ptr1 == -1) throw new Exception("First Stack is Empty");
            return data[ptr1--];
        } else {
            if (ptr2 == size) throw new Exception("Second Stack is Empty");
            return data[ptr2++];
        }
    }

    public int top(int stackId) throws Exception {
        if (stackId == 1) {
            if (ptr1 == -1) throw new Exception("First stack is Empty");
            return data[ptr1];
        } else {
            if (ptr2 == size) throw new Exception("Second stack is Empty");
            return data[ptr2];
        }
    }

    public boolean isEmpty(int stackId) {
        if (stackId == 1) {
            return ptr1 == -1;
        } else {
            return ptr2 == size;
        }
    }
}
