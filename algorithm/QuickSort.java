public class QuickSort {

    static int partition(int arr[], int low, int high) {

        int pivot = arr[high];

        int i = low - 1;

        for (int j = low; j <= high - 1; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, high);
        return i + 1;
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void quickSort(int arr[], int low, int high) {
        if (low < high) {
            int pivot = partition(arr, low, high);
            quickSort(arr, low, pivot - 1);
            quickSort(arr, pivot + 1, high);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 4, 7, 0, 2, 8, 5, 7 };

        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
        quickSort(arr, 0, arr.length - 1);

        for (int val : arr) {
            System.out.print(val + " ");
        }
    }
}
