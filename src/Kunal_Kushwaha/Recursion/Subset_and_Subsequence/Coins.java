package Kunal_Kushwaha.Recursion.Subset_and_Subsequence;

public class Coins {
    public static void main(String[] args) {
//        subSequence("", "abc");
//        subSequence("", 15);

        sequence("", 4);
//        System.out.println(countSequence("", 3));
    }

    static void subSequence(String ans, String str) {
        if (str.isEmpty()) {
            System.out.println(ans);
            return;
        }
        subSequence(ans + 'H', str.substring(1));
        subSequence(ans + 'T', str.substring(1));
    }

    static void subSequence(String ans, int n) {
        if (n == 0) {
            System.out.println(ans);
            return;
        }
        subSequence(ans + 'H', n - 1);
        subSequence(ans + 'T', n - 1);
    }

//     No two Head can be together
    static void sequence(String str, int n) {
        if (n == 0) {
            System.out.println(str);
            return;
        }
        if (str.length() == 0 || str.charAt(str.length() - 1) != 'H') {
            sequence(str + 'H', n - 1);
        }
        sequence(str + 'T', n - 1);
    }

    static int countSequence(String str, int n) {
        if (n == 0) {
            return 1;
        }
        int a = 0;
        if (str.length() == 0 || str.charAt(str.length() - 1) != 'H') {
            a = countSequence(str + 'H', n - 1);
        }
        int b = countSequence(str + 'T', n - 1);
        return a + b;
    }
}
