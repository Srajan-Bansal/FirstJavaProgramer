package Kunal_Kushwaha.LinkedList.Questions;

public class MergeSortedList implements LinkedListLeetcode {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if (list1 == null) {
            return list2;
        } else if (list2 == null) {
            return list1;
        }

        ListNode res = new ListNode(-1);

        if (list1.val < list2.val) {
            res.next = list1;
            list1 = list1.next;
        } else {
            res.next = list2;
            list2 = list2.next;
        }

        ListNode ptr = res.next;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                ptr.next = list1;
                ptr = ptr.next;
                list1 = list1.next;
            } else {
                ptr.next = list2;
                ptr = ptr.next;
                list2 = list2.next;
            }
        }

        while (list1 != null) {
            ptr.next = list1;
            ptr = ptr.next;
            list1 = list1.next;
        }
        while (list2 != null) {
            ptr.next = list2;
            ptr = ptr.next;
            list2 = list2.next;
        }

        return res.next;
    }
}
