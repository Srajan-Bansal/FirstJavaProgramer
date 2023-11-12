package hackcodingblocks.Graph;

import java.util.*;

public class BFS_BFT {
    Map<Integer, HashMap<Integer, Integer>> map;

    public BFS_BFT(int v) {
        map = new HashMap<>();
        for (int i = 0; i <= v; i++) {
            map.put(i, new HashMap<>());
        }
    }

    public void addEdge(int v1, int v2, int cost) {
        map.get(v1).put(v2, cost);
        map.get(v2).put(v1, cost);
    }

    public boolean bfs(int src, int des) {
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();
        queue.add(src);
        while (!queue.isEmpty()) {
            // 1- remove
            int rv = queue.poll();
            // 2- If already visited then ignore
            if (visited.contains(rv)) {
                continue;
            }
            // 3- Marked visited
            visited.add(rv);
            // 4- Self work
            if (rv == des) {
                return true;
            }
            // 5- Add nbrs
            for (int nbrs : map.get(rv).keySet()) {
                if (!visited.contains(nbrs)) {
                    queue.add(nbrs);
                }
            }
        }
        return false;
    }


    public void bft() {
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();
        for (int src : map.keySet()) {
            if (visited.contains(src)) {
                continue;
            }
            queue.add(src);
            while (!queue.isEmpty()) {
                // 1- remove
                int rv = queue.poll();
                // 2- If already visited then ignore
                if (visited.contains(rv)) {
                    continue;
                }
                // 3- Marked visited
                visited.add(rv);
                // 4- Self work
                System.out.println(rv + " ");
                // 5- Add nbrs
                for (int nbrs : map.get(rv).keySet()) {
                    if (!visited.contains(nbrs)) {
                        queue.add(nbrs);
                    }
                }
            }
        }
    }
}
