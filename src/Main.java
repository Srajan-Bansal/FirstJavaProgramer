import hackcodingblocks.DP.Important;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main s = new Main();

        int[] nums = {1,2,2,1,2,3,1};
        int[][] queries = {{1,2},{3,3},{4,2}};
        System.out.println(Arrays.toString(s.unmarkedSumArray(nums, queries)));
    }

    public long[] unmarkedSumArray(int[] nums, int[][] queries) {
        long[] ans = new long[queries.length];

        Map<Integer, PriorityQueue<Integer>> map = new HashMap<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            pq.add(nums[i]);
            map.computeIfAbsent(nums[i], k -> new PriorityQueue<>()).add(i);
        }

        int j = 0;
        boolean[] marked = new boolean[nums.length];
        for (int[] querey : queries) {
            int index = querey[0], k = querey[1];
            if (!marked[index]) {
                marked[index] = true;
                sum -= nums[querey[0]];
            }

            while (k > 0 && !pq.isEmpty()) {
                int smallest = pq.remove();

                if (!map.containsKey(smallest)) {
                    pq.poll();
                    continue;
                }
                PriorityQueue<Integer> pqIndex = map.get(smallest);
                while (!pqIndex.isEmpty() && k > 0) {
                    int toMarkIndex = pqIndex.remove();
                    if (marked[toMarkIndex]) continue;
                    marked[toMarkIndex] = true;
                    sum -= nums[toMarkIndex];
                    k--;
                }

                if (pqIndex.isEmpty()) map.remove(smallest);
            }

            ans[j++] = sum;
        }
        return ans;
    }
}