package sortingAlgorithm;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {4, 6, 1, 7, 8, 2, 1, 0, 3, 9};
        for(int a : arr) System.out.print(a + " ");
        System.out.println();
        selectionSortAlgo(arr);
        for(int a : arr) System.out.print(a + " ");
    }
    public static void selectionSortAlgo(int[] arr){
        int n = arr.length;
        for(int i = 0; i<n-1; i++){
            int min = i;
            for(int  j = i+1; j<n; j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
}
