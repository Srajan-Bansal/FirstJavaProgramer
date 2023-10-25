package hackcodingblocks.DP;

public class Distinct_Subsequences {
    public static void main(String[] args) {
        String a = "rabbbit", b = "rabbit";
    }

    // s -> coins
    // t -> amount
    // i = s1.index, j = s2.index
    static int distinctSubsequence(String s, String t, int i, int j) {
        if (j == t.length()) return 1;
        if (i == s.length()) return 0;

        int inc = 0, exc = 0;
        if (s.charAt(i) == t.charAt(j)) {
            inc = distinctSubsequence(s, t, i + 1, j + 1);
        }
        exc = distinctSubsequence(s, t, i + 1, j);
        return inc + exc;
    }
}
