class printPattern1CL {
    public static void main(String arg[]) {
        int size = Integer.parseInt(arg[0]);
        for(int i=0; i<size; i++){
            for(int j=0; j<=i; j++){
                System.out.print(arg[1] + " ");
            }
            System.out.println();
        }
        // for(int i=0; i<size; i++){
        //     for(int j=0; j<=i; j++){
        //         System.out.print(i+1 + " ");
        //     }
        //     System.out.println();
        // }
    }    
}
