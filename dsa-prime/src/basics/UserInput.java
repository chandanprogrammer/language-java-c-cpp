package basics;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // create object of Scanner class

        System.out.print("Enter first name : ");
        String firstName = sc.nextLine();
        System.out.print("Enter last name : ");
        String lastName = sc.nextLine();
        System.out.print("Enter your age : ");
        short age = sc.nextShort();
        System.out.print("Enter Account Balance : ");
        float balance = sc.nextFloat();

        System.out.print("Your name " + firstName + " " + lastName);
        System.out.println(" and your age is " + age +".");
        System.out.println("Your bank balance is ₹" + balance);
    }
}
