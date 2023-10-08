package Polymorphism;

public class Main {
    public static void main(String[] args) {
        Box box = new BoxWeight(12, "CSE",23, "mo");
        box.name();
        box.ParentMethod();
        
        // TRY THIS
        // box.sayName()
        // System.out.println(box.Name);


        System.out.println(box.ID);
    }
}


class abx<T> {
    private T a;
    private T[] b;
    abx(T a){
        this.a = a;
        // this.b = new T[];
    }

    public T getA() {
        return a;
    }
}