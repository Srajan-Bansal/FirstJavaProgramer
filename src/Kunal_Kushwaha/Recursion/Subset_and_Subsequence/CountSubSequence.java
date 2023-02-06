package Kunal_Kushwaha.Recursion.Subset_and_Subsequence;

public class CountSubSequence {
    public static void main(String[] args) {
//        sequence("", "abc");
//        System.out.println(count);

        System.out.println(sequence("", "ans"));
    }

//    static int count = 0;
//    static void sequence(String ans, String str) {
//        if (str.isEmpty()) {
//            return;
//        }
//        char ch = str.charAt(0);
//        sequence(ans, str.substring(1));
//        sequence(ans + ch, str.substring(1));
//    }

    static int sequence(String ans, String str) {
        if (str.isEmpty()) {
            return 1;
        }
        char ch = str.charAt(0);
        int a = sequence(ans, str.substring(1));
        int b = sequence(ans + ch, str.substring(1));
        return a + b;
    }
}
