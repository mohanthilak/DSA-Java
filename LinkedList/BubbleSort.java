package LinkedList;

import Recursion.Helpers;

public class BubbleSort {
    public static void main(String[] args) {
       CustomeLinkedList<Integer> CLL = new CustomeLinkedList<>();
       CLL.insert(7);
       CLL.insert(6);
       CLL.insert(5);
       CLL.insert(4);
       CLL.insert(3);
       CLL.insert(2);       
       CLL.insert(1);

        System.out.println("Before: "+CLL);
        CLL.BubbleSort();
        System.out.println("After: "+CLL);
        CLL.reverse();
        System.out.println(CLL);
    }   
}
