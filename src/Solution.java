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
//        Integer[] nums = {1,2,4,5,3};
//        TreeNode root = TreeLeetcode.levelOrderConstructTree(nums);
//        TreeLeetcode.printTree(root);
//        System.out.println(s.isCousins(root, 4, 5));

    }
}