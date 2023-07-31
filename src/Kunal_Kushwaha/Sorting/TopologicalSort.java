package Kunal_Kushwaha.Sorting;

import java.util.*;

public class TopologicalSort {
    public static void main(String[] args) {

    }

    // BFS
    static void topological(List<List<Integer>> adj, int vertices) {
        int[] inDegree = new int[vertices];

        for (int i = 0; i < inDegree.length; i++) {
            for (int v : adj.get(i)) {
                inDegree[v]++;
            }
        }

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < inDegree.length; i++) {
            if (inDegree[i] == 0)
                queue.offer(i);
        }

        while (!queue.isEmpty()) {
            int u = queue.poll();
            System.out.print(u + " ");
            for (int v : adj.get(u)) {
                inDegree[v]--;
                if (inDegree[v] == 0)
                    queue.offer(v);
            }
        }
    }
}
