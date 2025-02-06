package oops;

public class ConstructorLearn {
    public static void main(String[] args) {
        Complex num1 = new Complex();
        Complex num2 = new Complex(2, 5);
        // num1.a = 2;
        // num1.b = 12;
        num1.print();
        num2.print();
        num1.print(4);
        num1.print(114, 5);
    }
}
class Complex{
    int a, b;
    // Object bnne ke sath hi constructor bhi call hota hai
    // Default constructor working
    // public Complex(){
    //     a = 0;
    //     b = 0;
    // }
    public Complex(){
        a = 21; // overriding the default constructor
        b = 11;
        System.out.println("creating a new object....");
    }
    // Constructor overloading
    public Complex(int real, int imaginary){
        a = real;
        b = imaginary;
        System.out.println("creating a new object....");
    }
    void print(){
        System.out.println(a+ " + " + b + "i");
    }
    void print(int real){
        System.out.println(real+ " + " + b + "i");
    }
    void print(int real, int imaginary){
        System.out.println(real+ " + " + imaginary + "i");
    }
}
