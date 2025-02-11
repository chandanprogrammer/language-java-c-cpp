// import java.io.*;

public class ThrowThrows {
    public void validate(int age) {
        if (age < 18) {
            try {
                throw new ArithmeticException("Not valid voter..");
            } catch (ArithmeticException e) {
                System.out.println(e);
            }
        } else {
            System.out.println("Valid voter.");
        }
    }
    public int divide(int a, int b) throws ArithmeticException{
        return a/b;
    }
    public static void main(String[] args) {
        ThrowThrows ref = new ThrowThrows();
        ref.validate(20);
        try{
            int result = ref.divide(10, 0 );
            System.out.println(result);
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        
    }
}
