package hackcodingblocks.KMP;

public class Happy_prefix {
    public static void main(String[] args) {

    }

    static String happyPrefix(String str) {
        int[] dp = new int[str.length()];
        int len = 0;
        for (int i = 1; i < dp.length; ) {
            if (str.charAt(i) == str.charAt(len)) {
                len++;
                dp[i] = len;
                i++;
            } else {
                if (len > 0) len = dp[len - 1];
                else i++;
            }
        }
        int k = dp[str.length() - 1];
        return str.substring(0, k);
    }
}
