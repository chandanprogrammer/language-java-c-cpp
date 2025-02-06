package AbstractClass;

abstract class Bike{
    Bike(){
        System.out.println("This is bike.");
    }
    static void getGear(){
        System.out.println("Gear change.");
    }
    abstract void run();
}

class AbstMain extends Bike {

    void display(){
        System.out.println("This is display");
    }
    void run(){
        System.out.println("Bike run.");
    }

    static void getGear(){
        System.out.println("Main Gear change.");
    }

    public static void main(String[] args) {
        AbstMain ref = new AbstMain();
        ref.display();
        Bike.getGear();
        getGear();
        ref.run();
    }
}
