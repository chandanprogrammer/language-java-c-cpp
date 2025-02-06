package questionProblem;

public class DigitInWord {
    public static void main(String[] args) {
        String[] arr = {"zero", "one", "two", "three",
                "four", "five", "six", "seven", "eight", "nine"};
        int num = 234;
        printDigitInWord(num, arr);

    }
    public static void printDigitInWord(int num, String[] arr){
        if (num==0) return;
        int digit = num % 10;
        num = num/10;
        printDigitInWord(num ,arr);
        System.out.print(arr[digit] + " ");
    }
}
