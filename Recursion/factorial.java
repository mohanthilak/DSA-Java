package Recursion;

public class factorial {
    public static void main(String[] args) {
        int n = 10;
        long[] arr = new long[n+1];
        arr[0] = 1;
        arr[1] = 1;
        System.out.println(helper(n, arr));
    }

    private static long helper(int n, long[] arr) {
        if(arr[n] != 0) return arr[n];
        arr[n]= n*helper(n-1, arr);
        return arr[n];
    }

    
}
