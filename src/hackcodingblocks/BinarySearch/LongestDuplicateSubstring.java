package hackcodingblocks.BinarySearch;

import java.util.*;

public class LongestDuplicateSubstring {
    public static void main(String[] args) {
        System.out.println(longest("banana"));
    }

    public static String longest(String s) {
        int start = 1, end = s.length();
        String ans = "";

        while (start <= end) {
            int mid = start + (end - start) / 2;
            String str = result(s, mid);
            if (str.length() > 0) {
                ans = str;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }

    public static String result(String s, int mid) {
        long hv = 0, mod = 1_000_000_007, pr = 31, pow = 1;
        for (int i = mid - 1; i >= 0; i--) {
            hv = (hv + ((s.charAt(i) - 'a' + 1) * pow) % mod) % mod;
            if (i > 0) pow = (pow * pr) % mod;
        }

        HashMap<Long, ArrayList<Integer>> map = new HashMap<>();
        map.put(hv, new ArrayList<>()); // empty list add
        map.get(hv).add(0); // zero indx

        for (int si = 0, ei = mid; ei < s.length(); si++, ei++) {
            hv = (hv - ((s.charAt(si) - 'a' + 1) * pow) % mod + mod) % mod;
            hv = (hv * pr) % mod;
            hv = (hv + s.charAt(ei) - 'a' + 1) % mod;
            if (map.containsKey(hv)) {
                String curr = s.substring(si + 1, ei + 1);
                for (int start : map.get(hv)) {
                    if (curr.equals(s.substring(start, start + mid)))
                        return curr;
                }
                map.get(hv).add(si + 1);
            } else {
                map.put(hv, new ArrayList<>());
                map.get(hv).add(si + 1);
            }
        }
        return "";
    }
}
