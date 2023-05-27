package hackcodingblocks.queue;

public class CircularQueue {
    private int[] arr;
    private int front;
    private int size;

    public CircularQueue(int n) {
        this.arr = new int[n];
        this.size = 0;
        this.front = 0;
    }

    public boolean isFull() {
        return size == arr.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void Enqueue(int ele) throws Exception {
        if (isFull()) throw new Exception("Queue is Full");

        int end = (front + size) % arr.length;
        arr[end] = ele;
        size++;
    }

    public int Dequeue() throws Exception {
        if (isEmpty()) throw new Exception("Queue is Empty");

        int removed = arr[(front++) % arr.length];
        size--;
        return removed;
    }

    public int getFront() throws Exception {
        if (isEmpty()) throw new Exception("Queue is Empty");
        return arr[front];
    }

    public void Display() {
        for (int i = 0; i < size; i++) {
            int idx = (front + i) % arr.length;
            System.out.println(arr[idx] + " ");
        }
        System.out.println();
    }
}
