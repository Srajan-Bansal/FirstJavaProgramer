package Kunal_Kushwaha.Sorting.Cyclic;

import java.util.ArrayList;
import java.util.List;

public class FindDisappearedNumber {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(missing(arr));
    }

    static List<Integer>  missing(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            } else {
                i++;
            }
        }

        List<Integer> list = new ArrayList<>();
        for (int index = 0; index < arr.length; index++) {
            if (index + 1 != arr[index]) {
                list.add(index + 1);
            }
        }
        return list;
    }
}
