package Recursion.Permutation;

public class permutaionOfAString {
    public static void main(String[] args) {
        String str = "abc";
        helper("",str);
    }

    private static void helper(String p, String str) {
        if(str.isEmpty()){
            System.out.println("p:"+p);
            return;
        }

        for (int i = 0; i <= p.length(); i++) {
            String buf = p.substring(0, i) + str.charAt(0) + p.substring(i, p.length());
            helper(buf, str.substring(1));
        }
    }
}
