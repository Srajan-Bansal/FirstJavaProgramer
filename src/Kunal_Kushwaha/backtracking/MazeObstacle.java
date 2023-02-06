package Kunal_Kushwaha.backtracking;

public class MazeObstacle {
    public static void main(String[] args) {
        boolean[][] maze = {
                {true, true, true},
                {true, false, true},
                {true, true, true}
        };
        permutationRestriction(maze, 0, 0, "");
    }

    static void permutationRestriction(boolean[][] maze, int r, int c, String p) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }

        if (!maze[r][c]) return;

        if (r < maze.length - 1) {
            permutationRestriction(maze, r + 1, c, p + "D");
        }
        if (c < maze[0].length - 1) {
            permutationRestriction(maze, r, c + 1, p + "R");
        }
    }
}
