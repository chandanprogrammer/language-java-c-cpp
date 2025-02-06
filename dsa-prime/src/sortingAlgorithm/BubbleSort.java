package sortingAlgorithm;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {4, 6, 1, 7, 8, 2, 1, 0, 3, 9};
        for(int a : arr) System.out.print(a + " ");
        System.out.println();
        bubbleSortAlgo(arr);
        for(int a : arr) System.out.print(a + " ");
    }
    public static void bubbleSortAlgo(int[] arr){
        int n = arr.length;
        for(int i=1; i<n; i++){
            boolean swapCheck = false;
            for(int j=0; j<n-i; j++){
                if(arr[j]>arr[j+1]){
                    // swap number
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapCheck = true;
                }
            }
            if(!swapCheck) break;
        }
    }
}
