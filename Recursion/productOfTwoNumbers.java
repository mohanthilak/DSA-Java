package Recursion;

public class productOfTwoNumbers {
    public static void main(String[] args) {
        helper(10, 5, 0);
        System.out.println(newHelper(10, 10));
        
    }

    private static int newHelper(int i, int j) {
        if(j<=0) return 0;
        if(j==1){
            return i;
        }
        return i+newHelper(i, --j);
    }

    private static void helper(int i, int j, int sum) {
        if(j == 0){
            System.out.println(0);
            return; 
        } 
        if(j == 1){
            sum +=i;
            System.out.println(sum);
            return;
        }
        helper(i, --j, sum+i);
    }
}
