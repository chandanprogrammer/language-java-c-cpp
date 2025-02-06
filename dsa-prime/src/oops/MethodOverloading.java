package oops;

public class MethodOverloading {
    public static void main(String[] args) {
        Greet g1 = new Greet();
        g1.greetings();
        g1.greetings("chandan");
    }
}
class Greet{
    // Method overloading
    void greetings(){
        System.out.println("Hello, Good Morning");
    }
    void greetings(String name){
        System.out.println("Hello " + name + ", Good Morning");
    }
}
