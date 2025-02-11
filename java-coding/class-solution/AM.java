class M {
    // void sum (long a, int b){
    //     System.out.println(a+b);
    // }    
    void sum (int a, long b){
        System.out.println(a+b);
    }    
    void sum (double a, long b){
        System.out.println(a+b);
    }    
    void sum (int a, double b){
        System.out.println(a+b);
    }    
    void sum (int a, int b, int c){
        System.out.println(a+b+c);
    }    
}

class AM{
    // public static void main(String[] args) {
    //     M ref = new M();
    //     ref.sum(2, 9);
    // }

    public static void main(String[] args) {
        M ref = new M();
        ref.sum(2, 5);
        ref.sum(2.4, 5);
        ref.sum(2, 5.9);
        ref.sum(2, 5, 9);
    }
}
