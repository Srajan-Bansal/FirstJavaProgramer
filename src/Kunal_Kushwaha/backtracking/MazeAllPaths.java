package Kunal_Kushwaha.backtracking;

import java.util.Arrays;

public class MazeAllPaths {
    public static void main(String[] args) {
        boolean[][] maze = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };

//        allPaths(maze, 0, 0, maze.length - 1, maze[0].length - 1, "");

        int[][] path = new int[maze.length][maze[0].length];
        allPathsPrint(maze, 0, 0, maze.length - 1, maze[0].length - 1, "", path, 1);
    }

    static void allPaths(boolean[][] maze, int r, int c, int er, int ec, String p) {
        if (r == er && c == ec) {
            System.out.println(p);
            return;
        }

        if (!maze[r][c]) return;
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

    static void allPathsPrint(boolean[][] maze, int r, int c, int er, int ec, String p, int[][] path, int step) {
        if (r == er && c == ec) {
            path[r][c] = step;
            for (int[] arr : path) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }

        if (!maze[r][c]) {
            return;
        }
        maze[r][c] = false;
        path[r][c] = step;

        if (r < er) {
            allPathsPrint(maze, r + 1, c, er, ec, p + "D", path, step + 1);
        }
        if (c < ec) {
            allPathsPrint(maze, r, c + 1, er, ec, p + "R", path, step + 1);
        }
        if (r > 0) {
            allPathsPrint(maze, r - 1, c, er, ec, p + "U", path, step + 1);
        }
        if (c > 0) {
            allPathsPrint(maze, r, c - 1, er, ec, p + "L", path, step + 1);
        }

        maze[r][c] = true;
        path[r][c] = 0;
    }
}
