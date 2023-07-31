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
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode curr = stack.pop();
            list.add(curr.val);

            if (curr.right != null) stack.push(curr.right);
            if (curr.left != null) stack.push(curr.left);
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
