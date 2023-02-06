package Kunal_Kushwaha.backtracking;

public class MazeAllPaths {
    public static void main(String[] args) {
        boolean[][] maze = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };

        allPaths(maze, 0, 0, maze.length - 1, maze[0].length - 1, "");
    }

    static void allPaths(boolean[][] maze, int r, int c, int er, int ec, String p) {
        if (r == er && c == ec) {
            System.out.println(p);
            return;
        }

        if (!maze[r][c]) {
            return;
        }
        maze[r][c] = false;

        if (r < er) {
            allPaths(maze, r + 1, c, er, ec, p + "D");
        }
        if (c < ec) {
            allPaths(maze, r, c + 1, er, ec, p + "R");
        }
        if (r > 0) {
            allPaths(maze, r - 1, c, er, ec, p + "U");
        }
        if (c > 0) {
            allPaths(maze, r, c - 1, er, ec, p + "L");
        }

        maze[r][c] = true;
    }
}
