import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main s = new Main();

        System.out.println(s.isPowerOfTwo(3));
    }

    public boolean isPowerOfTwo(int n) {
        while (n != 0) {
            int val = n << 1;
            n = n << 1;
            if (val == 1 && n != 0) return false;
        }
        return true;
    }
}
