package Kunal_Kushwaha.Search;

public class FindInIInfiniteArray {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 8, 12, 13, 17, 19, 28, 39, 103, 123, 140, 2040};
        int target = 140;
        System.out.println(findingRange(arr, target));
    }

    static int findingRange(int[] arr, int target) {

        int start = 0;
        int end = 1;

        while (target > arr[end]) {
            int newStart = end + 1;
            end = end + 2 * (end - start + 1);
            start = newStart;
        }
        return binarySearch(arr, target, start, end);
    }

    static int binarySearch(int[] arr, int target, int start, int end) {

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
