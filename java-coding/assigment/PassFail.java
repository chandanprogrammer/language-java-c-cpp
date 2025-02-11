// Write a program in java to check student are pass (1st, 2nd, 3rd division) or fail. 

class PassFail {
    public static void main(String arg[]){
        int marks = 42;

        // condition check
        if(marks>=30){
            System.out.print("You passed with ");
            if(marks>=60){
                System.out.println("1st division.");
            }
            else if(marks>=45){
                System.out.println("2nd division.");
            }
            else{
                System.out.println("3rd division.");
            }
        }
        else{
            System.out.println("You fail.");
        }
    } 
}
