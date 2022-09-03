package Kunal_Kushwaha.Maths;

import java.util.ArrayList;

public class Factors {
    public static void main(String[] args) {
        int n = 80;
//        factorial1(n);
//        factorial2(n);
        factorial3(n);
    }
    // Time: O(n)
    static void factorial1(int n){
        for (int i = 1; i <= n; i++) {
            if (n%i == 0){
                System.out.print(i + " ");
            }
        }
    }
    // Time: O(sqrt(n))
    static void factorial2(int n){
        for (int i =1; i <= Math.sqrt(n); i++) {
            if (n%i == 0){
                if(n/i == i){
                    System.out.print(i + " ");
                }
                else {
                    System.out.print(i + " " + n/i + " ");
                }
            }
        }
    }
    static void factorial3(int n){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n%i == 0){
                if(n/i == i){
                    System.out.print(i + " ");
                } else {
                    System.out.print(i + " ");
                    list.add(n/i);
                }
            }
        }
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
    }
}
