package hackcodingblocks.HashMap;

import java.util.*;

public class HashMap<K, V> {
    class Node {
        K key;
        V value;
        Node next;

        Node() {

        }

        Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    private List<Node> list;
    private int size;

    public HashMap() {
        this(4);
        this.size = 4;
    }

    public HashMap(int n) {
        list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(null);
        }
        this.size = n;
    }

    public int hashFunction(K key) {
        int bucket = key.hashCode() % list.size();
        if (bucket < 0) {
            bucket = bucket + list.size();
        }
        return bucket;
    }

    public void put(K key, V value) {
        int index = hashFunction(key);
        Node temp = list.get(index);
        while (temp != null) {
            if (temp.key.equals(key)) {
                temp.value = value;
                return;
            }
            temp = temp.next;
        }

        Node node = new Node(key, value);
        temp = list.get(index);
        node.next = temp;
        list.set(index, node);
        this.size++;

//        double thresholdFactor = 2.0;
//        double loadFactor = (1.0 + size) / list.size();
//        if (loadFactor > thresholdFactor) {
//            rehashing();
//        }
    }

    private void rehashing() {
        List<Node> newList = new ArrayList<>();
        for (int i = 0; i < 2 * list.size(); i++) {
            newList.add(null);
        }
        for (Node node : list) {
            while (node != null) {
                put(node.key, node.value);
                node = node.next;
            }
        }
//        this.list = newList;
    }

    public V get(K key) {
        int index = hashFunction(key);
        Node temp = list.get(index);
        while (temp != null) {
            if (temp.key.equals(key)) {
                return temp.value;
            }
            temp = temp.next;
        }
        return null;
    }

    public V remove(K key) {
        int index = hashFunction(key);
        Node curr = list.get(index);
        Node prev = null;

        while (curr != null && !curr.key.equals(key)) {
            prev = curr;
            curr = curr.next;
        }

        if (curr == null) return null; // No list
        if (prev == null) list.set(index, curr.next);
        else prev.next = curr.next;

        this.size--;
        return curr.value;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("{");
        for (Node temp : list) {
            while (temp != null) {
                str.append(temp.key).append("=").append(temp.value).append(", ");
                temp = temp.next;
            }
            str.append("}");
        }
        return str + "{ " + list.size() + "}";
//        return "HashMap{" +
//                "list=" + list +
//                ", size=" + size +
//                '}';
    }

    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>(4);
        for (int i = 0; i < 10; i++) {
            map.put(i, i);
        }
        for (int i = 11; i < 20; i++) {
            map.put(i, 2);
        }
        System.out.println(map);
    }
}
