
class ArrayChangeCheck {
    public static void main(String args[]){
        int a[] = new int[5];
        int b[] = new int[5];

        for(int i=0; i<5; i++){
            a[i] = i*2+5;
        }
        b = a;
        System.out.print("Before change a[] - ");
        for(int i=0; i<5; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.print("Before change b[] - ");
        for(int i=0; i<5; i++){
            System.out.print(b[i] + " ");
        }
        b[2]=55;
        System.out.println();
        System.out.print("After change a[] - ");
        for(int i=0; i<5; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.print("After change b[] - ");
        for(int i=0; i<5; i++){
            System.out.print(b[i] + " ");
        }
    }
}
