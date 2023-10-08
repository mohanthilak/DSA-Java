package LinkedList;

public class CustomeLinkedList<T>{
    
    public Node<T> head;
    public Node<T> tail;
    int size = 0;
    

    
    public Node<T> insertFirst(T value){
        Node<T> newNode = new Node<T>(value);
        if(this.head == null){
            this.head = newNode;
            this.tail = newNode;
        }else{
            newNode.next = this.head;
            this.head = newNode;
        }
        size++;
        return this.head;
    }
    
    public Node<T> insert(T value){
        Node<T> newNode = new Node<T>(value);
        if(tail == null){
            this.head = newNode;
            this.tail = newNode;
        }else{
            this.tail.next = newNode;
            this.tail = newNode;
        }
        size++;
        return newNode;
    }
    
    public Node<T> insert(T value, int pos){
        if(pos < 0 || size<pos) return null;
        if(pos == 0) return insertFirst(value);
        if(pos == size) return insert(value);

        Node<T> temp = head;
        Node<T> newNode = new Node<T>(value); 
 
        while(pos>1){
            temp = temp.next;
            pos--;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        size++;
        return this.head;
    }

    public T removeNode(int pos){
        if(size <= pos || pos < 0) return null;
        if(pos == 0) return RemoveHead();
        if(pos == size-1) return removeTail();
        Node<T> temp = head;
        while(pos>1) {
            temp = temp.next;
            pos--;
        }
        T value = temp.next.val;
        temp.next = temp.next.next;
        size--;
        return value;
    }

    public T removeTail(){
        if(this.tail == null) return null;
        T val = this.tail.val;
        Node<T> temp = head;
        while(temp.next != tail){
            temp = temp.next;
        }
        temp.next = null;
        this.tail = temp;
        size--;
        return val;
    }


    public T RemoveHead(){
        if(this.head == null) return null;
        T val = this.head.val;
        this.head = this.head.next;
        size--;
        return val;
    }

    public void reverse(){
        reverseHelper(head);
    }

    private void reverseHelper(Node node){
        if(node == tail){
            head = tail;
            return;
        }

        reverseHelper(node.next);

        tail.next = node;
        tail = node;
        tail.next = null;
    }

    public void BubbleSort(){
        BubbleSortHelper(size-1, 0);
    }

    private void BubbleSortHelper(int i, int j) {
        if(i == 0) return;

        if(j<i){
            Node<Integer> first = (Node<Integer>) Get(j);
            Node<Integer> second = (Node<Integer>) Get(j+1);

            if(first.val > second.val){
                if(first == head){
                    head = (Node<T>) second;
                    first.next = second.next;
                    second.next = first;
                }else if(second == tail){
                    Node<Integer> prev = (Node<Integer>) Get(j-1);
                    prev.next = second;
                    second.next = first;
                    first.next = null;
                    tail = (Node<T>) first;
                }else {
                    Node<Integer> prev = (Node<Integer>) Get(j-1);
                    prev.next = second;
                    first.next = second.next;
                    second.next = first;
                }
                BubbleSortHelper(i, j+1);
            }
            BubbleSortHelper(i-1, 0);
        }
    }

    public Node<T> Get(int pos){
        if(pos >= size || pos < 0) return null;

        Node<T> temp = head;
        while(pos != 0){
            temp = temp.next;
            pos--;
        }
        return temp;
    }

    @Override
    public String toString(){
        String LL = "";
        Node<T> temp = this.head;
        while(temp != null){
            LL += temp.val +" -> ";
            temp = temp.next;
        }
        LL += "END";
        return LL;
    }


}

class Node<T> {
    T val;
    public Node<T> next;
    

    Node(T val){
        this.val = val;
    }

    Node(T val, Node<T> next){
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString(){
        String str = "";
        Node<T> temp = this;
        while(temp != null){
            str += " "+ temp.val + ((temp.next == null)? "": " ->");  
            temp = temp.next;
        }
        return str;
    }
    
}
