// Write a program in java to print 2D array.

class Print2DArray {
    public static void main(String args[]) {
        int arr[][] = {{3, 5, 3}, {5, 8, 4}};

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
