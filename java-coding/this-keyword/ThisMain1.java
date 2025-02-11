class A{
    void printf(){
        System.out.println(this);
    }
}
class ThisMain1{
    public static void main(String arg[]){
        A ref = new A();
        A ref2 = new A();
        System.out.println(ref);
        ref.printf();
        System.out.println(ref2);
        ref.printf();
    }
}