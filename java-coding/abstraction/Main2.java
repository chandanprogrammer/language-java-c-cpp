abstract class Parents{
    Parents(){
        System.out.println("This is parent class.");
    }
    void sayHello(){
        System.out.print("Hello ");
    }
    abstract void greet();
}

class child1 extends Parents{
    child1(){
        super();
        System.out.println("This is child 1");
    }
    void greet(){
        System.out.println("Good moring.");
    }
}
class child2 extends Parents{ 
    void greet(){
        System.out.println("Good evening.");
    }
}

class Main2 {
    public static void main(String[] args) {
        child1 ref1 = new child1();
        child2 ref2 = new child2();
        ref1.sayHello();
        ref1.greet();
        ref2.sayHello();
        ref2.greet();
    }    
}
