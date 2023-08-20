package Recursion;

import java.util.Arrays;

import Recursion.Maze.regularDownRight;
// https://www.geeksforgeeks.org/check-for-balanced-parenthesis-without-using-stack/

public class CheckForBalancedBracket{
    public static void main(String[] args) {
        char[] expr = "[()]".toCharArray();

        if(check(expr, 4)){
            System.out.println("Balanced");
            return;
        }else{
            System.out.println("Not Balanced");
            return;
        }
    }

    private static boolean check(char[] expr, int n) {
        // System.out.println("______________________"+ expr.length +"_________________" + n);
        if(n == 0) {
            return true;
        }
        if(n == 1) {
            return false;
        }

        if(expr[0] == '}' || expr[0] == ')' || expr[0] == ']') return false;

        char closing = findClosing(expr[0]);
        int i, count = 0;
        for ( i = 1; i < expr.length; i++) {
            if(expr[i] == expr[0]) count++;
            if(expr[i] == closing){
                if(count == 0) break;
                count--;
            }
        }

        // No closing bracket found
        if(i==n) return false;
        // System.out.println("------------------"+ Arrays.toString(expr) + " i"+i);
        if(i==1) return check(Arrays.copyOfRange(expr, 2, n), n-2);
        return check(Arrays.copyOfRange(expr, 1, i), i - 1) && check(Arrays.copyOfRange(expr, (i + 1), n), n - i - 1);
    }

    private static char findClosing(char c) {
        switch (c) {
            case '[': return ']';
            case '(':   return ')';
            case '{': return '}';
            default: return Character.MIN_VALUE;
        }
    }
}