
class CopyArray {
    public static void main(String[] args) {
        int a[], b[];
        a = new int[5];
        b = new int[2];
        for(int i=0; i<5; i++){
            a[i] = i*2+5;
        }
        b=a;
        for(int i=0; i<5; i++){
            System.out.print(b[i] + " ");
        }
        // a = new int[2];
        // b = new int[5];
        // for(int i=0; i<2; i++){
        //     a[i] = i*2+5;
        // }
        // b=a;
        // for(int i=0; i<5; i++){
        //     System.out.print(b[i] + " ");
        // }
    }    
}
