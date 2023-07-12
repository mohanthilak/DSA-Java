package Recursion;

import java.util.Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = Helpers.CreateIntArrayWithoutDuplicates(10);
        System.out.println("Array: "+ Arrays.toString(arr));
        int result = helper(arr, 0, arr[3]);
        System.out.println("Index of the Element "+ arr[3] + " is: "+ result);
    }

    private static int helper(int[] arr, int i, int target){
        if(i == arr.length) return -1;
        if(arr[i] == target) return i;
        return helper(arr, ++i, target);
    }
}
