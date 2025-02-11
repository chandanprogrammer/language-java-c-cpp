// Write a program in java to copy of an array from another array using loop. 

class CopyArray {
    public static void main(String arg[]){

        // given array
        int arr1[] = {4, 6, 3, 12, 1, 8};

        // create new array
        int arr2[] = new int[arr1.length];

        // copy array
        for(int i=0; i<arr2.length; i++){
            arr2[i] = arr1[i];
        }

        // display copied array
        for(int i=0; i<arr2.length; i++){
            System.out.print(arr2[i] + " ");
        }

    }
}
