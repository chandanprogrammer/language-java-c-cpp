// Write a program in java anonymous array create through a method

class PassAnonymousArrayInMethod {

    // Method to print array
    static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String arg[]) {
        printArray(new int[] {2, 5, 3, 6, 9});
    }
}
