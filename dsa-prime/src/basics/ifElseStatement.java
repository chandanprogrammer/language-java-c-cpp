package basics;

public class ifElseStatement {
    public static void main(String[] args) {
        int age =23;
        // if condition....
        if(age>10){
            System.out.println("Your age : " + age);
        }
        // if else condition....
        if(age>=18){
            System.out.println("Your age greater than or equal to 18.");
        }
        else{
            System.out.println("Your age less than 18.");
        }
        // nested if else condition...
        int a = 12, b = 16, c = 3;
        if(a>b){
            if(a>c) System.out.println("a is greater");
            else System.out.println("c is greater");
        }
        else{
            if(b>c) System.out.println("b is greater");
            else System.out.println("c is greater");
        }
    }
}
