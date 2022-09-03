package Kunal_Kushwaha.LinkedList.Questions;

public class MiddleOfLinkedList implements LinkedListLeetcode{

    public ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

}
