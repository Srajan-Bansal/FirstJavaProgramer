package hackcodingblocks.sliding_window;

public class fixedSize {
    public static void main(String[] args) {
        int[] arr = {1, 2, 7, 5, 11, 3, 2, 1};
        System.out.println(maximumSum(arr, 3));
    }

    static int maximumSum(int[] arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        int ans = sum;
        for (int i = k; i < arr.length; i++) {
            sum += arr[i] - arr[i - k];
            ans = Math.max(ans, sum);
        }
        return ans;
    }
}
