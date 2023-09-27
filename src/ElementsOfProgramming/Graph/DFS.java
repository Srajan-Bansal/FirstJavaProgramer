package ElementsOfProgramming.Graph;

import java.util.*;

public class DFS {
    public static void main(String[] args) {

    }

    // for unconnected Graph
    static void dfs(List<LinkedList<Integer>> adj, int s, int v) {
        boolean[] visited = new boolean[v];
        for (int i = 0; i < v; i++) {
            if (!visited[i]) {
                dfsRec(adj, s, visited);
            }
        }
    }

    static void dfsRec(List<LinkedList<Integer>> adj, int s, boolean[] visited) {
        visited[s] = true;
        System.out.print(s + " ");

        for (int u : adj.get(s)) {
            if (!visited[u]) {
                dfsRec(adj, u, visited);
            }
        }
    }
}
