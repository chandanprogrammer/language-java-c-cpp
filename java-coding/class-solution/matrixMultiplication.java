
public class matrixMultiplication {

    static void printArray(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void setArrayValue(int arr[][], int intVal) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = intVal;
                intVal++;
            }
        }
    }

    public static void main(String arg[]) {
        int row_arr1 = 2;
        int col_arr1 = 3;
        int row_arr2 = 3;
        int col_arr2 = 3;

        int arr1[][] = new int[row_arr1][col_arr1];
        int arr2[][] = new int[row_arr2][col_arr2];

        setArrayValue(arr1, 1);
        setArrayValue(arr2, 1);

        // Display given array
        System.out.println("Given arr1[][] = ");
        printArray(arr1);
        System.out.println("Given arr2[][] = ");
        printArray(arr2);

        // Check condition then calculate matrix multiplication
        System.out.println("Matrix Multiplication - ");
        if (col_arr1 == row_arr2) {
            for (int i = 0; i < arr1.length; i++) {
                for (int j = 0; j < arr2[0].length; j++) {
                    int val = 0;
                    for (int k = 0; k < arr1[0].length; k++) {
                        val += arr1[i][k] * arr2[k][j];
                    }
                    System.out.print(val + " ");
                }
                System.out.println();
            }
        }

        else {
            System.out.println("Not multiplication possible.");
        }

    }
}
