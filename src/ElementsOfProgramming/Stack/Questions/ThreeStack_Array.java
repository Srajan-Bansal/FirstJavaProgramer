package ElementsOfProgramming.Stack.Questions;

public class ThreeStack_Array {
    protected int[] data;
    private static final int DEFAULT_SIZE = 9;
    private final int size;
    private int ptr1;
    private int ptr2;
    private final int base_ptr3;
    private int ptr3;

    public ThreeStack_Array() {
        this.data = new int[DEFAULT_SIZE];
        this.size = DEFAULT_SIZE;
        ptr1 = -1;
        ptr2 = size;
        base_ptr3 = size / 2;
        ptr3 = base_ptr3;
    }

    public ThreeStack_Array(int size) throws Exception {
        if (size < 3) throw new Exception("size < 3 is not permissible");
        this.data = new int[size];
        this.size = size;
        ptr1 = -1;
        ptr2 = size;
        base_ptr3 = size / 2;
        ptr3 = base_ptr3;
    }

    public void push(int stackId, int item) throws Exception {
        if (stackId == 1) {
            if (ptr1 == base_ptr3 - 1) {
                if (stack3IsRightShiftable()) {
                    shiftStack3toRight();
                    data[++ptr1] = item;
                } else throw new Exception("Stack 1 is Full");
            } else data[++ptr1] = item;
        } else if (stackId == 2) {
            if (ptr2 == ptr3 + 1) {
                if (stack3IsLeftShiftable()) {
                    shiftStack3toLeft();
                    data[--ptr2] = item;
                } else throw new Exception("Stack 2 is Full");
            } else data[--ptr2] = item;
        } else {
            if (ptr3 == ptr2 - 1) {
                if (stack3IsLeftShiftable()) {
                    shiftStack3toLeft();
                    data[++ptr3] = item;
                } else throw new Exception("Stack 3 is Full");
            } else data[++ptr3] = item;
        }
    }

    public int pop(int stackId) throws Exception {
        if (stackId == 1) {
            if (ptr1 == -1) throw new Exception("Stack 1 is Empty");
            return data[ptr1--];
        } else if (stackId == 2) {
            if (ptr2 == size) throw new Exception("Stack 2 is Empty");
            return data[ptr2++];
        } else {
            if (ptr3 == base_ptr3) throw new Exception("Stack 3 is Empty");
            return data[ptr3--];
        }
    }

    public int top(int stackId) throws Exception {
        if (stackId == 1) {
            if (ptr1 == -1) throw new Exception("Stack 1 is Empty");
            return data[ptr1];
        } else if (stackId == 2) {
            if (ptr2 == size) throw new Exception("Stack 2 is Empty");
            return data[ptr2];
        } else {
            if (ptr3 == base_ptr3) throw new Exception("Stack 3 is Empty");
            return data[ptr3];
        }
    }

    public boolean isEmpty(int stackId) {
        if (stackId == 1) return ptr1 == -1;
        else if (stackId == 2) return ptr2 == size;
        else return ptr3 == base_ptr3;
    }

    public boolean stack3IsRightShiftable() {
        return ptr3 < ptr2 - 1;
    }

    public boolean stack3IsLeftShiftable() {
        return ptr1 + 1 < base_ptr3;
    }

    public void shiftStack3toRight() {
        for (int i = ptr3 + 1; i >= base_ptr3 + 1; i--) {
            data[i] = data[i - 1];
        }
        ptr3++;
    }

    public void shiftStack3toLeft() {
        for (int i = base_ptr3 - 1; i < ptr3; i++) {
            data[i] = data[i + 1];
        }
        ptr3--;
    }

    public String toString() {
        StringBuilder s = new StringBuilder("[");
        for (int i = 0; i <= ptr1; i++){
            s.append(", ").append(data[i]);
        } s.append("]").append(", [");
        for (int i = base_ptr3 - 1; i <= ptr3; i++){
            s.append(", ").append(data[i]);
        } s.append("]").append(", [");
        for (int i = ptr3 + 1; i < size; i++){
            s.append(", ").append(data[i]);
        }
        return s + "]";
    }

    public static void main(String[] args) throws Exception {
        ThreeStack_Array arr = new ThreeStack_Array(9);

        arr.push(1, 1);
//        arr.push(1, 2);
//        arr.push(1, 3);
//        arr.push(1, 4);

        arr.push(3, 1);
        arr.push(3, 2);
        arr.push(3, 2);
        arr.push(3, 2);
//        arr.push(3, 3);

//        arr.push(2, 4);
        arr.push(2, 1);
        arr.push(2, 2);
        arr.push(2, 3);

        System.out.println(arr);
    }
}
