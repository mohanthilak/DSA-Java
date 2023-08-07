package Recursion;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = Helpers.CreateIntArrayWithoutDuplicates(10);
        System.out.println(Arrays.toString(arr));
        InsertionSortWithRecursion(arr, 1);
        System.out.println(Arrays.toString(arr));
        // InsertionSortWithoutRecursion(arr);
        // int[] newarr = arr.clone();
        // BubbleSortWithoutRecursion(newarr);

    }

    private static void InsertionSortWithRecursion(int[] arr, int i) {
        if(i == arr.length) return;
        int bufi = i;
        while(bufi>0 && arr[bufi] < arr[bufi-1]){
            int temp = arr[bufi];
            arr[bufi] = arr[bufi-1];
            arr[bufi-1] = temp;
            --bufi;
        }
        InsertionSortWithRecursion(arr, i+1);
    }

    private static void BubbleSortWithoutRecursion(int[] newarr) {
        int BCount = 0;
        for(int i=0; i<newarr.length; i++){
            for (int j = 0; j < newarr.length-i-1; j++) {
                BCount++;
                if(newarr[j]>newarr[j+1]){
                    int temp = newarr[j];
                    newarr[j] = newarr[j+1];
                    newarr[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(newarr));
        System.out.println("number of comparisions with Bubble Sort: "+ BCount);
    }

    private static void InsertionSortWithoutRecursion(int[] arr) {
        int Icount = 0;
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j>0; j--){
                Icount++;
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }else{
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("number of comparisions with Insertion sort: "+Icount);
    }
}
