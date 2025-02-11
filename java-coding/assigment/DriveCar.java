// Write a program in java to check you can eligible for drive the car or not.

class DriveCar{
    public static void main(String arg[]) {
        int age = 24;

        // condition check
        if(age>=18 && age<=70){
            System.out.println("You can drive the car.");
        }
        else{
            System.out.println("You can not drive the car.");
        }
    }
}