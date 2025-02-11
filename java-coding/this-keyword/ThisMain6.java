class B{
    B obj;
    void B(B obj){
        System.out.println("method invoked..");
    }
    void p(){
        B(this);
    }
}

class ThisMain6 {
    public static void main(String[] args) {
        B ref = new B();
        ref.p();
    }
}
