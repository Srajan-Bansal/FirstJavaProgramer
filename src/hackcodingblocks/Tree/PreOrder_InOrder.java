package hackcodingblocks.Tree;

import ElementsOfProgramming.Trees.TreeLeetcode;

import java.util.HashMap;
import java.util.Map;

public class PreOrder_InOrder implements TreeLeetcode {
    // O(n)
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int ei = inorder.length - 1;
        map = new HashMap<>();
        for (int j = 0; j <= ei; j++) {
            map.put(inorder[j], j);
        }
        return buildTree(preorder, inorder, 0, ei);
    }

    int i = 0;
    Map<Integer, Integer> map;

    public TreeNode buildTree(int[] preorder, int[] inorder, int si, int ei) {
        if (si > ei) return null;

        TreeNode root = new TreeNode(preorder[i++]);
        int j = map.get(root.val);

        root.left = buildTree(preorder, inorder, si, j - 1);
        root.right = buildTree(preorder, inorder, j + 1, ei);
        return root;
    }

//    O(n^2)
//    public TreeNode buildTree(int[] preorder, int[] inorder) {
//        int ei = inorder.length - 1;
//        return buildTree(preorder, inorder, 0, ei);
//    }
//
//    int i = 0;
//    public TreeNode buildTree(int[] preorder, int[] inorder, int si, int ei) {
//        if (si > ei) return null;
//
//        TreeNode root = new TreeNode(preorder[i++]);
//        int j = si;
//        for (j = si; j <= ei; j++) {
//            if (inorder[j] == root.val) break;
//        }
//
//        root.left = buildTree(preorder,  inorder, si, j - 1);
//        root.right = buildTree(preorder,  inorder, j + 1, ei);
//        return root;
//    }
}
