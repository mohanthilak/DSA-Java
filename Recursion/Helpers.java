package Recursion;

import java.util.*;

public class Helpers {
    public static int CreateARandomNumber(int min, int max){
        int RandomNumber = (int)(Math.random()*(max-min+1)+min);
        return RandomNumber;
    }

    public static int[] CreateSortedArray(int length) {
        int[] arr = CreateIntArrayWithoutDuplicates(length);
        SortArray(arr);
        return arr;
    }

    public static int[] createRotatedArray(int length, int timesOfRotation) {
        int[] arr = CreateIntArrayWithoutDuplicates(length);
        SortArray(arr);
        arr = RotateArray(arr, timesOfRotation);
        return arr;
    }

    public static int[] RotateArray(int[] arr, int times){
        int[] temp = new int[arr.length];
        int k = 0;
        // int timeCopy = times;
        while(times>0){
            temp[k] = arr[arr.length-times];
            times--;
            k++;
        }
        for(int i=0; i<arr.length-k; i++){
            temp[i+k] = arr[i];
        }
        return temp;
    }
    // BubbleSort
    public static void SortArray(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j] > arr[j+1]) {
                    swapElementsOfAnArray(arr, j, j+1);
                }
            }
        }
    }

    public static int[] CreateIntArrayWithoutDuplicates(int length) {
        List<Integer> arrList = new ArrayList<>();
        
        for(int i=0; i<length; i++){
            while(true) {
                int el = CreateARandomNumber(0, 100);
                if(!arrList.contains(el)){
                    arrList.add(el);
                    break;
                } 
            }
        }
        return arrList.stream().mapToInt(Integer::intValue).toArray();
    }

    public static int[] CreateIntArrayWithDuplicates(int length, int min, int max) {
        int[] arr =  new int[length];
        for(int i=0; i<length; i++){
            arr[i] = CreateARandomNumber(min, max);
        }
        return arr;
    }


    public static void swapElementsOfAnArray(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // public static void GenereateRandomString()
}
