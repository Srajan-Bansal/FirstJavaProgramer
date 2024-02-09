package hackcodingblocks.HashMap;

public class HashCode {
    public static void main(String[] args) {
        String str = "APPLE";
    }

    static long hashcode(String str) {
        long MOD = 1_000_000_007;
        long pow = 1;
        long p = 31;
        long hv = 0;

        for (int i = 0; i < str.length(); i++) {
            int pos = str.charAt(i) - 'A' + 1;
            hv = (hv + (pos * pow) % MOD) % MOD;
            pow = (pow * p) % MOD;
        }
        return hv;
    }
}
