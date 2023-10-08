package Polymorphism;

public class Box implements BoxInterface {
    public int age;
    public String ID;

    public Box(int age, String id) {
        this.age = age;
        this.ID = id;
    }
    
    public void ParentMethod() {
        System.out.println("Box Class calls ParentMethod");
    }

    public void  name() {
        System.out.println("Box class");
    }
}
