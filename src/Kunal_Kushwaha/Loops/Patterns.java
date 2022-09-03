package Kunal_Kushwaha.Loops;

import java.util.Arrays;

public class Patterns {
    public void main(String[] args) {

        // Problem 1
//        for (int i = 1; i <=5; i++) {
//            for (int j = 1; j <=5; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        // Problem 2
//        for (int i = 1; i < 6; i++) {
//            for (int j = 0; j < i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        // Problem 3
//        for(int i = 5; i >= 1 ; i--) {
//            for (int j = 0; j < i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        // Problem 4
//        for (int i = 1; i <= 5; i++) {
//            for (int j = 1; j<= i; j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }

        // Problem 5
//        for (int i = 1; i < 6; i++) {
//            for (int j = 0; j < i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for(int i=5-1; i>=1; i--){
//            for (int j=1; j<=i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        // Problem 6
//        for(int i=1; i<=5; i++){
//            for (int j=5; j>=i; j--){
//                System.out.print(" ");
//            }
//            for (int k=1; k<=i; k++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        // Problem 7
//        for(int i=5; i>=1; i--){
//            for (int j=5; j>=i; j--){
//                System.out.print(" ");
//            }
//            for (int k=1; k<=i; k++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        // Problem 8
//        for (int i=1; i<=6; i++){
//            for (int j=5; j>=i; j--){
//                System.out.print(" ");
//            }
//            for (int k=1; k<=i; i++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }


        int[] arr = {2,3,4,5,7};
        int arr_size = arr.length;
        System.out.println(Arrays.toString(python(arr,arr_size)));
    }
    static int[] python(int[] arr,int n){


        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                for(int k=j+1; j<n; k++){
                    int x = arr[i]*arr[i] , y = arr[j]*arr[j] , z = arr[k]*arr[k];
                    if(x == y+z || y == x+z || z == x+y){
                        return new int[]{x,y,z};
                    }
                }
            }
        }
        return new int[]{-1,-1,-1};
    }
}
