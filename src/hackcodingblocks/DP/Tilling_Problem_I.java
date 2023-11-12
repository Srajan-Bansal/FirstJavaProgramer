package hackcodingblocks.DP;

import java.util.*;

public class Tilling_Problem_I {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        long a = 0, b = 1, c = 0;
        for (int i = 0; i < n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        System.out.println(c);
    }
}
