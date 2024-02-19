package Kunal_Kushwaha.Maths;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Prime_SoE {
    public static void main(String[] args) {
        // Naive
        int n = 40;
//        for (int i = 2; i <= n; i++) {
//            System.out.println(i + " " + isPrime(n));
//        }
        // sieve of Eratosthenes
//        int m = 40;
//        boolean[] arr = new boolean[m + 1];
//        sieve(m, arr);

        System.out.println(Arrays.toString(segmentedRange(100, 150)));
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

    static boolean[] segmentedRange(int low, int high) {
        int root = (int) (Math.sqrt(high)) + 1;
        boolean[] prime = SOE(root);

        boolean[] arr = new boolean[high - low + 1];
        for (int i = 2; i * i <= high; i++) {
            if (!prime[i]) {
                for (int j = Math.max(i * i, (low + i - 1) / i * i); j <= high; j += i) {
                    arr[j - low] = true;
                }
            }
        }
        if (low == 1) arr[0] = true;
        return arr;
    }

    static boolean[] SOE(int n) {
        boolean[] arr = new boolean[n + 1];
        for (int i = 2; i * i <= n; i++) {
            if (!arr[i]) {
                for (int j = i * 2; j <= n; j += i) {
                    arr[j] = true;
                }
            }
        }
        return arr;
    }
}
