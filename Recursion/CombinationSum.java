package Recursion;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public static void main(String[] args) {
        int[] arr = {2,3,5};
        
        System.out.println(helper(new ArrayList<>(), arr, 0, 0, 8));
    }

    private static List<List<Integer>> helper(ArrayList<Integer> ls, int[] arr, int sum, int i, int target){
        List<List<Integer>> outer = new ArrayList<>();
        if(sum == target){
            outer.add(ls);
            return outer;
        }
        System.out.println( "inner: "+ls);
        for (int j = i; j < arr.length; j++) {
            System.out.println("El: " +arr[j]);
            if(sum + arr[j] <= target){
                ls.add(arr[j]);
                List<List<Integer>> result = helper((ArrayList<Integer>) ls.clone(), arr, sum+arr[j], j, target);
                if(result.size() != 0){
                    outer.addAll(result);
                }
                ls.remove(ls.size()-1);
                System.out.println("result "+result + " ls: "+ ls + " arr[j]: "+ arr[j]);
            }else{
               break;
            }
        }
        System.out.println("outer: "+outer);
        return  outer;
    }
}
