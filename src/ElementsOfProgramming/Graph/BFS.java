package ElementsOfProgramming.Graph;

import java.util.*;

public class BFS {
    public static void main(String[] args) {

    }

    // for unconnected Graph
    static void BFSDistinct(List<List<Integer>> list, int v) {
        boolean[] visited = new boolean[v];
        for (int i = 0; i < v; i++) {
            if (!visited[i]) {
                modifiedBFS(list, i, visited);
            }
        }
    }

    static void modifiedBFS(List<List<Integer>> list, int s, boolean[] visited) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(s);
        visited[s] = true;

        while (!queue.isEmpty()) {
            int u = queue.poll();
            System.out.print(u + " ");
            for (int i : list.get(u)) {
                if (!visited[i]) {
                    visited[i] = true;
                    queue.offer(i);
                }
            }
        }
    }

    static void bfs(List<List<Integer>> list, int vertices, int s) {
        boolean[] visited = new boolean[vertices];
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(s);
        visited[s] = true;

        while (!queue.isEmpty()) {
            int u = queue.poll();
            System.out.print(u + " ");
            for (int v : list.get(u)) {
                if (!visited[v]) {
                    visited[v] = true;
                    queue.offer(v);
                }
            }
        }
    }
}
