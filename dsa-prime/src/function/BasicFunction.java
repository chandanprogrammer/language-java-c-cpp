package function;
// function or method both are same
public class BasicFunction {
    public static void main(String[] args) {
        // default argument
        // for(String arg : args) System.out.print(arg + " ");
        helloJava(); // method call
        System.out.println(addTwoNumber(3, 5));
        int a = -5, b= 10;
        System.out.println( Math.max(a, b)); // Find max value
        System.out.println( Math.min(a, b)); // Find min value
        System.out.println( Math.sqrt(b)); // Find square root
        System.out.println( Math.pow(b, 4)); // Find square
        System.out.println( Math.abs(a)); // change -ve value into +ve value
        System.out.println( Math.floor(124.869));
        System.out.println( Math.ceil(124.869));
        System.out.println( Math.round(124.86));
    }
    public static void helloJava(){
        System.out.println("Hello Java."); // function not return any value
    }
    static int addTwoNumber(int num1, int num2){ // method parameter
        return num1 + num2; // function return value
    }
}
