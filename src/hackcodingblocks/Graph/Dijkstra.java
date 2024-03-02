package hackcodingblocks.Graph;

import java.util.*;

public class Dijkstra {
    private HashMap<Integer, HashMap<Integer, Integer>> map;

    public Dijkstra(int v) {
        map = new HashMap<>();
        for (int i = 1; i <= v; i++) {
            map.put(i, new HashMap<>());
        }
    }

    public void addEdge(int v1, int v2, int cost) {
        map.get(v1).put(v2, cost);
        map.get(v2).put(v1, cost);
    }

    class DijkstraPair {
        int vertice;
        String acqpath;
        int cost;

        public DijkstraPair(int vtx, String acqpath, int cost) {
            this.vertice = vtx;
            this.acqpath = acqpath;
            this.cost = cost;
        }

        @Override
        public String toString() {
            return "DijkstraPair{" +
                    "vtx=" + vertice +
                    ", acqpath='" + acqpath + '\'' +
                    ", cost=" + cost +
                    '}';
        }
    }

    public void DijkstraAlgo(int src) {
        PriorityQueue<DijkstraPair> pq = new PriorityQueue<>((a, b) -> a.cost - b.cost);

        HashSet<Integer> visited = new HashSet<>();
        pq.add(new DijkstraPair(src, "" + src, 0));
        while (!pq.isEmpty()) {
            DijkstraPair rp = pq.remove();
            if (visited.contains(rp.vertice)) {
                continue;
            }
            visited.add(rp.vertice);
            System.out.println(rp);
            for (int nbrs : map.get(rp.vertice).keySet()) {
                if (!visited.contains(nbrs)) {
                    int cost = rp.cost + map.get(rp.vertice).get(nbrs);
                    DijkstraPair dp = new DijkstraPair(nbrs, rp.acqpath + nbrs, cost);
                    pq.add(dp);
                }
            }
        }
    }

    public static void main(String[] args) {
        Dijkstra graph = new Dijkstra(7);
        graph.addEdge(1, 2, 2);
        graph.addEdge(2, 3, 3);
        graph.addEdge(1, 4, 10);
        graph.addEdge(4, 5, 8);
        graph.addEdge(3, 4, 1);
        graph.addEdge(5, 6, 5);
        graph.addEdge(5, 7, 6);
        graph.addEdge(6, 7, 4);
        graph.DijkstraAlgo(1);
    }
}
