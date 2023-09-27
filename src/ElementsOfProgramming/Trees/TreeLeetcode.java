package ElementsOfProgramming.Trees;

import java.util.LinkedList;

public interface TreeLeetcode {
    class TreeNode {
        public int val;
        public TreeNode left;
        public TreeNode right;
        public int height;

        public TreeNode() {
        }

        public TreeNode(int val) {
            this.val = val;
        }

        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static void printTree(TreeNode root) {
        LinkedList<TreeNode> treeLevel = new LinkedList<>(), temp = new LinkedList<>();
        treeLevel.add(root);
        int counter = 0, height = heightOfTree(root) - 1;
        double numberOfElements = (Math.pow(2, (height + 1)) - 1);
        while (counter <= height) {
            TreeNode removed = treeLevel.removeFirst();
            if (temp.isEmpty()) printSpace(numberOfElements / Math.pow(2, counter + 1), removed);
            else printSpace(numberOfElements / Math.pow(2, counter), removed);
            if (removed == null) {
                temp.add(null);
                temp.add(null);
            } else {
                temp.add(removed.left);
                temp.add(removed.right);
            }

            if (treeLevel.isEmpty()) {
                System.out.println("");
                System.out.println("");
                treeLevel = temp;
                temp = new LinkedList<>();
                counter++;
            }
        }
    }
    public static void printSpace(double n, TreeNode removed) {
        for (; n > 0; n--) System.out.print("\t");
        if (removed == null) System.out.print(" ");
        else System.out.print(removed.val);
    }

    public static int heightOfTree(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(heightOfTree(root.left), heightOfTree(root.right));
    }

//    TreeNode root = new TreeNode(2);
//    root.left = new TreeNode(12);
//    root.right = new TreeNode(9);
//    root.left.left = new TreeNode(5);
//    root.left.right = new TreeNode(6);
}

