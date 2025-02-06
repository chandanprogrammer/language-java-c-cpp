package questionProblem;

import java.util.*;

public class MedianInArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 2};
        int[] arr2 = {3, 4};
        System.out.println(findMedianSortedArrays(arr1, arr2));
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int totalSize = nums1.length + nums2.length;

        int[] newArray = new int[totalSize];
        for(int i=0; i<totalSize; i++){
            if(nums1.length > i) newArray[i] = nums1[i];
            else newArray[i] = nums2[i-nums1.length];
        }
        for(int e : newArray) System.out.print(e + " ");
        System.out.println();

        Arrays.sort(newArray);
        int newArraySize = newArray.length;
        if( newArraySize % 2 == 0){
            double a = newArray[newArraySize/2-1];
            double b = newArray[(newArraySize/2)];
            return (a + b)/2;
        }
        else{
            return newArray[newArraySize/2];
        }
    }
}
