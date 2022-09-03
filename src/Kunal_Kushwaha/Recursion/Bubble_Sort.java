package Kunal_Kushwaha.Recursion;

import java.util.Arrays;

public class Bubble_Sort {
    public static void main(String[] args) {

        int[] arr = {4,3,2,1,8};
        bubbleSort(arr, arr.length - 1 , 0);
        System.out.println(Arrays.toString(arr));
    }
    static void bubbleSort(int[] arr, int i, int j) {
        if (i == 0) {
            return;
        }
        if (j < i) {
            if (arr[j + 1] < arr[j]) {
                int temp = arr[j + 1];
                arr[j + 1] = arr[j];
                arr[j] = temp;
            }
            bubbleSort(arr, i, j + 1);
        } else {
            bubbleSort(arr, i - 1, 0);
        }
    }
}
