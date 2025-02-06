package arrays;
import java.util.Arrays;
public class TwoDimensionalArray {
    public static void main(String[] args) {
        int[][] marks ={
                {12, 98, 28},
                {76, 20, 52},
                {19, 90, 34},
                {99, 45, 87}
        };
        // using for Loop
        for(int i = 0; i<marks.length; i++){
            for (int j = 0; j<marks[i].length; j++){
                System.out.print(marks[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        // using for each Loop
        for (int[] arr1 : marks){
            for (int arr2 : arr1) System.out.print(arr2 + " ");
            System.out.println();
        }
        System.out.println(Arrays.deepToString(marks)); //  "deepToString" returns
        // a string representation of the “deep contents” of the specified array.
    }
}
