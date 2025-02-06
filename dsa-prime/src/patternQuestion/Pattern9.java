package patternQuestion;
//         *
//        * *
//       *   *
//      *     *
//     *       *
//    ***********
public class Pattern9 {
    public static void main(String[] args) {
        int n=7;
        for(int i=1; i<=n-1; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            System.out.print("*");
            for(int j=1; j<=2*i-3; j++){
                System.out.print(" ");
            }
            if(i>1){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1; i<=2*n-1; i++){
            System.out.print("*");
        }
    }
}
