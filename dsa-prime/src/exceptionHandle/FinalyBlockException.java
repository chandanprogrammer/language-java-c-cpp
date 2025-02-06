package exceptionHandle;

public class FinalyBlockException {
    public static void main(String[] args) {
        int[] arr = new int[5];
        System.out.println("Hello ji");
        try{
            System.out.println(arr[5]);
        } catch (Exception e){
            System.out.println("Exception handle");
        } finally {
            System.out.println("I will run always");
        }
        System.out.println("Bye ji");
    }
}
