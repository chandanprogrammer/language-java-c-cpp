
class methodArrayReturn {
    static int[] returnArray(){
        return new int[] {2, 4, 3};
    }    
    public static void main(String arg[]){
        int a[] = returnArray();
        for(int i=0; i<a.length; i++){
            System.out.print(a[i] + " ");
        }

        // int a[] = new int[returnArray().length];
        // a = returnArray();
        // for(int i=0; i<a.length; i++){
        //     System.out.print(a[i] + " ");
        // }
    }
}
