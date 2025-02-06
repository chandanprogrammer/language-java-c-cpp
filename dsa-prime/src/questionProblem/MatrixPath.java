package questionProblem;

public class MatrixPath {
    public static void main(String[] args) {
        int m = 3, n=3;
        System.out.println("Way of Path : " + countPath(m, n));
    }
    static int countPath(int m, int n){
        if(m==1 || n==1) return 1;
        return countPath(m-1, n) + countPath(m, n-1);
    }
}
