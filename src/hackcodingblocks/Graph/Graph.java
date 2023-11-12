package hackcodingblocks.Graph;

import java.util.*;

public class Graph {
    Map<Integer, Map<Integer, Integer>> map;

    public Graph(int v) {
        map = new HashMap<>();
        for (int i = 1; i <= v; i++) {
            map.put(i, new HashMap<>());
        }
    }

    public void addEdge(int v1, int v2, int cost) {
        map.get(v1).put(v2, cost);
        map.get(v2).put(v1, cost);
    }

    public boolean containsEdge(int v1, int v2) {
        return map.get(v1).containsKey(v2);
    }

    public boolean containsVertex(int v) {
        return map.containsKey(v);
    }

    public int noOfEdge() {
        int count = 0;
        for (int nbrs : map.keySet()) {
            count += map.get(nbrs).size();
        }
        return count / 2;
    }

    public void removeEdge(int v1, int v2) {
        map.get(v1).remove(v2);
        map.get(v2).remove(v1);
    }

    public void removeVertex(int v) {
        for (int nbrs : map.get(v).keySet()) {
            map.get(nbrs).remove(v);
        }
        map.remove(v);
    }

    public void display() {
        for (int key : map.keySet()) {
            System.out.println(key + " " + map.get(key));
        }
    }

    public boolean hasPath(Set<Integer> visited, int src, int des) {
        if (src == des) return true;

        visited.add(src);
        for (int nbrs : map.get(src).keySet()) {
            if (!visited.contains(nbrs)) {
                boolean ans = hasPath(visited, nbrs, des);
                if (ans) return true;
            }
        }
        return false;
    }

    public void printAllPath(Set<Integer> visited, int src, int des, String str) {
        if (src == des) {
            System.out.println(str + des);
            return;
        }

        visited.add(src);
        for (int nbrs : map.get(src).keySet()) {
            if (!visited.contains(nbrs)) {
                printAllPath(visited, nbrs, des, "" + nbrs);
            }
        }
        visited.remove(src);
    }

    public static void main(String[] args) {
        Graph graph = new Graph(7);

        graph.addEdge(1, 4, 6);
        graph.addEdge(1, 2, 10);
        graph.addEdge(2, 3, 7);
        graph.addEdge(3, 4, 5);
        graph.addEdge(4, 5, 1);
        graph.addEdge(5, 6, 4);
        graph.addEdge(7, 5, 2);
        graph.addEdge(6, 7, 3);

        graph.display();

//        System.out.println(graph.hasPath(new HashSet<>(), 1, 4));

        graph.printAllPath(new HashSet<>(), 1, 6, "");
    }
}
