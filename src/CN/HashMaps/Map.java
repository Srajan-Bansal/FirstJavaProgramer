package CN.HashMaps;

import java.util.ArrayList;

public class Map<K, V> {

    ArrayList<MapNode<K, V>> bucketList;
    int count;
    int numBucket;

    public Map(int numBucket) {
        bucketList = new ArrayList<>();
        this.numBucket = numBucket;
        count = 0;
    }

    public int getHasCode(K key) {
        return key.hashCode() % numBucket;
    }

    public void insert(K key, V value) {
        int bucketIndex = getHasCode(key);
        MapNode<K, V> head, temp;
        head = temp = bucketList.get(bucketIndex);

        while (temp != null) {
            if (temp.key.equals(key)) {
                temp.value = value;
                return;
            }
            temp = temp.next;
        }

        MapNode<K, V> node = new MapNode<>(key, value);
        node.next = head;
        bucketList.set(bucketIndex, node);
    }

    public V getValue(K key) {
        int bucketIndex = getHasCode(key);
        MapNode<K, V> head = bucketList.get(bucketIndex);

        while (head != null) {
            if (head.key.equals(key)) {
                return head.value;
            }
            head = head.next;
        }
        return null;
    }

    public V removeKey(K key) {
        int bucketIndex = getHasCode(key);
        MapNode<K, V> head = bucketList.get(bucketIndex);
        MapNode<K, V> prev = null;

        while (head != null) {
            if (head.key.equals(key)) {
                if (prev != null) {
                    prev.next = head.next;
                } else {
                    bucketList.set(bucketIndex, head.next);
                }
                return head.value;
            }
            prev = head;
            head = head.next;
        }
        return null;
    }

    public int size() {
        return count;
    }
}
