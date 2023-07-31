package Recursion;

import java.util.Arrays;
// https://www.geeksforgeeks.org/sum-triangle-from-array/
public class SumTriangle {
    public static void main(String[] args) {
        int length = 5;
        int[] arr = Helpers.CreateSortedArray(length);
        helper(arr, new int[length-1], 0 );
        System.out.println(Arrays.toString(arr));
    }
    static void helper(int[] arr,int[] temp, int i){
        if(temp.length == 0) return;
        if(i == temp.length){
            helper(temp, new int[i-1], 0);
            System.out.println(Arrays.toString(temp));
        } 
        if(i<temp.length && i<arr.length-1){
            temp[i] = arr[i] + arr[i+1];
            helper(arr, temp, ++i);
        }
    }
}