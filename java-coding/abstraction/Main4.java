abstract class Fruits {
    int quantity;
    static String lastFruitName;

    Fruits(int quantity, String fName) {
        this.quantity = quantity;
        Fruits.lastFruitName = fName;
        System.out.println("quantity of " + fName + " : " + quantity + " kg");
    }

    abstract String getTest();

    void getAvailable() {
        System.out.println("Yes Avilable.");
    }

    static String getLastFruit() {
        return lastFruitName;
    }
}

class Mango extends Fruits {
    Mango(int qty) {
        super(qty, "Mango"); // constructor call Fruits
    }

    String getTest() {
        return "Slightly Sweet";
    }

    void getAvailable() {
        System.out.println("No Avilable.");
    }
}

class Guava extends Fruits {
    Guava(int qty) {
        super(qty, "Guava"); // constructor call Fruits
    }

    String getTest() {
        return "Sweet";
    }
}
class Apple extends Fruits {
    Apple(int qty) {
        super(qty, "Apple"); // constructor call Fruits
    }

    String getTest() {
        return "Very Sweet";
    }
}

class Main4 {
    static{
        System.out.println("Fruits Details....");
    }
    public static void main(String[] args) {
        Mango m1 = new Mango(2);
        Guava m2 = new Guava(8);
        Apple m3 = new Apple(5);
        System.out.println(m1.getTest());
        System.out.println(m2.getTest());
        System.out.println(m3.getTest());
        m1.getAvailable();
        System.out.println(Fruits.getLastFruit());
    }
}
