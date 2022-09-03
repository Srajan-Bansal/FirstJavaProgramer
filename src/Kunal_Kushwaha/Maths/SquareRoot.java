package Kunal_Kushwaha.Maths;

public class SquareRoot {
    public static void main(String[] args) {
        int n = 40;
        int p = 3;
//        System.out.println(sqrtInt(n, p));
        System.out.println(sqrtDouble(n, p));
    }

    static int sqrtInt(int n, int p) {
        // For Integer value
        int s = 0;
        int e = n;
        int m = s + (e - s) / 2;

        while (s <= e) {
            m = s + (e - s) / 2;

            if(m * m == n){
                break;
            }
            if (m * m < n) {
                s = m + 1;
            } else if (m * m > n) {
                e = m - 1;
            }
        }
        return m;
    }
    static double sqrtDouble(int num, int precision){
        // For precise value
        double root = 0.0;
        double incr = 0.1;

        for (int i = 0; i < precision; i++) {
            while (root * root <= num){
                root += incr;
            }
            root -= incr;
            incr /= 10;
        }

        return root;
    }
}
