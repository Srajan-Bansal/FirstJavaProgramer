package Kunal_Kushwaha.Search;

import java.util.Arrays;

public class BinarySearch_2D {
//    public static void main(String[] args) {
//        int[][] matrix = {
//                {10, 20, 30, 40},
//                {15, 25, 35, 45},
//                {28, 29, 37, 49},
//                {33, 34, 38, 50}
//        };
//        System.out.println(Arrays.toString(search(matrix, 49)));
//    }
//
//    static int[] search(int[][] matrix, int target) {
//        int row = 0;
//        int col = matrix[0].length - 1;
//
//        while (row < matrix.length && col >= 0) {
//            if (matrix[row][col] > target) {
//                col--;
//            }
//            if (matrix[row][col] < target) {
//                row++;
//            } else {
//                return new int[]{row, col};
//            }
//        }
//        return new int[]{-1, -1};
//    }

    //  Sorted Array
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        System.out.println(Arrays.toString(search(matrix, 1)));
    }

    // search int the row provided between the columns provided
    static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target) {
        while (cStart <= cEnd) {
            int middle = cStart + (cEnd - cStart) / 2;

            if (matrix[row][middle] < target) {
                cStart = middle + 1;
            } else if (matrix[row][middle] > target) {
                cEnd = middle - 1;
            } else {
                return new int[]{row, middle};
            }
        }
        return new int[]{-1, -1};
    }

    static int[] search(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        if (rows == 1) {
            return binarySearch(matrix, rows, 0, cols - 1, target);
        }

        int rStart = 0;
        int rEnd = rows - 1;
        int cMiddle = cols / 2;

        // run the loop till 2 rows will be remaining
        while (rStart < (rEnd - 1)) {   // while this is true it will have more than 2 row
            int middle = rStart + (rEnd - rStart) / 2;

            if (matrix[middle][cMiddle] < target) {
                rStart = middle;
            } else if (matrix[middle][cMiddle] > target) {
                rEnd = middle;
            } else {
                return new int[]{middle, cMiddle};
            }
        }

        // now we have 2 row
        // check weather the target is in thew= col of 2 row
        if (matrix[rStart][cMiddle] == target) {
            return new int[]{rStart, cMiddle};
        }
        if (matrix[rStart + 1][cMiddle] == target) {
            return new int[]{rStart + 1, cMiddle};
        }

        // Search in 1st half
        if (target >= matrix[rStart][cMiddle - 1]) {
            return binarySearch(matrix, rStart, 0, cMiddle - 1, target);
        }
        // Search in 2nd half
        if (target <= matrix[rStart][cMiddle + 1] && target >= matrix[rStart][cols - 1]) {
            return binarySearch(matrix, rStart, cMiddle, cols - 1, target);

        }
        // Search in 3rd half
        if (target <= matrix[rStart + 1][cMiddle - 1]) {
            return binarySearch(matrix, rStart + 1, 0, cMiddle - 1, target);
        }
        // Search in 4th half
        else {                       //if(target >= matrix[rStart + 1][cMiddle + 1]){
            return binarySearch(matrix, rStart + 1, cMiddle + 1, cols - 1, target);
        }
    }
}
