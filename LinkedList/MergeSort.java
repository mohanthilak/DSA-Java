package LinkedList;

public class MergeSort {
    public static void main(String[] args) {
        CustomeLinkedList<Integer> LL = new CustomeLinkedList<>();
        LL.insert(10);
        LL.insert(1);
        LL.insert(15);
        LL.insert(32);
        LL.insert(2);
        Sort(LL);
    }

    private static CustomeLinkedList<Integer> Sort(CustomeLinkedList<Integer> LL){
        if(LL.head == null){
            return LL;
        }
        return LL;
    }

    

    
}
