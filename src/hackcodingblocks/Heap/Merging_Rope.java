package hackcodingblocks.Heap;

import java.util.PriorityQueue;

public class Merging_Rope {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 1, 5, 7};
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i : arr) {
            pq.offer(i);
        }

        int sum = 0;
        while (pq.size() > 1) {
            int a = pq.poll(), b = pq.poll();
            sum = sum + a + b;
            pq.offer(a + b);
        }
        System.out.println(sum);
    }
}
