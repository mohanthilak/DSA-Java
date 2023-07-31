package Recursion.subsets;

import java.util.ArrayList;
import java.util.List;

public class AllPossibleSubsetsOfAString {
    public static void main(String[] args) {
        String s = "ABC";
        System.out.println("Given String: " + s);
        System.out.println("Subsets: " + subsetsArrayList("", s));
        subsetsString("", s);
    }

    private static ArrayList<String> subsetsArrayList(String p, String up) {
        if(up.isEmpty()){
            ArrayList<String> arr = new ArrayList<>();
            arr.add(p);
            return arr;
        }
        ArrayList<String> w= new ArrayList<>();
        
        ArrayList<String> left = subsetsArrayList(p+Character.toString(up.charAt(0)), up.substring(1));
        ArrayList<String> right = subsetsArrayList(p, up.substring(1)); 
        w.addAll(left);

        w.addAll(right);

        return w;
    }


    private static void subsetsString(String p, String up){
        if(up.isEmpty()){
            System.out.print(p+ " ");
            return;
        }

        subsetsString(p+up.charAt(0), up.substring(1));
        subsetsString(p, up.substring(1));
    }

    
}
