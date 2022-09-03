package Kunal_Kushwaha.Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 2, 3, 1};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selection(int[] arr){
        for (int i = 0; i < arr.length; i++){
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr,0, last);
            swap(arr, maxIndex, last);
        }
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++){
            if (arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }

//    static void selectionSort(int[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            int minIndex = getMinIndex(arr, i, arr.length - 1);
//            swap(arr, i, minIndex);
//        }
//    }
//
//    static int getMinIndex(int[] arr, int start, int end) {
//        int min = start;
//        for (int i = start; i <= end; i++) {
//            if (arr[min] > arr[i]) {
//                min = i;
//            }
//        }
//        return min;
//    }
//
//    static void swap(int[] arr, int first, int second) {
//        int temp = arr[first];
//        arr[first] = arr[second];
//        arr[second] = temp;
//    }
}
