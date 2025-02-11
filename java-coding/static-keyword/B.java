class BB{
    static int roll;
    static{
        System.out.println("I am static keyword. : " + roll );
    }
}

class B {
    static{
        System.out.println("This is static block.");
    }
    public static void main(String arg[]) {

        // static int roll = 0;
        // System.out.println(roll);

        System.out.println("This is main");
        
        BB ref = new BB();
        BB ref2 = new BB();
        BB.roll = 45;
        // ref2.roll = 20;
        System.out.println("This is main2");
    }  
    static{
        System.out.println("This is static block 2.");
    }  
}
