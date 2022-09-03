package ElementsOfProgramming.Searching;

public class Q1_SearchASortedArrayForFirstOccurrenceOfK {
    public static void main(String[] args) {
        int[] arr = {-14, -10, 2, 243, 285, 285, 285, 401};
        System.out.println(findFirstOccurrence(arr, 108));
    }

    static int findFirstOccurrence(int[] arr, int target) {
        int s = 0;
        int e = arr.length - 1;
        int ans = -1;

        while (s <= e) {
            int m = s + (e - s) / 2;

            if (arr[m] > target) {
                e = m - 1;
            } else if (arr[m] < target) {
                s = m + 1;
            } else {
                ans = m;
                e = m - 1;
            }
        }
        return ans;
    }
}
