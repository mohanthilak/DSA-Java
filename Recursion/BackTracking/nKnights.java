package Recursion.BackTracking;

public class nKnights {
    public static void main(String[] args) {
        boolean[][] mat = new boolean[4][4];
        display(mat);
        System.out.println();
        helper(mat, 0,0,4);
        // display(mat);
    }


    private static boolean helper(boolean[][] mat, int row, int col, int k) {
        // System.out.println("row: "+ row + " col: " + col);
        if(k == 0){
            display(mat);
            System.out.println();
            return true;
        }
        if(row >= mat.length){
            return false;
        }

        if(col>= mat.length){
            return false;
        }

        for (int i = col; i < mat.length; i++) {
            if(isSafe(mat, row, i)){
                mat[row][i] = true;
            }
            int left = mat[row][i] == true ? k-1 : k;
            if(helper(mat, row, i+1, left)){
                mat[row][i] = false;
                break;
            }
            mat[row][i] = false;
        }
        helper(mat, row+1, 0, k);
        return false;
        // if(isSafe(mat, row, col)){
        //     mat[row][col] = true;
        // }
        // int left = mat[row][col] == true ? k-1 : k;
        // helper(mat, row, col+1, left);
        // mat[row][col] = false;
        // helper(mat, row+1, 0, k);

        // if(isSafe(mat, row, col)){
        //     mat[row][col] = true;
        //     // System.out.println("Calling row: "+ row + " col:"+(col+1) + "with " +(k-1)+ " knights" +" Present Block" + " row:" + row+ " col: "+ col + " value: "+ mat[row][col] + " 1");
        //     // if(helper(mat, row, col+1, k-1)){
        //     //     mat[row][col] = false;
        //     //     // System.out.println("Calling row: "+ row + " col:"+(col+1) + "with " +(k)+ " knights"+" Present Block" + " row:" + row+ " col: "+ col + " value: "+ mat[row][col] + " 2");
        //     //     helper(mat, row, col+1, k);
        //     // }
        //     helper(mat, row, col+1, k-1);
        //     mat[row][col] = false;
        // }else{
        //     // System.out.println("Calling row: "+ row + " col:"+(col+1) + "with " +(k)+ " knights"+" Present Block" + " row:" + row+ " col: "+ col + " value: "+ mat[row][col] + " 3");
        //     if(helper(mat, row, col+1, k)){
        //         return;
        //     }else{
        //         helper(mat, row+1, 0, k);
        //         return;
        //     }
        // }
        // System.out.println("Calling row: "+ (row+1) + " col:"+0 + "with " +(k)+ " knights"+" Present Block" + " row:" + row+ " col: "+ col + " value: "+ mat[row][col] + " 4");
    }

    private static boolean isSafe(boolean[][]mat, int row, int col){
        if(isValid(mat, row-2, col-1)){
            // System.out.println("r:"+ (row-2) + " c:"+(col-2));
            if(mat[row-2][col-1]) return false;
        }

        if(isValid(mat, row-2, col+1)){
            // System.out.println("r:"+ (row-2) + " c:"+(col-2) +"   2");
            if(mat[row-2][col+1]) return false;
        }
        if(isValid(mat, row-1, col-2)){
                // System.out.println("r:"+ (row-2) + " c:"+(col-2) + "   3");
            if(mat[row-1][col-2]) return false;
        }

        if(isValid(mat, row-1, col+2)){
            // System.out.println("r:"+ (row-2) + " c:"+(col-2) + "  4");
            if(mat[row-1][col+2]) return false;
        }
        return true;
    }

    private static boolean isValid(boolean[][] mat, int row, int col){
        if(row>=0 && row<mat.length && col>=0 && col < mat.length){
            return true;
        }
        return false;
    }


    private static void display(boolean[][] board) {
        for(boolean[] row : board) {
            for(boolean element : row) {
                if (element) {
                    System.out.print("K ");
                } else {
                    System.out.print("O ");
                }
            }
            System.out.println();
        }
    }
}
