package Interfaces;

interface IA{
    int i=10;
    void add();
}
interface IX extends IA{
    void add2();
}

class IB implements IX{
    public void add(){
        System.out.println("X class call.");
    }
    public void add2(){
        System.out.println("X class call.");
    }
}
public class InterfaceMain1 {

    static void printf(){
        System.out.println("Print method.");
    }

    public static void main(String[] args) {
        IB ref = new IB();
        ref.add();
        System.out.println(IB.i);
        System.out.println(ref.i);
        printf();
    }
}
