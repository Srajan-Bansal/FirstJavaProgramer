import ElementsOfProgramming.Trees.TreeLeetcode;import Kunal_Kushwaha.LinkedList.Questions.LinkedListLeetcode;import java.util.*;public class Trail implements LinkedListLeetcode, TreeLeetcode {    public static void main(String[] args) {        Trail s = new Trail();    }    public boolean uniqueOccurrences(int[] arr) {        Map<Integer, Integer> map = new HashMap<>();        for (int i = 0; i < arr.length; i++) {            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);        }        Set<Integer> set = new HashSet<>();        for (Integer i : map.values()) {            if (set.contains(i)) return false;            set.add(i);        }        return true;    }}