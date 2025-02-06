package arrays;

import java.util.*;

public class BasicArray {
    public static void main(String[] args) {
        // int arr[];
        int[] arr; // Declaration
        arr = new int[8]; // Allocation
        arr[0] = 12;
        arr[2] = 29;
        System.out.println(arr[0]); // 12

        int[] age = new int[6]; // Declaration and Allocation same time
        System.out.println(age[5]); // default value of int type array is 0
        System.out.println(age); // address of array

        int[] marks ={67, 89, 45, 34, 98, 33, 42}; // Direct initialize
        // print value of array using for Loop
        for(int i=0; i<marks.length; i++){ //marks.length --> 7 (find length of array)
            System.out.print(marks[i] + " ");
        }
        System.out.println();

        String[] students ={"Rahul", "Chandan", "Aman"};
        // print value of array using for each Loop
        for(String student : students){
            System.out.print(student + " ");
        }

    }
}