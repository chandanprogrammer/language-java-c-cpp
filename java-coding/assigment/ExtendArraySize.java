// Write a program in java to extend array size

class ExtendArraySize {
    public static void main(String arg[]) {
        int size = 5;
        int arr1[] = new int[size];
        int arr2[] = new int[size];

        // set value in arr1
        for(int i=0; i<arr1.length; i++){
            arr1[i] = 3+i*2;
        }

        // copy value in arr2 from arr1
        for(int i=0; i<arr2.length; i++){
            arr2[i] = arr1[i];
        }

        // arr1 size extend
        arr1 = new int[8];

        // copy value in arr1 from arr2
        for(int i=0; i<arr2.length; i++){
            arr1[i] = arr2[i];
        } 

        // print arr1
        for(int i=0; i<arr1.length; i++){
            System.out.print(arr1[i] + " ");
        }
        System.out.println();

        // print arr2
        for(int i=0; i<arr2.length; i++){
            System.out.print(arr2[i] + " ");
        }

    }
}
