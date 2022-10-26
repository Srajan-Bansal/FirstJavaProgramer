package ElementsOfProgramming.Queues;

public class DynamicQueue extends CircularQueue {

    public DynamicQueue() {
        super();
    }

    public DynamicQueue(int size) {
        super();
    }

    public void insert(int item) {
        if (isFull()) {
            int[] temp = new int[2 * data.length];

            for (int i = 0; i < data.length; i++) {
                temp[i] = data[(front + i) % data.length];
            }
            front = -1;
            end = data.length;

            data = temp;
        }
        super.insert(item);
    }
}
