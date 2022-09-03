package Kunal_Kushwaha.Search;

import java.util.Arrays;

public class BinarySearch_Questions {

    // Ques.1 - Find ceiling in Binary Search

//    public static void main(String[] args) {
//        int[] arr = {2,3,5,9,14,16,18};
//        int target = 15;
//        int ans = ceilingBinarySearch(arr,target);
//        System.out.println(ans);
//    }
//    static int ceilingBinarySearch(int[] arr,int target) {
//        int start = 0;
//        int end = arr.length - 1;
//
//        if(target > arr[arr.length - 1]){
//            return -1;
//        }
//        while (start <= end) {
//            int mid = start + (end - start) / 2;
//            if (arr[mid] < target) {
//                start = mid + 1;
//            } else if (arr[mid] > target) {
//                end = mid - 1;
//            } else {
//                return arr[mid];
//            }
//        }
//        return arr[start];
//    }

    // Ques.2 - Find floor in Binary Search
//    public static void main(String[] args) {
//        int[] arr = {2,3,5,9,14,16,18};
//        int target = 1;
//        int ans = floorBinarySearch(arr,target);
//        System.out.println(ans);
//    }
//    static int floorBinarySearch(int[] arr,int target) {
//        int start = 0;
//        int end = arr.length - 1;
//
//        if(target < arr[arr.length - 1]){
//            return -1;
//        }
//        while (start <= end) {
//            int mid = start + (end - start) / 2;
//            if (arr[mid] < target) {
//                start = mid + 1;
//            } else if (arr[mid] > target) {
//                end = mid - 1;
//            } else {
//                return arr[mid];
//            }
//        }
//        return arr[end];
//    }

    // Ques.3 - Smallest Letter
//    public static void main(String[] args) {
//        char[] arr = {'c','f','j'};
//        char target = 'a';
//        char ans = ceilingCharBinarySearch(arr,target);
//        System.out.println(ans);
//    }
//    static char ceilingCharBinarySearch(char[] arr,char target) {
//        int start = 0;
//        int end = arr.length - 1;
//
//        if(target > arr[arr.length - 1]){
//            return 'a';
//        }
//        while (start <= end) {
//            int mid = start + (end - start) / 2;
//            if (arr[mid] < target) {
//                start = mid + 1;
//            } else if (arr[mid] > target) {
//                end = mid - 1;
//            } else {
//                return arr[mid];
//            }
//        }
//        return arr[start];
//    }
}

