package Algorithims;

public class Kadane_Algorithm {
    public static void main(String[] args) {
        int[] arr = {-1,-2,-3,-4};

        int sum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            maxSum = Math.max(maxSum, sum);

            if (sum < 0) {
                sum = 0;
            }
        }
        System.out.println(maxSum);
    }
}
