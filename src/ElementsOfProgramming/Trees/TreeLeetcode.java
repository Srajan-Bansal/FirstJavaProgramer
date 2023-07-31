package ElementsOfProgramming.Trees;

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

//    TreeNode root = new TreeNode(2);
//    root.left = new TreeNode(12);
//    root.right = new TreeNode(9);
//    root.left.left = new TreeNode(5);
//    root.left.right = new TreeNode(6);
}

