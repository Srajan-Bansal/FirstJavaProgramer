package Kunal_Kushwaha.Tree;

public class AVL {
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

    public AVL() {

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
        root.height = findHeight(root);

        return rotate(root);
    }

    Node rotate(Node root) {
        if (height(root.left) - height(root.right) > 1) {
            // left heavy
            if (height(root.left.left) - height(root.left.right) > 0) {
                // left left
                return rightRotate(root);
            }
            if (height(root.left.left) - height(root.left.right) < 0) {
                // left right
                root.left = leftRotate(root.left);
                return rightRotate(root);
            }
        }

        if (height(root.left) - height(root.right) < -1) {
            // right heavy
            if (height(root.right.left) - height(root.right.right) < 0) {
                // right right
                return leftRotate(root);
            }
            if (height(root.right.left) - height(root.right.right) > 0) {
                // right left
                root.right = rightRotate(root.right);
                return leftRotate(root);
            }
        }
        return root;
    }

    Node rightRotate(Node p) {
        Node c = p.left;
        Node t = p.left.right;

        c.right = p;
        p.left = t;

        p.height = findHeight(p);
        c.height = findHeight(c);

        return c;
    }

    Node leftRotate(Node p) {
        Node c = p.right;
        Node t = p.right.left;

        c.left = p;
        p.right = t;

        p.height = findHeight(p);
        c.height = findHeight(c);

        return c;
    }

    int findHeight(Node root) {
        if (root == null) return 0;
//        return Math.max(findHeight(root.left), findHeight(root.right)) + 1;
        return Math.max(height(root.left), height(root.right)) + 1;
    }

    static void inOrder(Node root) {
        if (root == null) return;

        inOrder(root.left);
        System.out.print(root.value + " ");
        inOrder(root.right);
    }

    public static void main(String[] args) {
        AVL tree = new AVL();
        for (int i = 0; i < 2; i++) {
            tree.insert(i);
        }
        System.out.println(tree.root.height);
//        System.out.println(tree.root.right.height);
//        System.out.println(tree.find(tree.root));
//        System.out.println((int) (Math.log(10 + 1) / Math.log(2))); // min height

//        tree.print2D(tree.root);
    }

    int find(Node root) {
        if (root == null) return 0;
        return Math.max(find(root.left), find(root.right)) + 1;
    }

    int COUNT = 3;

    void print2DUtil(Node root, int space) {
        // Base case
        if (root == null)
            return;

        // Increase distance between levels
        space += COUNT;

        // Process right child first
        print2DUtil(root.right, space);

        // Print current node after space
        // count
        System.out.print("\n");
        for (int i = COUNT; i < space; i++)
            System.out.print(" - ");
        System.out.print(root.value + "\n");

        // Process left child
        print2DUtil(root.left, space);
    }

    // Wrapper over print2DUtil()
    void print2D(Node root) {
        // Pass initial space count as 0
        print2DUtil(root, 0);
    }
}
