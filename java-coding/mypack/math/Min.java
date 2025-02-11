package mypack.math;

public class Min {

    /* find minimum integer number in given array */
    public int min(int arr[]){
        int minVal=arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]<minVal) minVal=arr[i];
        }
        return minVal;
    }

    /* find minimum float number in given array */
    public float min(float arr[]){
        float minVal=arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]<minVal) minVal=arr[i];
        }
        return minVal;
    }

    /* find minimum number in two integer value */
    public int min(int a, int b){
        if(a<b) return a;
        else if(a==b){
            System.out.println("Both number equal..");
            return a;
        }
        else return b;
    }

    /* find minimum number in two float value */
    public double min(double a, double b){
        if(a<b) return a;
        else if(a==b){
            System.out.println("Both number equal..");
            return a;
        }
        else return b;
    }
}
