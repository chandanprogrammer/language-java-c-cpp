// Write a program in java to print this given pattern
// * * * * *
// *       *
// *       *
// *       *
// * * * * *

class Pattern1 {
    public static void main(String arg[]) {
        int row = 5;
        for (int i = 0; i < row; i++) {
            if (i == 0 || i == row - 1) {
                for (int j = 0; j < row; j++) {
                    System.out.print("* ");
                }
            } else {
                for (int j = 0; j < row; j++) {
                    if (j == 0 || j == row - 1) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
    }
}
