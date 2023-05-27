package hackcodingblocks.LinkedList;

public class CustomLinkedList {
    private Node head;
    private Node tail;
    private int size;

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    void insertFirst(int item) {
        Node node = new Node(item);
        node.next = head;
        head = node;
        if (tail == null) {
            tail = head;
        }
        size++;
    }

    void insertLast(int item) {
        if (head == null) {
            insertFirst(item);
            return;
        }
        tail.next = new Node(item);
        tail = tail.next;
        size++;
    }

    void insert(int item, int pos) {
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

    int deleteFirst() throws Exception {
        if (head == null) {
            throw new Exception("LinkedList is Empty");
        }
        Node temp = head;
        int removed = head.data;
        head = head.next;
        temp.next = null;  // if we don't do it, then GARBAGE COLLECTOR will not collect it
        if (head == null) {
            tail = null;
        }
        return removed;
    }

    int deleteLast() throws Exception {
        if (size == 0) throw new Exception("LinkedList is Empty");
        if (size == 1) return deleteFirst();

        int removed = tail.data;
        tail = get(size - 2);
        tail.next = null;
        size--;
        return removed;
    }

    int delete(int index) throws Exception {
        if (size == 0) throw new Exception();
        if (index == 0) deleteFirst();
        else if (index == size) deleteLast();

        Node prev = get(index - 1);
        Node curr = prev.next;
        int curr_data = curr.data;
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
}