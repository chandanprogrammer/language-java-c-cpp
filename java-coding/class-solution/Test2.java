import java.util.Scanner;

class demo{
    int val = 45;
    // static int val = 45;
}

class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter value of a : ");
        int b = sc.nextInt();
        System.out.println(b);
        demo ref = new demo();
        System.out.println(ref.val);
        // System.out.println(demo.val);
        sc.close();
    }
}
