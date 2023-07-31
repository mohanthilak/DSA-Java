package Recursion;
// https://www.geeksforgeeks.org/program-for-length-of-a-string-using-recursion/
public class lenOfString {
    public static void main(String[] args) {
        String s = "d";
        System.out.println(helper(s));
    }

    public static int helper( String str){
        if(str.equals("")) return 0;
        return helper(str.substring(1)) + 1;
    }
}
