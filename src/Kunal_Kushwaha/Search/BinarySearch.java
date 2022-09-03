package Kunal_Kushwaha.Search;

public class BinarySearch {
    public static void main(String[] args) {
        // When array is sorted ex. Ascending
        int[] arr = {2, 4, 6, 11, 12, 14, 20, 36, 48};
        int target = 36;
        int ans = binarySearch(arr, target);
        System.out.println(ans);

        // When we don't know array is sorted
//        int[] arr = {2,4,6,11,12,14,20,36,48};
//        int[] arr = {48, 36, 20, 14, 12, 11, 6, 4, 2};
//        int target = 6;
//        int ans = orderAgnosticBinarySearch(arr, target);
//        System.out.println(ans);
    }

    static int orderAgnosticBinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[start] < arr[end]) {
                if (arr[mid] < target) {
                    start = mid + 1;
                } else if (arr[mid] > target) {
                    end = mid - 1;
                } else {
                    return mid;
                }
            } else {
                if (arr[mid] > target) {
                    start = mid + 1;
                } else if (arr[mid] < target) {
                    end = mid - 1;
                } else {
                    return mid;
                }
            }
        }
        return -1;
    }

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

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
