package Recursion;
// https://leetcode.com/problems/power-of-three/
public class PowerOfThree {
    public static void main(String[] args) {
        int a = 129140163;
        System.out.println(helper(3, a));
    }

    private static boolean helper(int i, int n) {
        if(i == n) return true;
        if(i>n) return false;
        return i*3*3 <= n? helper(i*3*3, n): helper(i*3, n);
    }
}
