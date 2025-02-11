package mypack.math;

public class DecimalToBinary {
    String binary="";
    public DecimalToBinary(int num) {
        while (num/2 != 0) {
            int bit = num % 2;
            num = num / 2;
            binary = bit + binary;
        }
        System.out.println(1 + binary);
    }
}
