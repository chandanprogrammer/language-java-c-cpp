class A{
    int roll;
    static String branch = "MCA";
    A(int roll){
        this.roll = roll;
    }
    void display(){
        System.out.println(roll + " : " + branch);
    }
    static void change(){
        branch = "Economics";
    }
} 

class AMain {

    static{
        System.out.println("This is static block");
    }

    public static void main(String arg[]) {
        A a1 = new A(12);
        A a2 = new A(20);
        a1.display();
        a2.display();
        A.change();
        a1.display();
        a2.display();
    }
    static{
        System.out.println("This is static block 2");
    }
}

// static{
//     System.out.println("This is static block 3");
// }
