package Recursion;

import java.util.Arrays;
// https://www.geeksforgeeks.org/recursive-programs-to-find-minimum-and-maximum-elements-of-array/
public class MinMaxElements {
    public static void main(String[] args) {
        int[] arr = Helpers.CreateIntArrayWithoutDuplicates(5);
        System.out.println(Arrays.toString(arr));
        helper(arr, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
    }

    static void helper(int[] arr, int i, int min, int max){
        if(i == arr.length) {
            System.out.println("MIN: "+ min + " MAX: "+ max);
            return;
        }

        if(arr[i]>max) max = arr[i];
        if(arr[i]<min) min = arr[i];

        helper(arr, ++i, min, max);
    }
}
