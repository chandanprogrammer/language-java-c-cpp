
class ArrayPassThroughMethod{

    static void printArr(int a[]){
        for(int i=0; i<a.length; i++){
            System.out.print(a[i] + " ");
        }
    }
    public static void main(String[] args) {
        int a[];
        a = new int[5];
        for(int i=0; i<5; i++){
            a[i] = i*4+2;
        }
        printArr(a);
    }
}