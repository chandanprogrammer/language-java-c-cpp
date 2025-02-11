interface A1{
    void display1();
}
interface A2 extends A1{
    void display();
}

class Main3 implements A2 {
    public void display1(){
        System.out.println("A1 display1 interface");
    }
    public void display(){
        System.out.println("A1 interface");
    }
    public static void main(String[] args) {
        Main3 ref = new Main3();
        ref.display();
        ref.display1();
    }
}
