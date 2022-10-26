package ElementsOfProgramming.Queues;

public class CircularQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 16;
    protected int front = -1;
    protected int end = -1;
    private int size = -1;

    public CircularQueue() {
        this(DEFAULT_SIZE);
    }

    public CircularQueue(int size) {
        this.data = new int[size];
    }

    public boolean isFull() {
        return size == data.length;
    }

    public boolean isEmpty() {
        return size == -1;
    }

    public void insert(int item){
        if (isFull()) {
            expand();
        }
        data[++end] = item;
        end = end % data.length;
        size++;
    }

    public void expand() {
        int[] temp = new int[2 * data.length];
        for (int i = 1; i < data.length; i++) {
            data[i - 1] = data[i];
        }
        front = -1;
        end = data.length - 1;
        data = temp;
    }

    public int remove() {
        if (isEmpty()) {
            System.out.println("Circular queue is Empty");
            return -1;
        }
        int removed = data[front++];
        front = front % data.length;
        size--;
        return removed;
    }

    public int getFront() {
        if (isEmpty()) {
            return -1;
        }
        return data[front];
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Empty");
            return;
        }
        int i = front;
        do {
            System.out.print(data[i] + " -> ");
            i++;
            i %= data.length;
        } while (i != end);
        System.out.println("END");
    }

}
