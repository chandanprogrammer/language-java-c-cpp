package questionProblem;

public class LastNumberInSortedPosition {
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 0};

        int n = arr.length;
        int last = arr[n-1];
        int swapIndex = n-2;

        while(swapIndex >= 0 && arr[swapIndex] > last){
            swapIndex--;
        }

        for (int i=n-1; i>=swapIndex+2; i--){
            arr[i] = arr[i-1];
        }
        arr[swapIndex+1] = last;

        for (int val : arr){
            System.out.print(val + " ");
        }
    }
}
