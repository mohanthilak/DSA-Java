package LinkedList; 

class reverseSublist{
    public static void main(String[] args) {
        CustomeLinkedList<Integer> CLL = new CustomeLinkedList<>();
       CLL.insert(7);
       CLL.insert(6);
       CLL.insert(5);
       CLL.insert(4);
       CLL.insert(3);
       CLL.insert(2);       
       CLL.insert(1);
       System.out.println(CLL);
       CLL.ReverseSublist(4, CLL.size);
       System.out.println(CLL);
    //    System.out.println(CLL.tail);
    }
}