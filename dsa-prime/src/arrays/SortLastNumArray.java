package arrays;

public class SortLastNumArray {
    public static void main(String[] args) {

        // Place the last number in the sorted position in an array
        int[] arr = {2, 3, 4, 5, 6, 7, 1};
        int size = arr.length;
        int last = arr[size-1];

        for(int i = size-2; i>=0; i-- ){
            if(arr[i] > last){
                // shift number using swap method
                arr[i] = arr[i] ^ arr[i+1];
                arr[i+1] = arr[i] ^ arr[i+1];
                arr[i] = arr[i] ^ arr[i+1];
            }
            else{
                arr[i+1] = last;
                break;
            }
        }
        for(int a : arr) System.out.print(a + " ");
    }
}
