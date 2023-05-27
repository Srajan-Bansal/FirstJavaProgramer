package ElementsOfProgramming.Trees.Questions;

import ElementsOfProgramming.Trees.TreeLeetcode;

public class MaxElement implements TreeLeetcode {
    public static void main(String[] args) {
        Node root = new Node(2);
        root.left = new Node(12);
        root.right = new Node(9);
        root.left.left = new Node(5);
        root.left.right = new Node(6);

//        System.out.println(maxElement(root));
        System.out.println(maxHeight(root));
    }

    static int maxHeight(Node root) {
        if (root == null) return 0;

        return Math.max(1 + maxHeight(root.left), 1 + maxHeight(root.right));
    }

    static int maxElement(Node root) {
        if (root == null) return 0;

        int num = root.val;
        int left = maxElement(root.left), right = maxElement(root.right);
        return Math.max(num, Math.max(left, right));
    }
}
