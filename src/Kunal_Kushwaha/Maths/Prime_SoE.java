package Kunal_Kushwaha.Maths;

public class Prime_SoE {
    public static void main(String[] args) {
        // Naive
        int n = 40;
//        for (int i = 2; i <= n; i++) {
//            System.out.println(i + " " + isPrime(n));
//        }
        // sieve of Eratosthenes
        int m = 40;
        boolean[] arr = new boolean[m + 1];
        sieve(m, arr);
    }

    static boolean isPrime(int n) {
        if (n < 1) {
            return false;
        }
        int c = 2;
        while (c * c <= n) {
            if (n % c == 0) {
                return false;
            }
            c++;
        }
        return true;
    }

    static void sieve(int n, boolean[] arr) {
        for (int i = 2; i * i <= n; i++) {
            if (!arr[i]) {
                for (int j = i * 2; j <= n; j += i) {
                    arr[j] = true;
                }
            }
        }
//        for (int i = 0; i < arr.length; i++) System.out.print(i + " ");
        for (int i = 2; i <= n; i++) {
            if (!arr[i]) {
                System.out.print(i + " ");
            }
        }
    }
}
