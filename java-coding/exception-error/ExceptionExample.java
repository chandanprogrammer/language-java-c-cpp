public class ExceptionExample {
    public static void main(String[] args) {
        // Create a String reference, but don't assign an object to it
        String str = "null";
        int arr[] = new int[5];
        // Attempt to call a method on the null object reference
        try {
            arr[6] = 0;
            // System.out.println(Integer.parseInt(str));  
            // System.out.println(str.length());  // This will throw a NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Caught a NullPointerException: " + e.getMessage());
        }
        catch(NumberFormatException e){
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        
    }
}
