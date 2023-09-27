package hackcodingblocks.Tree;

public class DeleteNode {
    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(200);
        root.left = new TreeNode(100);
        root.right = new TreeNode(300);
        root.left.left = new TreeNode(40);
        root.left.right = new TreeNode(50);
        root.right.right = new TreeNode(60);
        root.left.left.left = new TreeNode(100);
        root.left.right.left = new TreeNode(122);

        inOrder(root);
        System.out.println();
        inOrder(deleteNode(root, 1));
        print2D(root);
    }

    static TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) return null;

        if (root.val > key) {
            root.left = deleteNode(root.left, key);
        } else if (root.val < key) {
            root.right = deleteNode(root.right, key);
        } else {
            if (root.left == null && root.right == null) {
                return null;
            } else if (root.right == null) {
                return root.left;
            } else if (root.left == null) {
                return root.right;
            } else {
                int max = max(root);
                root.left = deleteNode(root.left, key);
                root.val = max;
            }
        }
        return root;
    }

    static int max(TreeNode root) {
        if (root == null) return 0;
        return Math.max(root.val, Math.max(max(root.left), max(root.right)));
    }

    static void inOrder(TreeNode root) {
        if (root == null) return;
        inOrder(root.left);
        System.out.print(root.val + " -> ");
        inOrder(root.right);
    }

    static final int COUNT = 10;

    static void print2DUtil(TreeNode root, int space) {
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
            System.out.print(" ");
        System.out.print(root.val + "\n");

        // Process left child
        print2DUtil(root.left, space);
    }

    // Wrapper over print2DUtil()
    static void print2D(TreeNode root) {
        // Pass initial space count as 0
        print2DUtil(root, 0);
    }
}
