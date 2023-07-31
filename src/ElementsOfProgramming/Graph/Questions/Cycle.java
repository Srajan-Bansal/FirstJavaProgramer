package ElementsOfProgramming.Graph.Questions;

import java.util.*;

public class Cycle {
    public static void main(String[] args) {

    }
    // DFS
    public static boolean dfs(List<List<Integer>> adj, int v) {
        boolean[] visited = new boolean[v];
        for (int i = 0; i < v; i++) {
            if (!visited[i] && isCyclicDFSUtil(adj, i, visited, -1))
                return true;
        }
        return false;
    }

    static boolean isCyclicDFSUtil(List<List<Integer>> adj, int s, boolean[] visited, int parent) {
        visited[s] = true;

        for (int u : adj.get(s)) {
            if (!visited[u]) {
                visited[u] = true;
                if (isCyclicDFSUtil(adj, u, visited, s))
                    return true;
            } else if (u != parent)
                return true;
        }
        return false;
    }

    // BFS // Not sure
    public static boolean bfs(List<List<Integer>> adj, int v) {
        boolean[] visited = new boolean[v];
        for (int i = 0; i < v; i++) {
            if (!visited[i] && isCyclicBFSUtil(adj, i, visited, -1))
                return true;
        }
        return false;
    }

    static boolean isCyclicBFSUtil(List<List<Integer>> adj, int s, boolean[] visited, int parent) {
        visited[s] = true;
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(s);

        while (!queue.isEmpty()) {
            int u = queue.poll();
            for (int v : adj.get(u)) {
                if (!visited[v]) {
                    visited[v] = true;
                    queue.offer(v);
                } else if (v != parent)
                    return true;
            }
            parent = u;
        }
        return false;
    }
}
