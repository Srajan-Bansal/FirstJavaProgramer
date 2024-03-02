package Knowledge;

public interface Trie {

    TrieNode root = new TrieNode();

    public default void insert(String word) {
        TrieNode node = root;
        for (char ch : word.toCharArray()) {
            int index = ch - 'a';
            if (node.children[index] == null) {
                node.children[index] = new TrieNode();
            }
            node = node.children[index];
        }
        node.isWord = true;
    }

    public default boolean search(String word) {
        TrieNode node = root;
        for (char ch : word.toCharArray()) {
            int index = ch - 'a';
            if (node.children[index] == null) {
                return false;
            }
            node = node.children[index];
        }
        return node.isWord;
    }

    public default boolean startsWith(String prefix) {
        TrieNode node = root;
        for (char ch : prefix.toCharArray()) {
            int index = ch - 'a';
            if (node.children[index] == null) {
                return false;
            }
            node = node.children[index];
        }
        return true;
    }

    public default void display() {
        int height = heightOfTrie(root) - 1;
        int numberOfElements = (int) Math.pow(2, height + 1) - 1;
        displayUtil(root, height, numberOfElements, 0);
    }

    private void displayUtil(TrieNode node, int height, int numberOfElements, int level) {
        if (node == null || level > height)
            return;

        int elementsAtThisLevel = (int) Math.pow(2, level);
        int spacesBetweenNodes = numberOfElements / elementsAtThisLevel;

        for (int i = 0; i < spacesBetweenNodes / 2; i++) {
            System.out.print("\t");
        }

        if (node.isWord) {
            System.out.print("*");
        } else {
            System.out.print(" ");
        }

        for (int i = 0; i < spacesBetweenNodes / 2; i++) {
            System.out.print("\t");
        }

        for (TrieNode child : node.children) {
            displayUtil(child, height, numberOfElements, level + 1);
        }
    }

    private int heightOfTrie(TrieNode root) {
        if (root == null)
            return 0;

        int height = 0;
        for (TrieNode child : root.children) {
            height = Math.max(height, heightOfTrie(child));
        }
        return height + 1;
    }

    class TrieNode {
        char data;
        boolean isWord;
        TrieNode[] children;

        public TrieNode() {
            isWord = false;
            children = new TrieNode[26];
        }
    }
}