package Polymorphism;

public class BoxPrice extends BoxWeight {
    
    int price;
    String Name;
    int age;
    public BoxPrice(int age, String ID, int age2, String name, int price, String name2, int age3) {
        super(age, ID, age2, name);
        this.price = price;
        Name = name2;
        age = age3;
    }

    public void name() {
        System.out.println("Box Price");
    }
    
    public void SayPrice() {
        System.out.println("Box Price: " +price);
    }
}
