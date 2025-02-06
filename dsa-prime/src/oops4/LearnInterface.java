package oops4;

public class LearnInterface {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.walk();
        d1.eat();
        int leg = d1.legCount(4);
        d1.drink();
        System.out.println(d1.ear);
    }
}
interface  Animal{
    // public abstract  void eat(); // by default public or abstract
    public void walk();
    void eat();
    void drink();
    public static final int ear = 2;
    default void bite(){ // default implementation
        System.out.println("Animal bite ");
    }
}
interface  Pet{
    int legCount(int leg);
    void drink();
}
class Dog implements  Animal, Pet{
    public void walk() {
        System.out.println("Dog walking");
    }
    public void eat() {
        System.out.println("Dog eating");
    }
    @Override
    public int legCount(int leg) {
        return 0;
    }
    public void drink(){
        System.out.println("Dog drink water");
    }
}
