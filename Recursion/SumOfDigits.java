package Recursion;

public class SumOfDigits {
    public static void main(String[] args) {
        String str = "12345";
        System.out.println(str);

        helper(str, 0);
    }

    private static void helper(String str, int sum) {
        if(str.isEmpty()){
            System.out.println(sum);
            return;
        }
        helper(str.substring(1), sum+(str.charAt(0) - '0'));
    }
}
