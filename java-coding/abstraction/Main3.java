abstract class Bike {
    Bike() {
        System.out.println("This is bike.");
    }

    static void getGear() {
        System.out.println("Gear change.");
    }

    abstract void run();
}

class Honda extends Bike{
    void display() {
        System.out.println("This is display.");
    }
    
    void run() {
        System.out.println("Bike run.");
    }
    
    static void getGear() {
        System.out.println("Bike Gear change."); 
    }
}

class Main3 {
    public static void main(String[] args) {
        Honda ref = new Honda();
        ref.display();
        Bike.getGear();
        ref.getGear(); // Method hideing
        ref.run();
    }
}
