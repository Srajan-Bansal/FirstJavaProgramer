package Kunal_Kushwaha.backtracking;

public class SudokuSolver {
    public static void main(String[] args) {

    }

    static boolean solve(int[][] board) {
        int n = board.length;
        int row = -1;
        int col = -1;

        boolean emptyLeft = false;

        // this is how we are replacing the r, c from argument
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 0) {
                    row = i;
                    col = j;
                    emptyLeft = true;
                    break;
                }
            }
            // if you found some empty element in  row, then break
            if (emptyLeft) {
                break;
            }
        }
        if (!emptyLeft) {
            return true;
            // Sudoku is solved
        }

        // backtrack
        for (int number = 1; number <= 9; number++) {
            if (isSafe(board, row, col, number)) {
                board[row][col] = number;
                if (solve(board)) {
                    // found the answer
                    display(board);
                    return true;
                } else {
                    board[row][col] = 0;
                }
            }
        }
        return false;
    }

    static boolean isSafe(int[][] board, int row, int col, int num) {
        // check the row
        for (int i = 0; i < board.length; i++) {
            // check if the number is in the row
            if (board[row][col] == num) {
                return false;
            }
        }

        // check the col
        for (int i = 0; i < board[0].length; i++) {
            // check if the number is in the row
            if (board[col][row] == num) {
                return false;
            }
        }

        int sqrt = (int) (Math.sqrt(board.length));
        int rowStart = row - row % sqrt;
        int colStart = col - col % sqrt;

        for (int r = rowStart; r < rowStart + sqrt; r++) {
            for (int c = colStart; c < colStart + sqrt; c++) {
                if (board[r][c] == num) {
                    return false;
                }
            }
        }

        return true;
    }

    static void display(int[][] board) {
        for (int[] row : board) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
