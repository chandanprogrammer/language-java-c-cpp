class A{
    B b1;
    A(B b1){
        this.b1=b1;
    }
    void msg(){
        System.out.println(b1.data);
    }
}
class B{
    int data= 50;
    B(){
        A obj = new A(this);
        obj.msg();
    }
}

class UsingThis{
    public static void main(String arg[]){
        B ref = new B();
    }
}