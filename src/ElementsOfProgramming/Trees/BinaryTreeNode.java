//package ElementsOfProgramming.Trees;
//
//import java.util.ArrayList;
//import java.util.Stack;
//
//public class BinaryTreeNode {
//    public int data;
//    public BinaryTreeNode left, right;
//
//    public BinaryTreeNode(int key) {
//        this.data = key;
//    }
//
//}
//    class Tree {
//        public Tree() {
//            BinaryTreeNode root;
//
//
//        }
//
//        public Tree(int data, BinaryTreeNode left, BinaryTreeNode right) {
//            this.data = data;
//            this.left = left;
//            this.right = right;
//        }
//
//        public int getData() {
//            return data;
//        }
//
//        public void setData(int data) {
//            this.data = data;
//        }
//
//        public BinaryTreeNode getLeft() {
//            return left;
//        }
//
//        public void setLeft(int left) {
//            this.left = new BinaryTreeNode(left);
//        }
//
//        public BinaryTreeNode getRight() {
//            return right;
//        }
//
//        public void setRight(int right) {
//            this.right = new BinaryTreeNode(right);
//        }
//
//        public void PreOrder(BinaryTreeNode root) {
//            if (root != null) {
//                System.out.println(root.data);
//                PreOrder(left);
//                PreOrder(right);
//            }
//        }
//
//        public ArrayList<Integer> IterativePreOrder(BinaryTreeNode root) {
//            ArrayList<Integer> arr = new ArrayList<>();
//            if (root != null) {
//                return arr;
//            }
//
//            Stack<BinaryTreeNode> stack = new Stack<>();
//            stack.push(root);
//
//            while (!stack.isEmpty()) {
//                BinaryTreeNode temp = stack.pop();
//                arr.add(temp.data);
//
//                if (temp.right != null) {
//                    stack.push(temp.right);
//                }
//                if (temp.left != null) {
//                    stack.push(temp.left);
//                }
//            }
//            return arr;
//        }
//
//        public void InOrder(BinaryTreeNode root) {
//            if (root != null) {
//                InOrder(root.left);
//                System.out.println(root.data);
//                InOrder(root.right);
//            }
//        }
//
//        public ArrayList<Integer> IterativeInOrder(BinaryTreeNode root) {
//            ArrayList<Integer> arr = new ArrayList<>();
//            Stack<BinaryTreeNode> stack = new Stack<>();
//            BinaryTreeNode currentNode = root;
//            boolean done = false;
//
//            while (!done) {
//                if (currentNode != null) {
//                    stack.push(currentNode);
//                    currentNode = currentNode.left;
//                } else {
//                    if (stack.isEmpty()) {
//                        done = true;
//                    } else {
//                        currentNode = stack.pop();
//                        arr.add(currentNode.data);
//                        currentNode = currentNode.right;
//                    }
//                }
//            }
//            return arr;
//        }
//    }
//}
