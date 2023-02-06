package hackcodingblocks.Recursion;

public class MazePath {
    public static void main(String[] args) {
        int n = 3, m = 3;
        mazePath(0, 0, n - 1, m - 1, "");
    }

    static void mazePath(int sRow, int sCol, int eRow, int eCol, String p) {
        if (sRow == eRow && sCol == eCol) {
            System.out.println(p);
            return;
        }

        if (sRow > eRow || sCol > eCol) {
            return;
        }

//        if (sRow < eRow) {
        mazePath(sRow + 1, sCol, eRow, eCol, p + "H");
//        }
//        if (sCol < eCol) {
        mazePath(sRow, sCol + 1, eRow, eCol, p + "V");
//        }
        mazePath(sRow + 1, sCol + 1, eRow, eCol, p + "D");
    }
}
