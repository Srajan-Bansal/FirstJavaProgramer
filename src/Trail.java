import java.util.Arrays;public class Trail {    public static void main(String[] args) {        int[] arr = {1, -2, -3, 4, -1, 2, 1};        System.out.println(Arrays.toString(reverse(arr)));    }    static int[] reverse(int[] arr) {        if (arr.length < 2) {            return arr;        }        int i = 0;        int length = arr.length - 1;        while (i <= arr.length / 2) {            int temp = arr[i];            arr[i] = arr[length];            arr[length] = temp;            i++;            length--;        }        return arr;    }}