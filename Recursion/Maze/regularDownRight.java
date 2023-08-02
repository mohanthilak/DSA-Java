package Recursion.Maze;

public class regularDownRight {
    public static void main(String[] args) {
        int[][] maze = new int[3][3];

        helper(0,0, maze, "");
    }

    private static void helper(int i, int j, int[][] maze, String p) {
        if(i == maze.length-1 && j == maze[0].length-1){
            System.out.println(p);
            return;
        }
        if(i<maze.length-1){
            helper(i+1, j, maze, p+"D");
        }
        if(j<maze[0].length-1){
            helper(i, j+1, maze, p+"R");
        }
    }
}
