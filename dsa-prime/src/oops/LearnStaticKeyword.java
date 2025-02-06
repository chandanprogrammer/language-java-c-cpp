package oops;

public class LearnStaticKeyword {
    public static String collegeName = "AM College";

    static{
        System.out.println("This is static block-1");
    }
    public static void main(String[] args) {
        System.out.println(collegeName);
    }
    static{
        System.out.println("This is static block-2");
    }
}
