package Queues;

import java.util.LinkedList;
import java.util.Queue;
// https://leetcode.com/problems/find-the-winner-of-the-circular-game/
public class circularGameWinner {
    public static void main(String[] args) {
        String str = "2*3-4*5";
        System.out.println(Integer.parseInt(str));

        Queue<Integer> q = new LinkedList<>();
        int n = 5;
        int k = 2;
        int i = 1;
        while(i <= n){
            q.add(i);
            i++;
        }
        System.out.println(q);

        while(q.size() != 1){
            int j = 1;
            while(j<k){
                int temp = q.peek();
                q.add(temp);
                q.remove();
                j++;
            }
            q.remove();
        }
        System.out.println(q);
    }
}
