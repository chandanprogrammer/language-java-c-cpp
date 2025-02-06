package oops;
public class ThisKeyword {
    public static void main(String[] args) {
        Complex2 num1 = new Complex2(2, 5);
        Complex2 num2 = new Complex2(4, 3);
        num1.print();
        num2.print();
        Complex2 result = num1.add(num2);
        result.print();
    }
}
class Complex2{
    int a, b;
    public Complex2(int a, int b){
        this.a = a; // this represents variable of current class
        this.b = b;
    }
    void print(){
        System.out.println(a + " + " + b + "i");
    }
    Complex2 add(Complex2 num2){
        Complex2 result =new Complex2(a+num2.a, b+num2.b);
        return result;
    }
}
