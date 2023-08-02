package Recursion.Maze;

public class PrintPath {
    public static void main(String[] args) {
        int[][] mat = new int[3][3];
        helper(0,0,mat,0);
    }

    private static void helper(int i, int j, int[][] mat, int k) {
        if(i == mat.length-1 && j == mat.length-1){
            mat[i][j] = k+1;
            printMat(mat);
            return;
        }
        if(mat[i][j] != 0) return;
        mat[i][j] = ++k;
        if(i < mat.length-1){
            helper(i+1, j, mat, k);
        }
        if(j<mat[0].length-1){
            helper(i, j+1, mat, k);
        }
        if(i>0) helper(i-1, j, mat, k);
        if(j>0) helper(i, j-1, mat, k);
        mat[i][j] = 0;
    }

    private static void printMat(int[][] mat) {
        System.out.print("[");
        for (int i = 0; i < mat.length; i++) {
            if(i!=0) System.out.print(" ");
            System.out.print("[");
            for (int j = 0; j < mat[0].length; j++) {
                System.out.print(mat[i][j]);
                if(j!=mat.length-1)System.out.print(", ");
            }
            System.out.print("]");
            if(i != mat.length-1) System.out.println();
        }
        System.out.println("]");
        System.out.println();
    }
}
