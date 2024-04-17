import ElementsOfProgramming.Trees.LevelOrder;
import Knowledge.Trie;
import Kunal_Kushwaha.LinkedList.Questions.LinkedListLeetcode;
import ElementsOfProgramming.Trees.TreeLeetcode;
import hackcodingblocks.Graph.GraphLeetcode;

import java.util.*;

public class Solution implements LinkedListLeetcode, TreeLeetcode, GraphLeetcode {

    static void inOrder(TreeNode root) {
        if (root == null) return;
        inOrder(root.left);
        System.out.print(root.val + " -> ");
        inOrder(root.right);
    }

    TrieNode root = new TrieNode();

    public void insert(String word) {
        TrieNode node = root;
        for (char ch : word.toCharArray()) {
            int index = ch - 'a';
            if (node.children[index] == null) {
                node.children[index] = new TrieNode();
            }
            node = node.children[index];
        }
        node.isWord = true;
    }

    public boolean search(String word) {
        TrieNode node = root;
        for (char ch : word.toCharArray()) {
            int index = ch - 'a';
            if (node.children[index] == null) {
                return false;
            }
            node = node.children[index];
        }
        return node.isWord;
    }

    class TrieNode {
        boolean isWord;
        TrieNode[] children;

        TrieNode() {
            isWord = false;
            children = new TrieNode[26];
        }
    }

    public static void main(String[] args) {
//        TreeNode root = new TreeNode(1);
//        root.left = new TreeNode(2);
//        root.left.left = new TreeNode(4);
//        root.left.right = new TreeNode(6);
//        root.right = new TreeNode(3);
//        root.right.left = new TreeNode(5);
//        root.right.right = new TreeNode(7);
//        TreeLeetcode.printTree(root);

        Solution s = new Solution();
        ListNode root = new ListNode(1);
        root.next = new ListNode(2);
        root.next.next = new ListNode(3);
        root.next.next.next = new ListNode(4);

        s.reorderList(root);
//        Integer[] nums = {1,2,4,5,3};
//        TreeNode root = TreeLeetcode.levelOrderConstructTree(nums);
//        TreeLeetcode.printTree(root);
//        System.out.println(s.isCousins(root, 4, 5));

    }

    public void reorderList(ListNode head) {
        display(head);

        ListNode tempMid = middle(head);
        ListNode middle = tempMid.next;
        tempMid.next = null;
        ListNode mid = reverse(middle);
        ListNode node = head;

        display(middle);
        display(node);
        display(mid);

        ListNode newHead = new ListNode();
        ListNode ptr = newHead;
        while (node != null && mid != null) {
            ptr.next = node;
            ptr = ptr.next;
            node = node.next;

            ptr.next = mid;
            mid = mid.next;
            ptr = ptr.next;
        }

        if (node != null) {
            ptr.next = node;
        } else ptr.next = mid;

        head = newHead.next;
        display(head);
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

    ListNode middle(ListNode head) {
        ListNode slow = head, fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    void display(ListNode head) {
        ListNode node = head;
        while (node != null) {
            System.out.print(node.val + "->");
            node = node.next;
        }
        System.out.println();
    }
}