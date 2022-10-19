package ElementsOfProgramming.Queues;

public class CustomQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 16;
    protected int end = -1;

    public CustomQueue() {
        this(DEFAULT_SIZE);
    }

    public CustomQueue(int size) {
        this.data = new int[size];
    }

    public boolean isFull() {
        return end == data.length;
    }

    public boolean isEmpty() {
        return end == -1;
    }

    public void insert(int item) {
        if (isFull()) {
            System.out.println("Queue is Full");
            return;
        }
        data[++end] = item;
    }

    public int remove() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        int removed = data[0];
        for (int i = 1; i < end; i++) {
            data[i - 1] = data[i];
        }
        end--;
        return removed;
    }

    public int front() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        return data[0];
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }

        for (int i = 0; i < end; i++) {
            System.out.print(data[i] + " <- ");
        }
        System.out.print("END");
    }

    public static void main(String[] args) {

    }
}
