package hackcodingblocks.Recursion;

public class DuplicatePermutation {
    public static void main(String[] args) {
        duplicatePermutation("", "abca");
    }
    static void duplicatePermutation(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        for (int i = 0; i < up.length(); i++) {
            char ch = up.charAt(i);
            boolean flag = true;
            for (int j = i + 1; j < up.length(); j++) {
                if (up.charAt(j) == ch) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                String ros = up.substring(0, i) + up.substring(i + 1);
                duplicatePermutation(p + ch , ros);
            }
        }
    }
}
