import ElementsOfProgramming.Trees.TreeLeetcode;import Knowledge.Trie;import Kunal_Kushwaha.LinkedList.Questions.LinkedListLeetcode;import hackcodingblocks.DP.Important;import java.util.*;public class Trail implements LinkedListLeetcode, TreeLeetcode, Trie {    public static void main(String[] args) {        Trail s = new Trail();//        Integer[] arr = {1, 2, 3, null, null, 4, 5};//        TreeNode root = TreeLeetcode.levelOrderConstructTree(arr);        Integer[] arr = {0,1,2,3,4,3,4};        TreeNode root = TreeLeetcode.arrayToTree(arr);        TreeLeetcode.printTree(root);        System.out.println(s.smallestFromLeaf(root));    }    public String smallestFromLeaf(TreeNode root) {        smallest(root, new StringBuilder());        return min;    }    String min = "~";    public void smallest(TreeNode root, StringBuilder sb) {        if (root == null) {            String temp = sb.reverse().toString();            if (min.compareTo(temp) > 0) {                min = temp;            }            sb.reverse();            return;        }        sb.append((char) (root.val + 'a'));        smallest(root.left, sb);        smallest(root.right, sb);        sb.setLength(sb.length() - 1);    }}