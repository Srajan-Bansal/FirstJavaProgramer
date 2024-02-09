package hackcodingblocks.Graph;

import java.util.*;

public interface GraphLeetcode {
    public static Map<Integer, List<Integer>> getGraph(int[][] edges) {
        Map<Integer, List<Integer>> map = new HashMap<>();

        for (int i = 0; i < edges.length; i++) {
            map.put(i, new ArrayList<>());
        }

        for (int i = 0; i < edges.length; i++) {
            int a = edges[i][0], b = edges[i][1];
            map.get(a).add(b);
            map.get(b).add(a);
        }
        return map;
    }
}
