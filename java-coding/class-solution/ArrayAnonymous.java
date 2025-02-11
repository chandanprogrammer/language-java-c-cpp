
class ArrayAnonymous {
    static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String arg[]){
        printArr(new int[] {1, 2, 3, 4});
    }
}
