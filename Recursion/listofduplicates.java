package Recursion;

import java.util.*;

public class listofduplicates {
    public static void main(String[] args) {
        int arr[] = Helpers.CreateIntArrayWithDuplicates(20, 1, 10);
        System.out.println("Finding all instaces of element: " + arr[2] +" in: " + Arrays.toString(arr));
        System.out.println(helper(arr, 0, arr[2]));
    }

    private static List<Integer> helper(int[] arr, int i, int target) {
        List<Integer> list = new ArrayList<>();
        if(i == arr.length) return list;
        if(arr[i] == target) list.add(i);
        list.addAll(helper(arr, ++i, target));
        return list;
    }
}
