package patternQuestion;

//              1
//            2 1 2
//          3 2 1 2 3
//        4 3 2 1 2 3 4
//      5 4 3 2 1 2 3 4 5
//    6 5 4 3 2 1 2 3 4 5 6

public class Pattern7 {
    public static void main(String[] args) {
        int n=6;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print("  ");
            }
            for(int j=i; j>0; j--){
                System.out.print(j+" ");
            }
            for(int j=1; j<i; j++){
                System.out.print((j+1)+" ");
            }
            System.out.println();
        }
    }
}
