package Kunal_Kushwaha.LinkedList.Questions;

public class Palindrome implements LinkedListLeetcode{

    public boolean isPalindrome(ListNode head) {
        ListNode mid = middleNode(head);
        ListNode headSecond = reverseList(mid);
        ListNode reReverseHead = headSecond;

        // compare both the half's
        while (head != null && headSecond != null) {
            if (head.val != headSecond.val) {
                return false; // break;
            }
            head = head.next;
            headSecond = headSecond.next;
        }

        reverseList(reReverseHead);

        return true; // head == null || headSecond = null
    }

    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode present = head;
        ListNode next = present.next;

        while (present != null) {
            present.next = prev;
            prev = present;
            present = next;
            if (next != null) {
                next = next.next;
            }
        }
        head = prev;
        return head;
    }

}
