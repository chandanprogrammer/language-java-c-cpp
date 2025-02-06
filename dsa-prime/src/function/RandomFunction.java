package function;

public class RandomFunction {

    // To generate random number between min value and max value
    public static void main(String[] args) {
        System.out.println( Math.random()); // value range [0, 1)

        System.out.println(getRandom(1, 6));
    }
    static int getRandom(int min, int max){
        return (int) (Math.random()*(max-min+1)+min);
    }
}


