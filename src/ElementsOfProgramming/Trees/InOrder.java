package ElementsOfProgramming.Trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InOrder implements TreeLeetcode{
    public static void main(String[] args) {

    }

    static List<Integer> iterativePreOrder(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) return list;

        Stack<TreeNode> stack = new Stack<>();
        stack.add(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            list.add(node.val);

            if (root.right != null) stack.push(root.right);
            if (root.left != null) stack.push(root.left);
        }
        return list;
    }

}
