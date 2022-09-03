package com.company;
import java.util.Scanner;

public class Loops_Apna_College {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        Problem 1
//        int n = 4;
//        int m = 5;
//        for ( int i=1; i<=n; i++){
//            for (int j=1; j<=m; j++) {
//                System.out.print(" *");
//            }
//            System.out.println("");
//        }

//        problem 2
        int n=4;
        int m=5;
        for (int i=1; i<=n; i++){
            for (int j=1; j<=m; j++ ){
                if (i==1 || j==1 || i==n || j==m){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

//         Problem 3
//       int n = 4;
//       for (int i=1; i<=n; i++){
//           for (int j=1; j<=i; j++){
//               System.out.print("x");
//           }
//           System.out.println();
//       }

//        Problem 4
//        int n = 4;
//        for (int i=n; i>=1; i--){
//            for (int j=1; j<=i; j++){
//                System.out.print("x");
//            }
//            System.out.println();
//        }

//        Problem 5
//        int n = 4;
//        for (int i=1; i<=n; i++){
//            for (int j=1; j<=n-i; j++){
//                System.out.print(" ");
//            }
//            for (int j=1; j<=i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        Problem 6
//        int n=5;
//        for (int i=1; i<=n; i++){
//            for (int j=1; j<=i; j++){
//                System.out.print(j + " ");
//            }
//            System.out.println();
//        }

//        Problem 7
//          int n=4;
//          for (int i=1; i<=n; i++){
//              for (int j=1; j<=n-i+1; j++){
//                  System.out.print(j+" ");
//              }
//              System.out.println();
//          }

    }
}
