package Recursion.BackTracking;

public class nQueens {
    public static void main(String[] args) {
        boolean[][] mat = new boolean[4][4];
        display(mat);
        System.out.println();
        helper(mat, 0);
    }

    private static void helper(boolean[][] mat, int row) {
        if(row == mat.length) {
            display(mat);
            System.out.println();
            return;
        }  
        for(int col=0; col<mat.length; col++){
            if(isSafe(mat, col, row)){
                mat[row][col] = true;
                helper(mat, row+1);
                mat[row][col] = false;
            }
        }

    }

    private static boolean isSafe(boolean[][] mat, int col, int row){
        //check col
        for (int i = 0; i < row; i++) {
            if(mat[i][col])return false;
        }

        //left diagonal
        int min_left = Math.min(col, row);
        for(int i=1; i<= min_left; i++){
            if(mat[row-i][col-i]) return false;
        }

        //right diagonal
        int min_right = Math.min(mat.length-col-1, row);
        for (int i = 1; i <= min_right; i++) {
            if(mat[row-i][col+i]) return false;
        }

        return true;
    }

    private static void display(boolean[][] board) {
        for(boolean[] row : board) {
            for(boolean element : row) {
                if (element) {
                    System.out.print("Q ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}
