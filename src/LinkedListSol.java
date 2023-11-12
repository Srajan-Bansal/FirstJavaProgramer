import Kunal_Kushwaha.LinkedList.Questions.LinkedListLeetcode;
import ElementsOfProgramming.Trees.TreeLeetcode;

import java.util.*;

public class LinkedListSol implements LinkedListLeetcode {

    public static void main(String[] args) {
        LinkedListSol s = new LinkedListSol();

        ListNode head = new ListNode(1);
//        head.next = new ListNode(1);
//        head.next.next = new ListNode(1);
//        head.next.next.next = new ListNode(1);
//        head.next.next.next.next = new ListNode(1);

//        ListNode.display(s.insertGreatestCommonDivisors(head));
    }

    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) return null;

        ListNode first = sortList(head);
        ListNode second = sortList(findMiddle(head));
        return merge(first, second);
    }

    ListNode merge(ListNode first, ListNode second) {
        ListNode head = new ListNode();
        ListNode node = head;

        while (first != null && second != null) {
            if (first.val > second.val) {
                node.next = second;
                second = second.next;
            } else {
                node.next = first;
                first = first.next;
            }
            node = node.next;
        }

        node.next = (first != null) ? first : second;

        return head.next;
    }

    int findGCD(int a, int b) {
        if (b == 0) return a;
        return findGCD(b % a, a);
    }

    ListNode reverse(ListNode head) {
        ListNode prev = null, curr = head, next = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
        return head;
    }

    ListNode findMiddle(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }


}