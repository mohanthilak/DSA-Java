package Recursion.subsets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import Recursion.Helpers;

public class AllposibleSubsetsOfAnArrayWithDuplicates {
    public static void main(String[] args) {
        int[] arr = Helpers.CreateIntArrayWithDuplicates(3, 1, 2);
        System.out.println(Arrays.toString(arr));
        Helpers.SortArray(arr);

        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());

        int s = 0;
        int e = 0;
        for (int i = 0; i < arr.length; i++) {
            s = 0;
            if(i>0 && arr[i] == arr[i-1]){
                s = e+1;
            }
            int n = outer.size();
            e = n-1;
            for (int j = s; j < n; j++) {
                List<Integer> l = new ArrayList<>(outer.get(j));
                l.add(arr[i]);
                outer.add(l);
            }
        }
        System.out.println(outer);
    }
}
