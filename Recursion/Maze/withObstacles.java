package Recursion.Maze;

public class withObstacles{
    public static void main(String[] args) {
        int[][] mat = new int[3][3];
        mat[1][1] = 1;

        helper(0, 0, mat, "");
    }

    private static void helper(int i, int j, int[][] mat, String p) {
        if(i == mat.length-1 && j == mat[0].length-1) {
            System.out.println(p);
            return;
        }

        if(mat[i][j] == 1) return;

        if(i<mat.length-1){
            helper(i+1, j, mat, p+"D");
        }
        if(j<mat[0].length-1){
            helper(i, j+1, mat, p+"R");
        }
    }
}