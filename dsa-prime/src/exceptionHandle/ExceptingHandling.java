package exceptionHandle;

public class ExceptingHandling {
    public static void main(String[] args) {
//        System.out.println("Hello Ji");
//        int[] arr = new int[5];
//        // Exception stop your code
//        try{
//            System.out.println(arr[8]); // RunTimeError:
//            System.out.println(5/0);
//        }
//        catch(ArrayIndexOutOfBoundsException e){
//            System.out.println(e);
//            System.out.println("Error: Try to access out of array");
//            System.out.println(e.getMessage());
//            System.out.println(e.getStackTrace());
//        }
//        catch(ArithmeticException e){
//            System.out.println("Error: Arithmetic Exception ");
//        }


        System.out.println("Hello Ji");
        int[] arr = new int[5];
        try{
            System.out.println(arr[8]); // RunTimeError:
            System.out.println(5/0);
        }
//        catch(ArrayIndexOutOfBoundsException | ArithmeticException e){
//            System.out.println("Handle Exception");
//        }
        catch(Exception e){
            System.out.println("All Exception Handle");
        }

        System.out.println("Good Morning");
    }
}
