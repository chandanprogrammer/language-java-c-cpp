class calculateAverageCL {
    public static void main(String args[]) {
        int size = args.length;
        double sum =0;
        for(int i=0; i<size; i++){
            sum += Double.parseDouble(args[i]);
        }
        System.out.println("Average of given Array is " + sum/size);

        // int size = args.length;
        // int sum =0;
        // for(int i=0; i<size; i++){
        //     sum += Integer.parseInt(args[i]);
        // }
        // System.out.println("Average of given Array is " + sum/size);
    }    
}
