class B{
    static int a = 10;
}

class AA {
    // static int a = 10;
    int b = 5;
    public static void main(String[] args) {
        int c = 100;
        A obj = new A();
        System.out.println(B.a);
        // System.out.println(a);
        System.out.println(obj.b);
        System.out.println(c);
    }    
}
