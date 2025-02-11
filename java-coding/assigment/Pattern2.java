// Write a program in java to print this given pattern
// * * * * *
//   * * * *
//     * * *
//       * * 
//         *

class Pattern2 {
    public static void main(String arg[]) {
        int row=5;
        for(int i=0; i<row; i++){
            for(int j=0; j<row; j++){
                if(j<i){
                    System.out.print("  ");
                }
                else{
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }    
}
