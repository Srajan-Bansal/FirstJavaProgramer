import ElementsOfProgramming.Trees.TreeLeetcode;
import Kunal_Kushwaha.LinkedList.Questions.LinkedListLeetcode;

import java.nio.channels.Pipe;
import java.util.*;

public class Solution implements LinkedListLeetcode, TreeLeetcode {
    public static void main(String[] args) {
//        TreeNode root = new TreeNode(10);
//        root.left = new TreeNode(20);
//        root.right = new TreeNode(30);
//        root.left.left = new TreeNode(40);
//        root.left.right = new TreeNode(50);
//        root.right.right = new TreeNode(60);
////        root.left.left.left = new TreeNode(100);
////        root.left.right.left = new TreeNode(122);

        AVLTree tree = new AVLTree();
        for (int i = 0; i < 1000; i++) {
            tree.insert(i);
        }

        System.out.println(tree.height(tree.root));
    }
    static class Node {
        int key;
        int height;
        Node left;
        Node right;

        Node(int key) {
            this.key = key;
            this.height = 1;
            this.left = null;
            this.right = null;
        }
    }

    static class AVLTree {
        private Node root;

        private int height(Node node) {
            if (node == null) return 0;
            return node.height;
        }

        private int balanceFactor(Node node) {
            if (node == null) return 0;
            return height(node.left) - height(node.right);
        }

        private Node rightRotate(Node y) {
            Node x = y.left;
            Node T2 = x.right;

            x.right = y;
            y.left = T2;

            y.height = Math.max(height(y.left), height(y.right)) + 1;
            x.height = Math.max(height(x.left), height(x.right)) + 1;

            return x;
        }

        private Node leftRotate(Node x) {
            Node y = x.right;
            Node T2 = y.left;

            y.left = x;
            x.right = T2;

            x.height = Math.max(height(x.left), height(x.right)) + 1;
            y.height = Math.max(height(y.left), height(y.right)) + 1;

            return y;
        }

        private void insert(Node node, int key) {
            if (node == null) {
                root = new Node(key);
                return;
            }

            if (key < node.key) {
                if (node.left == null) {
                    node.left = new Node(key);
                } else {
                    insert(node.left, key);
                }
            } else if (key > node.key) {
                if (node.right == null) {
                    node.right = new Node(key);
                } else {
                    insert(node.right, key);
                }
            }

            node.height = Math.max(height(node.left), height(node.right)) + 1;

            int balance = balanceFactor(node);

            if (balance > 1) {
                if (key < node.left.key) {
                    node = rightRotate(node);
                } else if (key > node.left.key) {
                    node.left = leftRotate(node.left);
                    node = rightRotate(node);
                }
            }

            if (balance < -1) {
                if (key > node.right.key) {
                    node = leftRotate(node);
                } else if (key < node.right.key) {
                    node.right = rightRotate(node.right);
                    node = leftRotate(node);
                }
            }

            root = node; // Update the root if it changes due to rotations.
        }

        public void insert(int key) {
            insert(root, key);
        }

        // Other methods like search, delete, etc., can be implemented similarly.

        // In-order traversal to print the tree elements in sorted order.
        private void inOrderTraversal(Node node) {
            if (node != null) {
                inOrderTraversal(node.left);
                System.out.print(node.key + " ");
                inOrderTraversal(node.right);
            }
        }

        public void inOrderTraversal() {
            inOrderTraversal(root);
        }
    }
}

