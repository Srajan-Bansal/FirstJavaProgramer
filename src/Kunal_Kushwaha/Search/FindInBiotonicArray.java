package Kunal_Kushwaha.Search;

public class FindInBiotonicArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 3, 1};
        System.out.println(search(arr, 3));
    }

    static int search(int[] arr, int target) {
        int firstTry = binarySearch(arr, target, 0, peekInMountain(arr));
        if (firstTry != -1) {
            return firstTry;
        }
        return binarySearch(arr, target, peekInMountain(arr) + 1, arr.length - 1);
    }

    static int peekInMountain(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            } else if (arr[mid] > arr[mid + 1]) {
                end = mid;
            }
        }
        return start;
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
