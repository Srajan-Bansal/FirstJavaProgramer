package hackcodingblocks.DP;

import java.util.*;

public class PalindromePartitioning {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        while (t-- > 0) {
            String str = sc.nextLine();

            int[] dp = new int[str.length()];
            Arrays.fill(dp, -1);
            System.out.println(findPalindromePartitioning(str, 0, new ArrayList<>(), dp));
        }
    }


    static int findPalindromePartitioning(String s, int index, List<String> list, int[] dp) {
        if (s.length() == index) return -1;

        if (dp[index] != -1) return dp[index];

        int res = Integer.MAX_VALUE;
        for (int i = 1; index + i <= s.length(); i++) {
            String arr = s.substring(index, index + i);

            if (checkPalindrome(arr)) {
                list.add(arr);
                res = Math.min(res, 1 + findPalindromePartitioning(s, index + i, list, dp));
                list.remove(list.size() - 1);
            }
        }
        return dp[index] = res;
    }


    static boolean checkPalindrome(String str) {
        int start = 0, end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }
}
