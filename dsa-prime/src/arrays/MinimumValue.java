package arrays;

public class MinimumValue {
    public static void main(String[] args) {

        int[] marks ={67, 89, 45, 34, 98, 33, 42};

        // find minimum value in the array

        int min = Integer.MAX_VALUE;
        for (int number : marks){
            if(number < min) min = number;
        }
        System.out.println( "Minimum value is "+ min); // 33
    }
}
