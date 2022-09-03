package Kunal_Kushwaha.Recursion.Subset_and_Subsequence;

import java.util.ArrayList;

public class Permutations {
    public static void main(String[] args) {
        String str = "abc";
//        permutations("", str);

//        ArrayList<String> ans = permutationsArrayList("", str);
//        System.out.println(ans);

        int result = permutationsInt("", str);
        System.out.println(result);
    }

    static void permutations(String p, String up) {
        if (up.isEmpty()) {
            System.out.print(p);
            return;
        }
        char ch = up.charAt(0);

        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            permutations(f + ch + s, up.substring(1));
        }
    }

    static ArrayList<String> permutationsArrayList(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);

        ArrayList<String> ans = new ArrayList<>();

        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            ans.addAll(permutationsArrayList(f + ch + s, up.substring(1)));
        }
        return ans;
    }

    static int permutationsInt(String p, String up) {
        if (up.isEmpty()) {
            return 1;
        }
        char ch = up.charAt(0);
        int count = 0;

        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            count = count + permutationsInt(f + ch + s, up.substring(1));
        }
        return count;
    }
}
