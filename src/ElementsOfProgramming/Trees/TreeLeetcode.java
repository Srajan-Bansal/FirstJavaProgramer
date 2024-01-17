package ElementsOfProgramming.Trees;

import java.util.*;

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

    static void printTree(TreeNode root) {
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

    public static TreeNode arrayToTree(Integer[] array) {
        if (array == null || array.length == 0) {
            return null;
        }

        return arrayToTree(array, 0);
    }

    private static TreeNode arrayToTree(Integer[] array, int index) {
        if (index >= array.length || array[index] == null) {
            return null;
        }

        TreeNode root = new TreeNode(array[index]);

        root.left = arrayToTree(array, 2 * index + 1);
        root.right = arrayToTree(array, 2 * index + 2);

        return root;
    }

    public static TreeNode levelOrderConstructTree(Integer[] levelOrder) {
        if (levelOrder == null || levelOrder.length == 0) {
            return null;
        }

        TreeNode root = new TreeNode(levelOrder[0]);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int i = 1;

        while (!queue.isEmpty() && i < levelOrder.length) {
            TreeNode current = queue.poll();

            Integer leftVal = levelOrder[i++];
            if (leftVal != null) {
                current.left = new TreeNode(leftVal);
                queue.add(current.left);
            }

            if (i < levelOrder.length) {
                Integer rightVal = levelOrder[i++];
                if (rightVal != null) {
                    current.right = new TreeNode(rightVal);
                    queue.add(current.right);
                }
            }
        }

        return root;
    }

//    TreeNode root = new TreeNode(2);
//    root.left = new TreeNode(12);
//    root.right = new TreeNode(9);
//    root.left.left = new TreeNode(5);
//    root.left.right = new TreeNode(6);
}

