class ExtendArraySize {
    public static void main(String[] args) {
        int a[], b[];
        a = new int[5];
        b = new int[5];

        // set value in a[]
        for(int i=0; i<5; i++){
            a[i] = i*2+3;
        }

        // copy a[] in b[]
        for(int i=0; i<5; i++){
            b[i] = a[i];
        }
        
        a = new int[7];
        for(int i=0; i<5; i++){
            a[i] = b[i];
        }
        
        for(int i=0; i<7; i++){
            System.out.print(a[i] + " ");
        }
    }
}
