package CN.Tree;

public class Traversal implements TreeNode {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);

        inOrderTraversal(root);
//        preOrderTraversal(root);
//        postOrderTraversal(root);
    }

    static void inOrderTraversal(Node root) {
        if (root == null) {
            return;
        }
        inOrderTraversal(root.left);
        System.out.print(root.data + " ");
        inOrderTraversal(root.right);
    }

    static void preOrderTraversal(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        inOrderTraversal(root.left);
        inOrderTraversal(root.right);
    }

    static void postOrderTraversal(Node root) {
        if (root == null) {
            return;
        }
        inOrderTraversal(root.left);
        inOrderTraversal(root.right);
        System.out.print(root.data + " ");
    }
}
