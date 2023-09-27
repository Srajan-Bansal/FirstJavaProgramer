package hackcodingblocks.LinkedList;

public class CustomLinkedList<T> {
    private Node head;
    private Node tail;
    private int size;

    class Node {
        T data;
        Node next;

        public Node(T data) {
            this.data = data;
        }

        public Node(T data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    void insertFirst(T item) {
        Node node = new Node(item);
        node.next = head;
        head = node;
        if (tail == null) {
            tail = head;
        }
        size++;
    }

    void insertLast(T item) {
        if (head == null) {
            insertFirst(item);
            return;
        }
        tail.next = new Node(item);
        tail = tail.next;
        size++;
    }

    void insert(T item, int pos) {
        if (pos == 0) {
            insertFirst(item);
            return;
        }
        if (pos == size) {
            insertLast(item);
            return;
        }
        Node ptr = head;
        for (int i = 1; i < pos; i++) {
            ptr = ptr.next;
        }
        ptr.next = new Node(item, ptr.next);
        size++;
    }

    T deleteFirst() throws Exception {
        if (head == null) {
            throw new Exception("LinkedList is Empty");
        }
        Node temp = head;
        T removed = head.data;
        head = head.next;
        temp.next = null;  // if we don't do it, then GARBAGE COLLECTOR will not collect it
        if (head == null) {
            tail = null;
        }
        return removed;
    }

    T deleteLast() throws Exception {
        if (size == 0) throw new Exception("LinkedList is Empty");
        if (size == 1) return deleteFirst();

        T removed = tail.data;
        tail = get(size - 2);
        tail.next = null;
        size--;
        return removed;
    }

    T delete(int index) throws Exception {
        if (size == 0) throw new Exception();
        if (index == 0) deleteFirst();
        else if (index == size) deleteLast();

        Node prev = get(index - 1);
        Node curr = prev.next;
        T curr_data = curr.data;
        prev.next = curr.next;
        curr.next = null;
        size--;
        return curr_data;
    }

    Node get(int index) {
        Node node = head;
        for (int i = 1; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    void display() {
        Node node = head;
        while (node != null) {
            System.out.print(node.data + " -> ");
            node = node.next;
        }
        System.out.println("END");
    }

    public static void main(String[] args) {
        CustomLinkedList<String> list = new CustomLinkedList<>();
        list.insertFirst("vwdv");
        list.insertFirst("wv");
        list.display();
    }
}