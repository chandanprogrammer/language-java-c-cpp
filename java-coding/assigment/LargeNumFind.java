// Write a program in java to find the largest number from an array as well as set value in array.

class LargeNumFind {
    public static void main(String arg[]) {
        int arr[] = new int[6];
        
        // set value in arr 
        for(int i=0; i<arr.length; i++){
            arr[i] = 4+i*3-2;
        }

        // to display array
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // find largest number
        int max=arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]>=max){
                max = arr[i];
            }
        }
        System.out.println("The Largest number is " + max);
    }
}
