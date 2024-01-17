package hackcodingblocks.Graph;

import java.util.*;

public class Bipartite_Graph {

    public boolean isBipartite(int[][] graph) {
        HashMap<Integer, Integer> visited = new HashMap<>();
        Queue<BipartitePair> q = new LinkedList<>();
        for (int i = 0; i < graph.length; i++) {
            if (visited.containsKey(i)) {
                continue;
            }
            q.add(new BipartitePair(i, 0));
            while (!q.isEmpty()) {
                BipartitePair rp = q.poll();
                if (visited.containsKey(rp.vtx)) {
                    if (visited.get(rp.vtx) != rp.des) {
                        return false;
                    }
                    continue;
                }
                visited.put(rp.vtx, rp.des);
                for (int nbrs : graph[rp.vtx]) {
                    if (!visited.containsKey(nbrs)) {
                        q.add(new BipartitePair(nbrs, rp.des + 1));
                    }
                }
            }

        }
        return true;

    }

    class BipartitePair {
        int vtx;
        int des;

        public BipartitePair(int vtx, int des) {
            this.vtx = vtx;
            this.des = des;
        }
    }
}