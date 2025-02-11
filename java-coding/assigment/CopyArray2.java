// Write a program in java to copy of an array from another array without using loop.

class CopyArray2 {
    public static void main(String arg[]) {
        
        // given array
        int arr1[] = {4, 6, 3, 12, 1, 6};

        // create new array
        int arr2[] = new int[arr1.length];

        // copy array
        arr2 = arr1;

        // display copied array
        for(int i=0; i<arr2.length; i++){
            System.out.print(arr2[i] + " ");
        }
    }
}
