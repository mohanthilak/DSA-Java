package Recursion;

import java.util.Arrays;

public class RotatedBinarySearch {
    public static void main(String[] args) {
        int arr[] = Helpers.createRotatedArray(10, 3);
        System.out.println("Q: Find the position of element " + arr[8] + " in: " + Arrays.toString(arr));
        System.out.println("Position of the Element is: "+ helper(arr, 0, arr.length-1, arr[8]));        
    }

    private static int helper(int[] arr, int start, int end, int target) {
        int mid = start + (end-start)/2;
        if(arr[mid] == target) {
            return mid;
        } 
        if(arr[start]<=arr[mid]) {
            if(target >= arr[start] && target < arr[mid]) {
                return helper(arr, start, mid-1, target);
            }else{
                return helper(arr, mid+1, end, target);
            }
        }
        if(target > arr[mid] && target <= arr[end]) return helper(arr, mid+1, end, target);
        
        return helper(arr, start, mid-1, target);
    }

}