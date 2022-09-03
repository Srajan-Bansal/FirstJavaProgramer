package com.company;

public class Practise_Set7 {

    // Problem 1
    static void table(int n){
        for (int i=1; i<=10; i++){
            System.out.format("%d X %d = %d\n",n,i,n*i);
        }
    }

    // Problem 2
    static void pattern1(int n){
        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Problem 3
    static int sumRec(int n){
        // Base condition
        if (n==1){
            return 1;
        }
       return n + sumRec(n-1);
    }

    // Problem 4
    static void pattern2(int n){
        for (int i=n; i>=1; i--){
            for (int j=i; j>=1; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Problem 5
    static int fibonacci_Series(int n){
//        if (n==1){
//            return 0;
//        } else if (n==2) {
//            return 1;
//        }
         if (n==1 || n==2){
            return n-1;
         } else {
            return fibonacci_Series(n-1) + fibonacci_Series(n-2);
        }
    }

    // Problem 6   Doubt
    static int average(int ...n) {
            int value = 0;
            for (int i = 1; i <= n.length; i++) {
                value = average(i) / n.length;
            }
        return value;
      }


    // Problem 7   IMPORTANT   DOUBT
    static void pattern2_Rec(int n){
        if (n>=1){
        pattern2_Rec(n+1);
        for (int i=1; i<=n; i++) {
            System.out.print("* ");
        }
            System.out.println();
      }
    }



    // Problem 8          IMPORTANT
    static void pattern1_Rec(int n){
        if (n>=1){
            pattern1_Rec(n-1);
            for (int i=1; i<=n; i++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Problem 9
    static float change(float cel){
        float far = (9/5.0f)*cel + 32;
        return far;
    }

    // Problem 10
    static int Sum_Itrative(int n){
        int Sum = 0;
        for (int i=1; i<=n; i++) {
            Sum += i;
        }
        return Sum;
    }


    public static void main(String[] args) {

        // Problem 1
//        table(5);

        // Problem 2
//        pattern1(6);

        // Problem 3
//        System.out.println(sumRec(5));

        // Problem 4
//        pattern2(4);

        // Problem 5
        System.out.println(fibonacci_Series(10));

        // Problem 6
//        System.out.println(average(1,2));


        // Problem 7
//        pattern2_Rec(10);

        // Problem 8
//        pattern1_Rec(10);

        // Problem 9
//        System.out.println(change(37));

        // Problem 10
//        System.out.println(Sum_Itrative(6));
    }
}
