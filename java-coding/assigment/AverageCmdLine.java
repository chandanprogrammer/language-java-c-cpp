// Write a program to calculate the average using command line.

class AverageCmdLine {
    public static void main(String arg[]) {
        double sum = 0;
        for (int i = 0; i < arg.length; i++) {
            sum += Double.parseDouble(arg[i]);
        }
        System.out.println("Average : " + sum / arg.length);
    }
}
