package CN.HashMaps;

import java.util.ArrayList;

public class Map<K, V> {
    ArrayList<MapNode<K ,V>> bucket;
    int count;
    int bucketSize;

    public Map(int bucketSize) {
        bucket = new ArrayList<>();
        count = 0;
        this.bucketSize = bucketSize;
    }

    public int getHashCode(K key) {
        return key.hashCode() % bucketSize;
    }

    public void insert(K key, V value) {
        int index = getHashCode(key);
        MapNode<K, V> head, temp;
        head = temp = bucket.get(index);

        while (temp != null) {
            if (temp.key.equals(key)) {
                temp.value = value;
                return;
            }
            temp = temp.next;
        }
        MapNode<K, V> node = new MapNode<>(key, value);
        node.next = head;
        bucket.set(index, node);
    }

    public V getValue(K key) {
        int index = getHashCode(key);
        MapNode<K, V> head = bucket.get(index);

        while (head != null) {
            if (head.key.equals(key)) {
                return head.value;
            }
            head = head.next;
        }
        return null;
    }

    public int size() {
        return count;
    }

    public V removeKey(K key) {
        int index = getHashCode(key);
        MapNode<K, V> head = bucket.get(index);
        MapNode<K, V> prev = null;

        while (head != null) {
            if (head.key.equals(key)) {
                if (prev != null) {
                    prev.next = head.next;
                } else {
                    V val = head.next.value;
                    bucket.set(index, head.next);
                    return val;
                }
            }
            prev = head;
            head = head.next;
        }
        return null;
    }
}
