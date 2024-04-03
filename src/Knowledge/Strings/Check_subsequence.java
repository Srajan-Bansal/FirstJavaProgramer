package Knowledge.Strings;

import java.util.*;

public class Check_subsequence {
    public static int findNumberOfSubsequenceToys(String favToy, String[] toyList) {
        int count = 0;
        for (String toy : toyList) {
            if (isSubsequence(toy, favToy)) {
                count++;
            }
        }
        return count;
    }

    // Helper function to check if a string is a subsequence of another string
    private static boolean isSubsequence(String s, String t) {
        int sIndex = 0, tIndex = 0;
        while (sIndex < s.length() && tIndex < t.length()) {
            if (s.charAt(sIndex) == t.charAt(tIndex)) {
                sIndex++;
            }
            tIndex++;
        }
        return sIndex == s.length();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read Alice's favorite toy
        String favToy = scanner.nextLine();

        // Read the number of toys in the toy list
        int n = Integer.parseInt(scanner.nextLine());

        // Read the toy list
        String[] toyList = new String[n];
        for (int i = 0; i < n; i++) {
            toyList[i] = scanner.nextLine();
        }

        // Find the number of toys that are subsequences of favToy
        int result = findNumberOfSubsequenceToys(favToy, toyList);

        // Output the result
        System.out.println(result);

        scanner.close();
    }
}