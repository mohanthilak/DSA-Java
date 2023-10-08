package Polymorphism;

public class BoxWeight extends Box{
    int age;
    String Name;

    public BoxWeight(int age,String ID, int age2, String name) {
        super(age, ID);
        age = age2;
        Name = name;
    }

    public void name() {
        System.out.println("BoxWeight Class");
    }

    public void sayName() {
        System.out.println("Say my name");
    }
}
