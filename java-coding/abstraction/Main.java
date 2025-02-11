abstract class Animal{
    void eat(){
        System.out.println("Animal eat.");
    }
    abstract void walk();
}

abstract class Dog extends Animal{
    void bark(){
        System.out.println("Dog bark.");
    }
}
class Dog1 extends Dog{
    void walk(){
        System.out.println("Dog1 walk");
    }
}

class Main {
    public static void main(String[] args) {
        Dog1 ref = new Dog1();
        ref.eat();
        ref.bark();
        ref.walk();
    }
}
