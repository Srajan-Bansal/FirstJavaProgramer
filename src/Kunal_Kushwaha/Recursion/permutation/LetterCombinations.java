package Kunal_Kushwaha.Recursion.permutation;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinations {
    public static void main(String[] args) {
//        combinations("", "12");
        System.out.println(combinationsList("", "23"));
//        System.out.println(combinationsCount("", "12"));
    }

    static void combinations(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        int digit = up.charAt(0) - '0';
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            combinations(p + ch, up.substring(1));
        }
    }

    static List<String> combinationsList(String p, String up) {
        if (up.isEmpty()) {
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        int digit = up.charAt(0) - '0';
        List<String> list = new ArrayList<>();
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            list.addAll(combinationsList(p + ch, up.substring(1)));
        }
        return list;
    }

    static int combinationsCount(String p, String up) {
        if (up.isEmpty()) {
            return 1;
        }

        int digit = up.charAt(0) - '0';
        int count = 0;
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            count += combinationsCount(p + ch, up.substring(1));
        }
        return count;
    }
}
