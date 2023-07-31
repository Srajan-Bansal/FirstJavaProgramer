package ElementsOfProgramming.Graph.Questions;

import java.util.*;

public class ShortestPath {
    public static void main(String[] args) {

    }

    static int[] shortestPath(List<List<Integer>> adj, int vertices, int s) {
        int[] dist = new int[vertices];
        dist[s] = 0;

        boolean[] visited = new boolean[vertices];
        visited[s] = true;
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(s);

        while (!queue.isEmpty()) {
            int u = queue.poll();
            for (int v : adj.get(u)) {
                if (!visited[v]) {
                    dist[v] = dist[u] + 1;
                    visited[v] = true;
                    queue.offer(v);
                }
            }
        }
        return dist;
    }
}
