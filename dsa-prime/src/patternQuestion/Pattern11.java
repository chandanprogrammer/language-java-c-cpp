package patternQuestion;

//         *
//        ***
//       *****
//      *******
//     *********
//    ***********
//     *********
//      *******
//       *****
//        ***
//         *

public class Pattern11 {
    public static void main(String[] args) {
        int n = 6;
        for (int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=1; i<n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=2*(n+1-i)-3; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
