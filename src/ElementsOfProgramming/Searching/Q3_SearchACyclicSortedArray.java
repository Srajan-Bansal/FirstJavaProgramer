package ElementsOfProgramming.Searching;

public class Q3_SearchACyclicSortedArray {
    public static void main(String[] args) {
        int[] arr = {378, 478, 550, 551, 631, 103, 203, 220, 234, 279, 368};
        System.out.println(findMin(arr));
    }
    static int findMin(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid < arr.length - 1 && arr[mid] > arr[mid + 1]) {
                return arr[mid + 1];
            }
            if (mid > 0 && arr[mid] < arr[mid - 1]) {
                return arr[mid];
            }
            if (arr[start] > arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
            if (mid == arr.length - 1) {
                return arr[0];
            }
        }
        return arr[arr.length - 1];
    }
}
