package Recursion;

import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int[] arr = Helpers.CreateIntArrayWithoutDuplicates(10);
        System.out.println("Q: "+ Arrays.toString(arr));
        helper(arr, 0, 1, 0);
        System.out.println("A: "+Arrays.toString(arr));
    }

    private static void helper(int[] arr, int i, int j, int min){
        System.out.println("j: "+j +" i: "+i+" MIN: "+ min);
        if(i == arr.length-1) return;
        if(j == arr.length){
            Helpers.swapElementsOfAnArray(arr, min, i);
            helper(arr, i+1, i+2, i+1);
            System.out.println(Arrays.toString(arr));
            return;
        }
        if(arr[min] > arr[j]) {
            helper(arr, i, j+1, j);
            return;
        }else {
            helper(arr, i, j+1, min);
            return;
        }

    }
}
