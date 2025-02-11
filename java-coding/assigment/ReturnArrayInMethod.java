// Write a program in java to return an array through a method.

class ReturnArrayInMethod {

    static int[] copiedArray(int arr[]) {
        int temp[] = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            temp[i] = arr[i];
        }
        return temp;
    }

    public static void main(String arg[]) {
        int size = 6;
        int arr1[] = {1, 4, 0, 7, 3 ,8};
        int arr2[] = new int[size];

        arr2 = copiedArray(arr1);

        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}
