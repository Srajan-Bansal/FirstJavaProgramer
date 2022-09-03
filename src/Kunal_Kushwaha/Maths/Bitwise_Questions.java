package Kunal_Kushwaha.Maths;

public class Bitwise_Questions {
    public static void main(String[] args) {

        // MagicNumber (Amazon)
//        int n = 1;
//
//        int ans = 0;
//        int base = 5;
//        while(n > 0){
//            int last = n & 1;
//            ans += last * base;
//            base = base * 5;
//            n = n>>1;
//        }
//        System.out.println(ans);


        // Number of digits in Binary
//        int m = 10;
//        int b = 2;
//        int res = (int)(Math.log(m) / Math.log(b)) + 1;
//        System.out.println(res);

        // Power to 2
//        int n = 32;
//        if(n==0){
//            System.out.println(false);
//        }
//        else{
//            boolean ans = (n & (n-1)) == 0;
//            System.out.println(ans);
//        }

        // Find number of bits to change to convert a to b
        int n = 2;
        int m = 1;
        int count = 0;

        while(n!=0){
            n = n ^ m;
            n = n>>1;
            if((n&1)==1){
                ++count;
            }
        }
        System.out.println(count);
    }
}
