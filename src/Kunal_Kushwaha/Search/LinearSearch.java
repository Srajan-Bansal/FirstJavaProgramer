package Kunal_Kushwaha.Search;

public class LinearSearch {
//    public static void main(String[] args) {
//
//        // Find no. of Even digits in  an Array : leetcode (Kunal Kushwaha)
//        int[] p = {1,12,123,1234,12345};
//        System.out.println(findNumber(p));
//    }
//
//    static int findNumber(int[] p){
//        int count =0;
//        for(int num : p){
//            if(even(num)){
//                count++;
//            }
//        }
//        return count;
//    }
//    static boolean even(int num){
//        return digits(num) % 2 == 0;
//    }
//    static int digits(int num){
//
//        if(num<0){
//            num *= -1;
//        }
//        if(num==0){
//            return 1;
//        }
//
//        int count = 0;
//        while(num>0){
//            num = num / 10;
//            count++;
//        }
//        return count;
//    }

    public static void main(String[] args) {

        // Find Wealth : leetcode (Kunal Kushwaha)
//        int[][] account = {{1,5},{7,3},{3,5}};
        int[][] account = {{1,2,3},{3,2,1}};
        System.out.println(wealth(account));
    }
    static int wealth(int[][] account){
        int sum = 0, m = 0;
        for (int row=0; row<account.length; row++) {
            sum = 0;
            for (int col=0; col<account[row].length; col++){
//            System.out.printf("%dst customer has wealth = %d\n",row+1,sum);
                sum += account[row][col];
            }
            if(sum > m){
                m = sum;
            }
        }
        return m;
    }
}
