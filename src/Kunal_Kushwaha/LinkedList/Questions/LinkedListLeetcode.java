package Kunal_Kushwaha.LinkedList.Questions;

public interface LinkedListLeetcode {
    class ListNode {
        public int val;
        public ListNode next;

        public ListNode() {
        }

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        public static void display(ListNode head) {
            ListNode node = head;
            while (node != null) {
                System.out.print(node.val + " -> ");
                node = node.next;
            }
        }
    }
}
