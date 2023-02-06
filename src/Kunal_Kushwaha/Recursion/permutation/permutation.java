package Kunal_Kushwaha.Recursion.permutation;

import java.util.HashSet;
import java.util.Set;

public class permutation {
    public static void main(String[] args) {
//        Permutation("", "abc");
//        duplicatePermutation("", "abac");
    }

    static void Permutation(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i);
            Permutation(f + ch + s, up.substring(1));
        }
    }

    // Monu
    static void duplicatePermutation(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        for (int i = 0; i < up.length(); i++) {
            char ch = up.charAt(i);
            boolean flag = true;
            for (int j = i + 1; j < up.length(); j++) {
                if (up.charAt(j) == ch) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                String ros = up.substring(0, i) + up.substring(i + 1);
                duplicatePermutation(p + ch , ros);
            }
        }
    }
}
