package arrays;
public class Swap2NumberArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int size = arr.length;
        if(size % 2 != 0) {
            size = size-1;
        }
        for(int i=0; i<size; i+=2){
            // ---- using third variable ----
             int temp = arr[i];
             arr[i] = arr[i+1];
             arr[i+1] = temp;

            // ---- using without third variable ----
            // arr[i] = arr[i] - arr[i+1];
            // arr[i+1] = arr[i] + arr[i+1];
            // arr[i] = arr[i+1] - arr[i];
            // ---- using bitwise operator ----
            // arr[i] = arr[i] ^ arr[i+1];
            // arr[i+1] = arr[i] ^ arr[i+1];
            // arr[i] = arr[i] ^ arr[i+1];
        }
        // print swapped array
        for(int a : arr) System.out.print(a + " ");
    }
}
