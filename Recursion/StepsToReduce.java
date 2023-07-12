package Recursion;


/*
 * Given a Number Return the number of steps to make it zero by either dividing it by 2(when even) or subtracting by 1(when odd)
 * Ex: Q:N=10 A:5
 * Explanation: Step 1: N/2=5; Step 2: N-1=4; Step 3: N/2=2; Step 4: N/2=1; Step 5: N-1=0. Hence 5 Steps 
 */
class StepsToReduce{
    public static void main(String[] args) {
        int randomNumber = Helpers.CreateARandomNumber(0, 100);
        System.out.println("Q:"+randomNumber);
        System.out.println("A:"+helper(randomNumber, 0));
    }

    private static int helper(int n, int count) {
        if(n==0){
            return count;
        }

        if(n%2 == 0){
            return helper(n/2, ++count);
        }
        return helper(n-1, ++count); 
    }
}