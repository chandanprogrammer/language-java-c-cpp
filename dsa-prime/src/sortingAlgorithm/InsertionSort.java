package sortingAlgorithm;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {4, 6, 1, 7, 8, 2, 1, 0, 3, 9};
        for(int a : arr) System.out.print(a + " ");
        System.out.println();
        InsertionSortAlgo(arr);
        for(int a : arr) System.out.print(a + " ");
    }
    public static void InsertionSortAlgo(int[] arr){
        int n = arr.length;
        for(int i = 1; i<n; i++){
            int key = arr[i];
            int j = i-1;
            while(j>=0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
}
