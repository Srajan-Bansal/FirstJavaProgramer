package hackcodingblocks.Heap;
import java.util.*;

public class Heap {
    private List<Integer> list;

    public Heap() {
        this.list = new ArrayList<>();
    }

    public void add(int item) {
        list.add(item);
        upHeapify(list.size() - 1);
    }

    private void upHeapify(int index) {
        int parent = (index - 1) / 2;
        if (list.get(parent) > list.get(index)) {
            swap(parent, index);
        }
    }

    private void swap(int parent, int index) {
        int item = list.get(parent);
        list.set(parent, list.get(index));
        list.set(index, item);
    }

    public int remove() {
        int remove = list.get(0);
        swap(0, list.size() - 1);
        list.remove(list.size() - 1);
        downHeapify(list.size() - 1);
        return remove;
    }

    private void downHeapify(int parent) {
        int left = 2 * parent + 1, right = 2 * parent + 2;
        int min = parent;
        if (list.get(left) < list.get(min)) min = left;
        if (list.get(right) < list.get(min)) min = right;
        if (min != parent) {
            swap(parent, min);
        }
    }

    public int get() {
        return list.get(0);
    }

    public void display() {
        System.out.println(list);
    }
}
