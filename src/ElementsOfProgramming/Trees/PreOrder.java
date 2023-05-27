package ElementsOfProgramming.Trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreOrder implements TreeLeetcode {
    public static void main(String[] args) {

    }

    static List<Integer> iterativePreOrder(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) return list;

        Stack<TreeNode> stack = new Stack<>();
        stack.add(root);
        while (!stack.isEmpty()) {
            TreeNode Treenode = stack.pop();
            list.add(Treenode.val);

            if (root.right != null) stack.push(root.right);
            if (root.left != null) stack.push(root.left);
        }
        return list;
    }

    static List<Integer> preOrderList(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }

        List<Integer> list = new ArrayList<>();
        list.add(root.val);
        list.addAll(preOrderList(root.left));
        list.addAll(preOrderList(root.right));
        return list;
    }

    static void preOrder(TreeNode root) {
        if (root == null) return;

        System.out.println(root.val);
        preOrder(root.left);
        preOrder(root.right);
    }
}
