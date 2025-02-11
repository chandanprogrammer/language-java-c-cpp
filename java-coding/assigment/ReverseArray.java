// Write a program in java to reverse an array of integer values

class ReverseArray {
    public static void main(String[] args) {
        int size = 6;
        int arr[] = new int[size];
        int rev[] = new int[size];

        // set value in arr
        for(int i=0; i<arr.length; i++){
            arr[i] = i*2+4;
        }

        // print arr
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // reverse array
        int count=arr.length-1;
        for(int i=0; i<arr.length; i++){
            rev[i] = arr[count];
            count--;
        }
        
        // print rev 
        for(int i=0; i<rev.length; i++){
            System.out.print(rev[i] + " ");
        }

    }
}
