package hackcodingblocks.DP;

public class MinimumPathSum {
    public static void main(String[] args) {
        int[][] arr = {{1,3,1}, {1,5,1}, {4,2,1}};
        System.out.println(minPathSum(arr));
    }

    public static int minPathSum(int[][] grid) {
        return minPathSum(grid, 0, 0);
    }

    static int minPathSum(int[][] arr, int row, int col) {
        if (row == arr.length || col == arr[0].length) return Integer.MAX_VALUE;

        if (row == arr.length - 1 && col == arr[0].length - 1) return arr[row][col];

        int h = minPathSum(arr, row, col + 1);
        int v = minPathSum(arr, row + 1, col);
        return Math.min(h, v) + arr[row][col];
    }
}
