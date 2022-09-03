package Kunal_Kushwaha.Search;

import java.util.Arrays;

public class FirstAndLastPosition {
    public static void main(String[] args) {
        int[] arr = {};
        System.out.println(Arrays.toString(searchRange(arr, 0)));
    }

    //    Ques 4 - Find and Last Position in Sorted Array
    static int[] searchRange(int[] arr, int target) {
        if (arr.length == 0) {
            return null;
        }

        int[] ans = {-1, -1};

        // check of first occurrence of target
        ans[0] = search(arr, target, true);
        if (arr[0] != -1) {
            ans[1] = search(arr, target, false);
        }

        return ans;
    }

    // return the index value of target
    static int search(int[] arr, int target, boolean findStartIndex) {

        int ans = -1;

        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                ans = mid;
                if (findStartIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
