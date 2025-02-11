// Write a program in java to print 2D array where some value of column are not same in size. 

class Diff2DArraySize {
    public static void main(String arg[]) {
        int arr[][] = new int[3][];
        arr[0] = new int[2];
        arr[1] = new int[4];
        arr[2] = new int[1];

        // set value in array matrix
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                arr[i][j] = i*j+2;
            }
        }

        // print array matrix
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
