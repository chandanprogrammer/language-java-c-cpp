package oops4;

public class LearnAbstract {
    public static void main(String[] args) {
//        Vehicle v1 = new Vehicle();
        Car c1 = new Car();
        c1.accelerated();
        c1.brakes(4);
    }
}
abstract class Vehicle{
    abstract void accelerated();
    abstract int brakes(int wheels);
    void honks(){
        System.out.println("Vehicle honks");
    }
}
class Car extends Vehicle{
    @Override // Annotation - not necessary written (for spelling check)
    void accelerated() {
        System.out.println("Car is Accelerating");
    }
    int brakes(int wheels) {
        System.out.println("Car break is pushed");
        return  wheels;
    }
}