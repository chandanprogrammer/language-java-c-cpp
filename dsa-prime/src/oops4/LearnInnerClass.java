package oops4;

public class LearnInnerClass {
    class Toy{
        int toyCount = 4;
    }
    static class Playstation{
        void playFunction(){
            System.out.println("Playstation worked");
        }
    }
    public static void main(String[] args) {
        LearnInnerClass obj = new LearnInnerClass();
        Toy doll = obj.new Toy();
        System.out.println(doll.toyCount);

        Playstation playstation = new LearnInnerClass.Playstation();
        playstation.playFunction();
    }
}
