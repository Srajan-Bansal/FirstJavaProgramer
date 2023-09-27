package hackcodingblocks.LinkedList;

import java.util.*;

public class MonuLinkedList {
    static class Node {
        int val;
        Node next;

        public Node() {
        }

        public Node(int val) {
            this.val = val;
        }
    }

    public Node head;
    private static int size = 0;
    private Node tail;

    public Node addLast(int item) {
        Node node = new Node(item);
        if (size == 0) head = node;
        else tail.next = node;
        tail = node;
        size++;
        return node;
    }

    public static void sumOfLL(Node head1, Node head2) {
        if (head1 == null) {
            while (head2 != null) {
                System.out.print(head2.val + " ");
                head2 = head2.next;
            }
            return;
        } else if (head2 == null) {
            while (head1 != null) {
                System.out.print(head1.val + " ");
                head1 = head1.next;
            }
            return;
        }

        Node node1 = reverse(head1), node2 = reverse(head2);

        MonuLinkedList main = new MonuLinkedList();
        Node head = main.addLast(0);
        Node node = head;
        int carry = 0;
        while (node1 != null && node2 != null) {
            int sum = node1.val + node2.val + carry;
            node.next = new Node(sum % 10);
            carry = sum / 10;

            node = node.next;
            node1 = node1.next;
            node2 = node2.next;
        }

        while (node1 != null) {
            int sum = node1.val + carry;
            node.next = new Node(sum % 10);
            carry = sum / 10;
            node1 = node1.next;
            node = node.next;
        }

        while (node2 != null) {
            int sum = node2.val + carry;
            node.next = new Node(sum % 10);
            carry = sum / 10;
            node2 = node2.next;
            node = node.next;
        }

        if (carry != 0) node.next = new Node(carry);

        head = reverse(head.next);
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }

    static Node reverse(Node head) {
        Node prev = null, curr = head, next = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
        return head;
    }

    public Node intersectionOfTwoLinkedLists(Node head1, Node head2) {
        Node node1 = head1, node2 = head2;
        while (node1 != node2) {
            if (node1.next == null) node1 = head2;
            else node1 = node1.next;

            if (node2.next == null) node2 = head1;
            else node2 = node2.next;
        }

        return node1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();

        MonuLinkedList main1 = new MonuLinkedList();
        for (int i = 0; i < n; i++) {
            main1.addLast(sc.nextInt());
        }

        MonuLinkedList main2 = new MonuLinkedList();
        for (int i = 0; i < m; i++) {
            main2.addLast(sc.nextInt());
        }

        sumOfLL(main1.head, main2.head);
    }
}