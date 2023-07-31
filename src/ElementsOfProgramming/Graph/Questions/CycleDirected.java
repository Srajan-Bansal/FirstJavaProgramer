package ElementsOfProgramming.Graph.Questions;

import java.util.*;

public class CycleDirected {
    public static void main(String[] args) {

    }

    // DFS
    static boolean dfs(List<List<Integer>> adj, int v) {
        boolean[] visited = new boolean[v], recStack = new boolean[v];

        for (int i = 0; i < v; i++) {
            if (!visited[i]) {
                if (dfsUtil(adj, i, visited, recStack))
                    return true;
            }
        }
        return false;
    }

    static boolean dfsUtil(List<List<Integer>> adj, int s, boolean[] visited, boolean[] recStack) {
        visited[s] = true;
        recStack[s] = true;

        for (int u : adj.get(s)) {
            if (!visited[u] && dfsUtil(adj, u, visited, recStack))
                return true;
            else if (recStack[u])
                return true;
        }
        recStack[s] = false;
        return false;
    }

    // BFS
    static boolean bfs(List<List<Integer>> adj, int vertices) {
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

        int count = 0;
        while (!queue.isEmpty()) {
            int u = queue.poll();
            System.out.print(u + " ");
            for (int v : adj.get(u)) {
                inDegree[v]--;
                if (inDegree[v] == 0)
                    queue.offer(v);
            }
            count++;
        }
        return count != vertices;
    }
}
