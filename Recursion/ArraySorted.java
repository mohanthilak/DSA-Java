package Recursion;

import java.util.Arrays;

public class ArraySorted {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for(int i=0; i<10; i++){
            arr[i] = Helpers.CreateARandomNumber(0, 100);
        }
        // 0==notSort | 1==Sort
        int sortOrNotSort = Helpers.CreateARandomNumber(0, 1);
        System.out.println("Sort or Not-Sort: " + sortOrNotSort);
        if(sortOrNotSort==1){
            SortArray(arr);
        }
        System.out.println("Array:"+Arrays.toString(arr));
        System.out.println("Answer:"+ CheckIfArrayIsSorted(arr, 0));
    
    }

    private static void SortArray(int[] arr) {
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[j]<arr[i]){
                    Helpers.swapElementsOfAnArray(arr, i, j);
                }
            }
        }
    }

    private static boolean CheckIfArrayIsSorted(int[] arr, int i) {
        if(i == arr.length-1) return true;
        return arr[i]<arr[i+1] && CheckIfArrayIsSorted(arr, ++i);
    }


}
