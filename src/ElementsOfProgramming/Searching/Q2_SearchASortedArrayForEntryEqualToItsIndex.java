package ElementsOfProgramming.Searching;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

// Wrong

public class Q2_SearchASortedArrayForEntryEqualToItsIndex {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5};

        List<Integer> left = findEntryEqualToIndex(arr, true);
        List<Integer> right = findEntryEqualToIndex(arr, false);

        left.addAll(right);

        Set<Integer> s = new LinkedHashSet<Integer>(left);
        System.out.println(s);

    }

    static List<Integer> findEntryEqualToIndex(int[] arr, boolean findStartIndex) {

        int s = 0;
        int e = arr.length - 1;
        List<Integer> list = new ArrayList<>();

        while (s <= e) {
            int m = s + (e - s) / 2;

            if (m > arr[m]) {
                s = m + 1;
            } else if (m < arr[m]) {
                e = m - 1;
            } else {
                list.add(m);
                if (findStartIndex) {
                    s = 0;
                    e = m - 1;
                } else {
                    s = m + 1;
                    e = arr.length - 1;
                }
            }
        }
        return list;
    }
}
