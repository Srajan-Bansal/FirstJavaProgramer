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

    public void insert(int item) throws QueueException{
        if (isFull()) {
            throw new QueueException("Circular Queue is Full");
        }
        data[++end] = item;
        end = end % data.length;
        size++;
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
