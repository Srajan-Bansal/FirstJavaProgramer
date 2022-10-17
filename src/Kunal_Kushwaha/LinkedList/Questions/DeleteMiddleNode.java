package Kunal_Kushwaha.LinkedList.Questions;

public class DeleteMiddleNode implements LinkedListLeetcode {

    public ListNode deleteMiddleNode(ListNode head) {
        if (head.next == null) {
            return null;
        }
        ListNode slow = head;
        ListNode fast = head.next.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = slow.next.next;

        return slow;
    }
}
