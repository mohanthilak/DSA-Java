package Recursion;

public class PatterExample {
    public static void main(String[] args) {
        helper(4,0);   
    }

    private static void helper(int r, int c) {
        if(r==0){
            return;
        }
        if(r>c){
            helper(r, ++c);
            System.out.print("*");
        }else{
            helper(--r, 0);
            System.out.println();
        }
    }
}
