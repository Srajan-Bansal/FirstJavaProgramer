package hackcodingblocks.sliding_window;

public class max_A_and_B {
    public static void main(String[] args) {
        String str = "abbbaababab";
        int k = 3;
        int a = maxLength(str, k, 'a');
        int b = maxLength(str, k, 'b');
        System.out.println(Math.max(a, b));
    }

    static int maxLength(String str, int k, char ch) {
        int si = 0, ei = 0, flip = 0, ans = 0;

        while (ei < str.length()) {
            char c = str.charAt(ei);
            if (c == ch) flip++;

            while (flip > k && si <= ei) {
                c = str.charAt(si);
                if (c == ch) flip--;
                si++;
            }

            ans = Math.max(ans, ei - si + 1);
            ei++;
        }
        return ans;
    }
}
