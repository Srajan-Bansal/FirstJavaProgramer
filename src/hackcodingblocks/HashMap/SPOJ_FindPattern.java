package hackcodingblocks.HashMap;

import java.util.*;

// Rabin-Karp
public class SPOJ_FindPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String str = sc.next(), pattern = sc.next();
            pattern(str, pattern);
        }
    }

    public static void pattern(String str, String pattern) {
        long MOD = 1_000_000_007;
        long pow = 1;
        long pr = 31;
        long hv = 0;

        for (int i = 0; i < str.length(); i++) {
            int pos = str.charAt(i) - 'a' + 1;
            hv = (hv + (pos * pow) % MOD) % MOD;
            pow = (pow * pr) % MOD;
        }

        long[] dp = new long[str.length()];
        long[] pa = new long[str.length()];
        dp[0] = str.charAt(0) - 'a' + 1;
        pa[0] = 1;
        pow = 31;
        for (int i = 1; i < str.length(); i++) {
            dp[i] = (dp[i - 1] + ((str.charAt(i) - 'a' + 1) * pow) % MOD) % MOD;
            pa[i] = pow;
            pow = (pow * pr) % MOD;
        }

        List<Integer> list = new ArrayList<>();
        for (int ei = pattern.length() - 1, si = 0; ei < str.length(); ei++, si++) {
            long curr = dp[ei];
            if (si > 0)  {
                curr = (curr - dp[si - 1]) % MOD;
                curr = (curr + MOD) % MOD;
            }
            if (curr == (hv + pa[si]) % MOD) {
                list.add(si + 1);
            }
        }

        if (list.size() == 0) System.out.println("Not Found");
        else {
            System.out.println(list.size());
            for (int i : list) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
