class B{
    int id;
    String name;
    B(){
        System.out.println("Constructor called..");
        System.out.println(id + " " + name);
    }
    // B(int a){
    //     System.out.println("Constructor called..");
    //     System.out.println(id + " " + name);
    // }
    void B(){
        int a=5, b=8;
        System.out.println(a+b);
    }
}


class A {
    public static void main(String[] args) {
        B ref = new B();
        // B ref = new B(5);
        ref.B();
    }
}
