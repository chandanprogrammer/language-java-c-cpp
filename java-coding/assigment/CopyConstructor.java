// write a program in java to show copy constructor (passing through object).

class fruits {
    String fName;
    int price;

    fruits(String n, int p) {
        fName = n;
        price = p;
    }

    fruits(fruits ref) {
        fName = ref.fName;
        price = ref.price;
    }

    void display() {
        System.out.println(fName + " " + price);
    }
}

class CopyConstructor {
    public static void main(String arg[]) {
        fruits f1 = new fruits("banana", 60);
        fruits f2 = new fruits(f1);
        f1.display();
        f2.display();
    }
}