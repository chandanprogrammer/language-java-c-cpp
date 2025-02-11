
class FindMaxNoInArray {
    public static void main(String[] args) {
        int a[] = new int[6];
        
        for(int i=0; i<6; i++){
            if(i/2 == 0){
                a[i] = i*3 + 2;
            }
            else{
                a[i] = i*2 - 1;
            }
        }
        // a[2] = 44;
        for(int i=0; i<6; i++){
            System.out.print(a[i] + " ");
        }
        
        System.out.println();
        
        int max = a[0];
        for(int i=1; i<6; i++){
            if(a[i]>max){
                max = a[i];
            }
        }
        System.out.println("Maximum number in array " + max);
    }    
}
