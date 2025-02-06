package oops;

public class classAndObject {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        Dog d2 = new Dog();
        d1.name = "Jack";
        d2.name = "Leo";
        System.out.println("Age of " + d1.name + " is " + d1.age);
        d1.walk();
        d2.bark();
    }
}
class Dog{
    String name; // properties
    int age;
    // behaviors
    void walk(){
        System.out.println("Dog " + name + " is walking.");
    }
    void bark(){
        System.out.println("Dog " + name + " is Barking.");
    }
}
