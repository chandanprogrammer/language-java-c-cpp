class Bank{
    void intrestRate(){
        System.out.println("This is bank");
    }
}
class SBI extends Bank{
    static void intrestRate1(){
        System.out.println("Intrest rate = 9%");
    }
}

class Mbank {
    public static void main(String arg[]) {
        Bank sbi = new SBI();
        sbi.intrestRate();
        SBI.intrestRate1();
    }
}

// Write a program in java to show method in static keyword 