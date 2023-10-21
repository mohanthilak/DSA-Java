package LinkedList;


class Palindrome {
    public static void main(String[] args) {
        CustomeLinkedList<Integer> CLL = new CustomeLinkedList<>();
        CLL.insert(1);
        CLL.insert(2);
        CLL.insert(3);
        CLL.insert(3);
        CLL.insert(2);
        CLL.insert(1);
        System.out.println(CLL);
        System.out.println("Is it a Palindrome: " + CLL.CheckPalindrome());
        System.out.println(CLL);
    }
}