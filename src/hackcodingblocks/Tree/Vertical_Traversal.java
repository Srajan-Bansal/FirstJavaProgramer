package hackcodingblocks.Tree;

import ElementsOfProgramming.Trees.TreeLeetcode;

import java.util.*;

public class Vertical_Traversal implements TreeLeetcode{
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(6);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(7);

        TreeMap<Integer, List<Integer>> map = new TreeMap<>();
        verticalTraversal(root, 0, map);
        System.out.println(map);

        List<List<Integer>> list = new ArrayList<>(map.values());
    }

    public static void verticalTraversal(TreeNode root, int level, TreeMap<Integer, List<Integer>> map) {
        if (root == null) return;

        if (map.get(level) == null) {
            List<Integer> temp = new ArrayList<>();
            map.put(level, temp);
        }
        map.get(level).add(root.val);
        verticalTraversal(root.left, level - 1, map);
        verticalTraversal(root.right, level + 1, map);
    }

    public List<List<Integer>> verticalTraversal(TreeNode root) {
        TreeMap<Integer, TreeMap<Integer, List<Integer>>> map = new TreeMap<>();
        verticalTraversal(root, 0, 0, map);

        List<List<Integer>> list = new ArrayList<>();
        for (TreeMap<Integer, List<Integer>> i : map.values()) {
            List<Integer> ptr = new ArrayList<>();
            for (List<Integer> temp : i.values()) {
                Collections.sort(temp);
                for (int j = 0; j < temp.size(); j++) {
                    ptr.add(temp.get(j));
                }
            }
            list.add(ptr);
        }
        return list;
    }

    static void verticalTraversal(TreeNode root, int col, int level, TreeMap<Integer, TreeMap<Integer, List<Integer>>> map) {
        if (root == null) return;

        verticalTraversal(root.left, col - 1, level + 1, map);
        map.computeIfAbsent(col, k -> new TreeMap<>()).computeIfAbsent(level, k -> new ArrayList<>()).add(root.val);
        verticalTraversal(root.right, col + 1, level + 1, map);
    }
}
