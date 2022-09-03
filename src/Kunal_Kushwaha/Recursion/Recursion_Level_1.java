package Kunal_Kushwaha.Recursion;

public class Recursion_Level_1 {
    public static void main(String[] args) {
//         print_1_to_N(5);

//        print_N_to_1(5);

//        int ans = product_N_to_1(5);
//        System.out.println(ans);

//        int sum = sum_1_to_N(5);
//        System.out.println(sum);

//        int ans = sumOfDigits(1234);
//        System.out.println(ans);

//        int ans = productOfDigits(2013);
//        System.out.println(ans);

        reverseNumber(1234);
        System.out.println(sum);
    }
    // Ques.1
    static void print_1_to_N(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n + " ");
        print_1_to_N(n-1);
    }
    // Ques.2
    static void print_N_to_1(int n) {
        if (n == 0) {
            return;
        }
        print_N_to_1(n-1);
        System.out.print(n + " ");
    }
    // Ques.3
    static int product_N_to_1(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * product_N_to_1(n-1);
    }
    // Ques.4
    static int sum_1_to_N(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sum_1_to_N(n-1);
    }
    // Ques.5
    static int sumOfDigits(int n) {
        if (n == 0) {
            return 0;
        }
        return (n % 10) + sumOfDigits(n/10);
    }
    // Ques.6
    static int productOfDigits(int n) {
        if (n == 0) {
            return 0;
        }
        return (n % 10) * productOfDigits(n/10);
    }
    // Ques.7
    static int sum = 0;
    static void reverseNumber(int n) {
        if (n == 0) {
            return;
        }
        int rem = n % 10;
        sum = sum * 10 + rem;
        reverseNumber(n/10);
    }
}
