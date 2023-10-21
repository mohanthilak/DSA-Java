package LinkedList;

public class Reorder {
    public static void main(String[] args) {
        CustomeLinkedList<Integer> CLL = new CustomeLinkedList<>();
        CLL.insert(1);
        CLL.insert(2);
        CLL.insert(3);
        CLL.insert(4);
        CLL.insert(5);
        CLL.insert(6);
        // CLL.insert(7);
        System.out.println(CLL);
        CLL.ReOrder();
        System.out.println(CLL);
    }
}
