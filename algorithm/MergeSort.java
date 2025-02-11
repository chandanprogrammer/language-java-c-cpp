
class MergeSort {

    static void sort(int arr[], int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            sort(arr, low, mid);
            sort(arr, mid + 1, high);
            merge(arr, low, mid, high);
        }
    }

    static void merge(int arr[], int low, int mid, int high) {
        int n1 = mid - low + 1;
        int n2 = high - mid;

        int arrL[] = new int[n1];
        int arrR[] = new int[n2];

        for (int i = 0; i < n1; i++) {
            arrL[i] = arr[low + i];
        }
        for (int j = 0; j < n2; j++) {
            arrR[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0, k = low;
        while (i < n1 && j < n2) {
            if (arrL[i] <= arrR[j]) {
                arr[k] = arrL[i];
                i++;
            } else {
                arr[k] = arrR[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = arrL[i];
            i++;
            k++;
        }
        while (i < n2) {
            arr[k] = arrR[j];
            j++;
            k++;
        }

    }

    public static void main(String[] args) {
        int arr[] = { 6, 4, 2, 1, 9, 8, 3, 5 };

        sort(arr, 0, arr.length - 1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}