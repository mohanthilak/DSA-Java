package Recursion.BackTracking;

public class sudokusolver {
    public static void main(String[] args) {
        int[][] matrix =    {{7, 0, 0, 0, 0, 0, 2, 0, 0},   
                            {4, 0, 2, 0, 0, 0, 0, 0, 3},   
                            {0, 0, 0, 2, 0, 1, 0, 0, 0},   
                            {3, 0, 0, 1, 8, 0, 0, 9, 7},   
                            {0, 0, 9, 0, 7, 0, 6, 0, 0},   
                            {6, 5, 0, 0, 3, 2, 0, 0, 1},   
                            {0, 0, 0, 4, 0, 9, 0, 0, 0},   
                            {5, 0, 0, 0, 0, 0, 1, 0, 6},   
                            {0, 0, 6, 0, 0, 0, 0, 0, 8}};
        helper(matrix);
        printMat(matrix);

    
    }

    private static boolean helper(int[][] mat){
        int row = -1;
        int col = -1;
        boolean isempty = true;

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if(mat[i][j] == 0){
                    row = i;
                    col = j;
                    isempty = false;
                    break;
                }
            }
            if(!isempty){
                break;
            }
        }
        if(isempty){
            return true;
        }

        for (int i = 1; i <= 9; i++) {
            if(isSafe(mat, row, col, i)){
                mat[row][col] = i;
                if(helper(mat)){
                    return true;
                }else{
                    mat[row][col] = 0;
                }
            }
        }

        return false;
    }

    private static boolean isSafe(int[][]mat, int row, int col, int n){
        // Check Row
        for (int i = 0; i < mat.length; i++) {
            if(mat[row][i] == n)return false;
        }

        // Check Col
        for (int i = 0; i < mat.length; i++) {
            if(mat[i][col] == n) return false;
        }

        // Check the Block;
        int startRow = row - row%3;
        int startCol = col - col%3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <3; j++) {
                if(mat[startRow+i][startCol+j]==n) return false;
            }
        } 
        return true;
    }

    private static void printMat(int[][] mat) {
        // System.out.print("[");
        for (int i = 0; i < mat.length; i++) {
            if(i!=0) System.out.print(" ");
            // System.out.print("[");
            for (int j = 0; j < mat[0].length; j++) {
                System.out.print(mat[i][j]);
                // if(j!=mat.length-1)System.out.print(", ");
            }
            // System.out.print("]");
            if(i != mat.length-1) System.out.println();
        }
        // System.out.println("]");
        System.out.println();
    }
}
