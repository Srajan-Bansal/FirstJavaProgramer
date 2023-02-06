package Kunal_Kushwaha.Recursion.Subset_and_Subsequence;

import java.util.ArrayList;

public class Subsequence {
    public static void main(String[] args) {
//        subSequence("", "abc");
//        System.out.println(subSequenceArrayList("", "abc"));
//        subSequenceASCII("","abc");
//        System.out.println(subSequenceArrayListASCII("", "abc"));

        // dice
        sumOfSequence(0, 4, "");
    }

    // sum of number of dices 1, 2, 3
    static void sumOfSequence(int src, int des, String ans) {
        if (src == des) {
            System.out.println(ans + " ");
            return;
        }
        if (src > des) return;

        for (int dice = 1; dice <= 3; dice++) {
            sumOfSequence(src + dice, des, ans + dice);
        }
    }

    static void subSequence(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);

        subSequence(p + ch, up.substring(1));
        subSequence(p, up.substring(1));
    }

    static ArrayList<String> subSequenceArrayList(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);

        ArrayList<String> left = subSequenceArrayList(p + ch, up.substring(1));
        ArrayList<String> right = subSequenceArrayList(p, up.substring(1));

        left.addAll(right);
        return left;
    }

    static void subSequenceASCII(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);

        subSequenceASCII(p + ch, up.substring(1));
        subSequenceASCII(p, up.substring(1));
        subSequenceASCII(p + (ch + 0), up.substring(1));
    }


    static ArrayList<String> subSequenceArrayListASCII(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);

        ArrayList<String> first = subSequenceArrayListASCII(p + ch, up.substring(1));
        ArrayList<String> second = subSequenceArrayListASCII(p, up.substring(1));
        ArrayList<String> third = subSequenceArrayListASCII(p + (ch + 0), up.substring(1));

        first.addAll(second);
        first.addAll(third);
        return first;
    }
}
