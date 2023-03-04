package Kunal_Kushwaha.backtracking;

public class N_Knight {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        knight(board, 0, 0, 4);
    }

    static void knight(boolean[][] board, int row, int col, int knight) {
        if (knight == 0) {
            display(board);
            System.out.println();
        }

        if (row == board.length - 1 && col == board[0].length) {
            return;
        }

        if (col == board[0].length) {
            knight(board, row + 1, 0, knight);
            return;
        }

        if (isSafe(board, row, col)) {
            board[row][col] = true;
            knight(board, row, col + 1, knight - 1);
            board[row][col] = false;
        }

        knight(board, row, col + 1, knight);
    }

    static boolean isSafe(boolean[][] board, int row, int col) {
        if (isValid(board, row - 2, col - 1)) {
            if (board[row - 2][col - 1]) {
                return false;
            }
        }
        if (isValid(board, row - 1, col - 2)) {
            if (board[row - 1][col - 2]) {
                return false;
            }
        }
        if (isValid(board, row - 2, col + 1)) {
            if (board[row - 2][col + 1]) {
                return false;
            }
        }
        if (isValid(board, row - 1, col + 2)) {
            if (board[row - 1][col + 2]) {
                return false;
            }
        }
        return true;
    }

    // do not repeat this function, hence created this function
    static boolean isValid(boolean[][] board, int row, int col) {
        if (row >= 0 && row < board.length && col >= 0 && col < board[0].length) {
            return true;
        }
        return false;
    }

    static void display(boolean[][] board) {
        for (boolean[] row : board) {
            for (boolean ele : row) {
                if (ele) System.out.print("K ");
                else System.out.print("X ");
            }
            System.out.println();
        }
    }
}
