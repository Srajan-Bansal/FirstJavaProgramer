package hackcodingblocks.Tree;

import ElementsOfProgramming.Trees.TreeLeetcode;

import java.util.*;

public class Serialize_Deserialize implements TreeLeetcode {
    public static class Codec {

        // Encodes a tree to a single string.
        public String serialize(TreeNode root) {
            return serializeToArray(root);
        }

        public String serializeToArray(TreeNode root) {
            StringBuilder sb = new StringBuilder();
            Queue<TreeNode> queue = new LinkedList<>();
            queue.offer(root);
            while (!queue.isEmpty()) {
                int size = queue.size();
                while (size-- > 0) {
                    TreeNode curr = queue.poll();

                    if (curr == null) {
                        sb.append(-1001).append(',');
                    } else {
                        sb.append(curr.val).append(',');
                        queue.offer(curr.left);
                        queue.offer(curr.right);
                    }
                }
            }

            return sb.toString();
        }

        // Decodes your encoded data to tree.
        public TreeNode deserialize(String data) {
            return levelOrderConstructTree(data);
        }

        public TreeNode levelOrderConstructTree(String str) {
            String[] levelOrder = str.split(",");

            if (levelOrder.length == 0) {
                return null;
            }

            TreeNode root = new TreeNode(Integer.parseInt(levelOrder[0]));
            if (root.val == -1001) root = null;
            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root);
            int i = 1;

            while (!queue.isEmpty() && i < levelOrder.length) {
                TreeNode current = queue.poll();

                Integer leftVal = Integer.parseInt(levelOrder[i++]);
                if (leftVal == -1001)
                    leftVal = null;
                if (leftVal != null) {
                    current.left = new TreeNode(leftVal);
                    queue.add(current.left);
                }

                if (i < levelOrder.length) {
                    Integer rightVal = Integer.parseInt(levelOrder[i++]);
                    if (rightVal == -1001)
                        rightVal = null;
                    if (rightVal != null) {
                        current.right = new TreeNode(rightVal);
                        queue.add(current.right);
                    }
                }
            }
            return root;
        }
    }
}
