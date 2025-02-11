// Write a program in java to pass a array through a method.

class PassArrayInMethod {

    // Method to print array
    static void printArray(String arr[]) {
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + ", ");
        }
    }

    public static void main(String arg[]) {
        String fruits[] = new String[5];
        fruits[0] = "Apple";
        fruits[1] = "Orange";
        fruits[2] = "Banana";
        fruits[3] = "Grapes";
        fruits[4] = "Guava";

        // function call
        printArray(fruits);
    }
}
