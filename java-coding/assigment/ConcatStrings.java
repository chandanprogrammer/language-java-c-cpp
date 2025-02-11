// Write a program to concat two strings in java.

class ConcatStrings{
    public static void main(String arg[]){
        String firstName = "Chandan";
        String lastName = "Kumar";

        System.out.println(firstName + " " + lastName);

        // using concat method
        String fullName = firstName.concat( " " + lastName);
        System.out.println(fullName);
    }
}