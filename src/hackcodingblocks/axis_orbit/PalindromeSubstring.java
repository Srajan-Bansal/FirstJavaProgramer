package hackcodingblocks.axis_orbit;

public class PalindromeSubstring {
    public static void main(String[] args) {
        String str = "aaa";
        System.out.println(countPalindrome(str));
    }

    static int countPalindrome(String str) {
        int count = 0;
        // odd
        for (int axis = 0; axis < str.length(); axis++) {
            for (int orbit = 0; axis - orbit >= 0 && axis + orbit < str.length() ; orbit++) {
                if (str.charAt(axis - orbit) == str.charAt(axis + orbit)) count++;
                else break;
            }
        }

        // even
        for (double axis = 0.5; axis < str.length(); axis++) {
            for (double orbit = 0.5; axis - orbit >= 0 && axis + orbit < str.length() ; orbit++) {
                if (str.charAt((int)(axis - orbit)) == str.charAt((int)(axis + orbit))) count++;
                else break;
            }
        }
        return count;
    }
}
