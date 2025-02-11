// Write a program in java to add two matrixes.

class MatrixAddition {

    static void printArray(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void setArrayValue(int arr[][], int val) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = val;
                val++;
            }
        }
    }

    public static void main(String arg[]) {
        int row_arr1 = 3;
        int col_arr1 = 3;
        int row_arr2 = 3;
        int col_arr2 = 3;

        int arr1[][] = new int[row_arr1][col_arr1];
        int arr2[][] = new int[row_arr2][col_arr2];

        setArrayValue(arr1, 1);
        setArrayValue(arr2, 4);

        // Display given array
        System.out.println("Given arr1[][] = ");
        printArray(arr1);
        System.out.println("Given arr2[][] = ");
        printArray(arr2);

        // Check condition then calculate matrix addition
        if (row_arr1 == row_arr2 && col_arr1 == col_arr2) {
            System.out.println("Result when add both array : ");
            for (int i = 0; i < arr1.length; i++) {
                for (int j = 0; j < arr1[i].length; j++) {
                    int add = arr1[i][j] + arr2[i][j];
                    System.out.print(add + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Not addition possible.");
        }

    }
}
