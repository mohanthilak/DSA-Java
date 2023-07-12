package Recursion;

import java.util.*;

public class Helpers {
    public static int CreateARandomNumber(int min, int max){
        int RandomNumber = (int)(Math.random()*(max-min+1)+min);
        return RandomNumber;
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
}
