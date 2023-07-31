package Recursion;

public class FirstUpperCaseLetterInAString {
 public static void main(String[] args) {
    String s = "mohaN";
    System.out.println(helper(s, 0));
 }   
 static int helper(String str, int i){
    if(Character.isUpperCase(str.charAt(i))) return i;
    return helper(str, ++i);
 }
}
