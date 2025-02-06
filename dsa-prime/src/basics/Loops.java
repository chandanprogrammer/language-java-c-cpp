package basics;

public class Loops {
    public static void main(String[] args) {
        int num = 5; // print 5 table
        // for loop...
        for (int a = 1; a<=10; a++){
            System.out.println(num + " * " + a + " = " + num*a);
        }

        // while loop...
        int a = 1;
        while(a<=10){
            if(a==5){
                a++;
                continue; // continue skip the particular iteration
            }
            System.out.println(num + " * " + a + " = " + num*a);
            a++;
        }

        // do-while loop...
        int b = 1;
        do{
            System.out.println(num + " * " + b + " = " + num*b);
            if(b==5) break; // break completely exit the loop
            b++;
        } while(b<=10);
    }
}
