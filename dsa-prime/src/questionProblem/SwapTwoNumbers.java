package questionProblem;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 7, 9, 6, 10};
        // swap index 2 from 6

        int temp = arr[2];
        arr[2] = arr[6];
        arr[6] = temp;

//        arr[2] = arr[2] - arr[6];
//        arr[6] = arr[2] + arr[6];
//        arr[2] = arr[6] - arr[2];

//        arr[2] = arr[2] ^ arr[6];
//        arr[6] = arr[2] ^ arr[6];
//        arr[2] = arr[2] ^ arr[6];

        for (int n : arr){
            System.out.print(n + " ");
        }
    }
}
