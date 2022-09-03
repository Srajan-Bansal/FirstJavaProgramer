package Kunal_Kushwaha.Sorting.Cyclic;

import java.util.Arrays;

class MissingNumber {

    public static void main(String[] args) {
        int[] arr = {4,0,2,1};
        System.out.println(Arrays.toString(missing(arr)));
    }

    static int[] missing(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }

        // Case - 1
        for (int index = 0; index < arr.length; index++) {
            if (index != arr[index]) {
               return new int[]{index};
            }
        }

        // Case - 2
        return new int[]{arr.length};
    }

     static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}