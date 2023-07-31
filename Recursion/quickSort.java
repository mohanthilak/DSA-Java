package Recursion;

import java.util.Arrays;

public class quickSort {
    public static void main(String[] args) {
        int[] arr = Helpers.CreateIntArrayWithoutDuplicates(10);
        System.out.println("Before Sorting: "+Arrays.toString(arr));
        sort(arr, 0, arr.length-1);
        System.out.println("After Sorting: " + Arrays.toString(arr));
    }

    private static void sort(int[] arr, int low, int high) {
        if(low >= high) return;
        
        int s = low;
        int e = high;

        int mid = s +(e-s)/2;
        int pivot = arr[mid];
        while(s <= e) {
            System.out.println(Arrays.toString(arr));
            while(arr[s] < pivot){
                s++;
            }
            // System.out.println("low: " + arr[low] + " high: "+ arr[high]+ " element greater on the left side: " + arr[s]);
            while(arr[e] > pivot){
                e--;
            }
            // System.out.println("low: " + arr[low] + " high: "+ arr[high]+ " element smaller on the right side: " + arr[e]);

            if(s<=e){
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                e--;
                s++;
            }
        }

        sort(arr, low, e);
        sort(arr, s, high);
    }
}
