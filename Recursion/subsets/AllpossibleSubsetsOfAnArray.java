package Recursion.subsets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import Recursion.Helpers;

public class AllpossibleSubsetsOfAnArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4};
        // int[] arr = Helpers.CreateIntArrayWithoutDuplicates(3);
        System.out.println("Given array: " + Arrays.toString(arr));

        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for (int i = 0; i < arr.length; i++) {
            int n = outer.size();
            for (int j = 0; j < n; j++) {
                List<Integer> inner = new ArrayList<>(outer.get(j));
                inner.add(arr[i]);
                System.out.println("inner: " +inner);
                outer.add(inner);
                System.out.println("outer: "+ outer);
            }
            System.out.println("___________________________________________");
        }

        System.out.println("End result: " + outer);
    }
}
