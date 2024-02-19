package hackcodingblocks.KMP;

import java.util.Scanner;

public class Haystack_SPOJ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    }

//    public int strStr(String haystack, String needle) {
//        int[] LPS = new int[needle.length()];
//
//        int prevLPS = 0, i = 1;
//        while (i < LPS.length) {
//            if (needle.charAt(i) == needle.charAt(prevLPS)) {
//                LPS[i] = prevLPS + 1;
//                prevLPS += 1;
//            } else if (prevLPS == 0) {
//                LPS[i] = 0;
//            } else {
//                prevLPS = LPS[prevLPS - 1];
//                continue;
//            }
//            i++;
//        }
//
//        for (int j = needle.length(); j < LPS.length; j++) {
//            if (LPS[i] == needle.length()) {
//                System.out.println(j - 2 * needle.length());
//            }
//            System.out.println();
//        }
//    }
}
