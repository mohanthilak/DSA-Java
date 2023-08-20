package Recursion;
// https://www.geeksforgeeks.org/remove-consecutive-duplicates-string/
public class removeConsecutiveDuplicateCharacters {
    public static void main(String[] args) {
        String str = "aaaabbbcccb";
        System.out.println(helper(str, 0));
    }

    private static String helper(String str, int i) {
        if(i==str.length()-1) return str;
        if(str.charAt(i) == str.charAt(i+1)) return helper(str.substring(0,i)+str.substring(i+1, str.length()), i);
        else return helper(str, i+1);
    }
}
