package hackcodingblocks.Tree;

public class BinaryTree {
    static class Node {
        int val;
        Node left, right;

        Node(int val) {
            this.val = val;
        }
    }

    private Node root;

    public BinaryTree() {
        root = createTree();
    }

    Node createTree() {
        return null;
    }

    void display(Node root) {
        if (root == null) return;

        String s = "";
        s = "<--" + root.val + "-->";
        if (root.left != null) s = root.left.val + s;
        else s = "." + s;

        if (root.right != null) s = s + root.right.val;
        else s = s + ".";

        System.out.println(s);
        display(root.left);
        display(root.right);
    }

    public static void main(String[] args) {

    }
}
