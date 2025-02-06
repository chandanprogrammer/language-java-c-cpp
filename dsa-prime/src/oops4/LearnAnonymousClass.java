package oops4;
public class LearnAnonymousClass {
    public static void main(String[] args) {
        OuterClass obj = new OuterClass(){  // Inner Anonymous class
            void innerMethod() {
                System.out.println("Inner Method");
            }
            void outerMethod(){
                System.out.println("Outer Method");
            }
        };
        SuperInterface obj2 = new SuperInterface() {
            @Override public void interfaceMethod() {
                System.out.println("Interface Method");
            }
        };
        Walkable obj3 = (int steps) -> {
            System.out.println("Walk "+steps+ " steps");
            return steps;
        };
        obj.outerMethod();
        obj2.interfaceMethod();
        obj3.walks(5);
    }
}
class OuterClass{
    void outerMethod(){
        System.out.println("Outer Method");
    }
}
interface SuperInterface{
    void interfaceMethod();
}

@FunctionalInterface interface Walkable{
    int walks(int steps);
}
