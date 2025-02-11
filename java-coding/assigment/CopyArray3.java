// Write a program in java to copy of an array from another array without using loop and difference in size.

class CopyArray3 {
    public static void main(String arg[]) {
        int arr1[] = new int[5]; 
        int arr2[] = new int[8]; 

        // set value in arr1
        for(int i=0; i<arr1.length; i++){
            arr1[i] = 2+i*3;
        }

        // display arr1
        for(int i=0; i<arr1.length; i++){
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        
        // arr1 refer arr2 so size of arr2 replace with arr1
        arr2 = arr1;
        
        // display arr2
        for(int i=0; i<arr2.length; i++){
            System.out.print(arr2[i] + " ");
        }
    }
}
