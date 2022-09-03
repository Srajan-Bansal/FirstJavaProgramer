package Kunal_Kushwaha.LinkedList.Questions;

public class ReverseLinkedList {
    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    Node head;
    private Node tail;
    private int size;

    public void reverse(Node node) {
        if (node == tail) {
            head = tail;
            return;
        }
        reverse(node.next);

        tail.next = node;
        tail = node;
        tail.next = null;
    }

    // in-place
    public void reverse() {
        if (head == null) {
            return;
        }

        Node prev = null;
        Node present = head;
        Node next = present.next;

        while (present != null) {
            present.next = prev;
            prev = present;
            present = next;

            if (next != null) {
                next = next.next;
            }
        }
        head = prev;
    }
}
