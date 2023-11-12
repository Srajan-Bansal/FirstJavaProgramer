package hackcodingblocks.Graph;

import java.util.*;

public class DFS_DFT {
    Map<Integer, HashMap<Integer, Integer>> map;

    public DFS_DFT(int v) {
        map = new HashMap<>();
        for (int i = 0; i <= v; i++) {
            map.put(i, new HashMap<>());
        }
    }

    public void addEdge(int v1, int v2, int cost) {
        map.get(v1).put(v2, cost);
        map.get(v2).put(v1, cost);
    }

    public boolean dfs(int src, int des) {
        Stack<Integer> stack = new Stack<>();
        Set<Integer> visited = new HashSet<>();
        stack.push(src);
        while (!stack.isEmpty()) {
            // 1- remove
            int rv = stack.pop();
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
                    stack.add(nbrs);
                }
            }
        }
        return false;
    }


    public void dft() {
        Stack<Integer> stack = new Stack<>();
        Set<Integer> visited = new HashSet<>();
        for (int src : map.keySet()) {
            if (visited.contains(src)) {
                continue;
            }
            stack.push(src);
            while (!stack.isEmpty()) {
                // 1- remove
                int rv = stack.pop();
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
                        stack.add(nbrs);
                    }
                }
            }
        }
    }
}
