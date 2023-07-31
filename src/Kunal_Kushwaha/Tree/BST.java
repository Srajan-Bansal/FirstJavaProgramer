package Kunal_Kushwaha.Tree;

public class BST {
    static class Node {
        Node left;
        Node right;
        int value;
        int height;

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    private Node root;

    public BST() {

    }

    public int height(Node root) {
        if (root == null) return 0;
        return root.height;
    }

    public boolean isEmpty() {
        return root == null;
    }

    void insert(int val) {
        root = insert(root, val);
    }

    Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }

        if (root.value > val) {
            root.left = insert(root.left, val);
        } else if (root.value < val) {
            root.right = insert(root.right, val);
        }
        root.height = Math.max(height(root.left), height(root.right)) + 1;

        return root;
    }

    static void inOrder(Node root) {
        if (root == null) return;

        inOrder(root.left);
        System.out.print(root.value + " ");
        inOrder(root.right);
    }

    public static void main(String[] args) {
        BST tree = new BST();
        for (int i = 0; i < 1000; i++) {
            tree.insert(i);
        }
        System.out.println(tree.root.height);
        inOrder(tree.root);
    }
}
