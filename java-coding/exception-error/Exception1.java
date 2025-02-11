class Exception1{
    public static void main(String[] args) {
        int a, b;
        a = Integer.parseInt(args[0]);
        b = Integer.parseInt(args[1]);
        try{
            System.out.println(a/b);
            System.out.println("We are indian");
            System.out.println(a+b);
        } catch(ArithmeticException e){
            System.out.println(e);
        }
    }
}