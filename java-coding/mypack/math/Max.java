package mypack.math;

public class Max {

    /* find maximum integer number in given array */
    public int max(int arr[]){
        int maxVal=arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]>maxVal) maxVal=arr[i];
        }
        return maxVal;
    }

    /* find maximum float number in given array */
    public float max(float arr[]){
        float maxVal=arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]>maxVal) maxVal=arr[i];
        }
        return maxVal;
    }

    /* find maximum number in two integer value */
    public int max(int a, int b){
        if(a>b) return a;
        else if(a==b){
            System.out.println("Both number equal..");
            return a;
        }
        else return b;
    }

    /* find maximum number in two float value */
    public double max(double a, double b){
        if(a>b) return a;
        else if(a==b){
            System.out.println("Both number equal..");
            return a;
        }
        else return b;
    }
}
