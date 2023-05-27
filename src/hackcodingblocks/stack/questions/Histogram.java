package hackcodingblocks.stack.questions;

import java.util.Stack;

public class Histogram {
    public static void main(String[] args) {
        int[] arr = {2,1,5,6,2,3};
        System.out.println(max_area(arr));
    }

    static int max_area(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int area = 0;
        for (int i = 0; i < arr.length; i++) {
            while (!stack.isEmpty() && arr[i] < arr[stack.peek()]) {
                int r = i, h = arr[stack.pop()];
                if (stack.isEmpty()) {
                    area = Math.max(area, r * h);
                } else {
                    int l = stack.peek();
                    area = Math.max(area, h * (r - l - 1));
                }
            }
            stack.push(i);
        }

        int r = arr.length;
        while (!stack.isEmpty()) {
            int h = arr[stack.pop()];
            if (stack.isEmpty()) {
                area = Math.max(area, r * h);
            } else {
                int l = stack.peek();
                area = Math.max(area, h * (r - l - 1));
            }
        }
        return area;
    }
}
