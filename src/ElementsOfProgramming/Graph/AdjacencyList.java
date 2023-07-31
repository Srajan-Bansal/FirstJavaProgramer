package ElementsOfProgramming.Graph;

import ElementsOfProgramming.Graph.Questions.Cycle;

import java.util.*;

public class AdjacencyList {
    public static void main(String[] args) {
        int v = 5;
        List<List<Integer>> adj = new ArrayList<>(v);
        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList<>());
        }
        // Cycle present
        addEdge(adj, 1, 0);
        addEdge(adj, 0, 2);
        addEdge(adj, 2, 1);
        addEdge(adj, 0, 3);
        addEdge(adj, 3, 4);
        if (Cycle.bfs(adj, 4)) {
            System.out.println("Cycle detected");
        } else System.out.println("Cycle not detected");

        // No Cycle Present
        List<List<Integer>> list = new ArrayList<>(v);
        for (int i = 0; i < v; i++) {
            list.add(new ArrayList<>());
        }
        addEdge(list, 0, 1);
        addEdge(list, 1, 2);
        if (Cycle.bfs(list, 3)) {
            System.out.println("Cycle detected");
        } else System.out.println("Cycle not detected");

//        printGraph(adj);
    }

    static void addEdge(List<List<Integer>> adj, int u, int v) {
         adj.get(u).add(v);
         adj.get(v).add(u);
    }

    static void printGraph(List<List<Integer>> adj) {
        for (List<Integer> integers : adj) {
            for (Integer integer : integers) {
                System.out.print(integer + " ");
            }
            System.out.println();
        }
    }
}
