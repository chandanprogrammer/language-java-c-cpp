package oops.ThisSuperKeyword;

public class Car extends Vehicle {
    String color;
    public static void main(String[] args) {
        Car obj = new Car();
        System.out.println("wheelCount : " +obj.wheelsCount);
        obj.wheelsCount = 4;
        obj.model = "T15";
        obj.color = "Green";
        System.out.println("After WheelsCount : " +obj.wheelsCount);
        obj.start();
    }
    Car(){
        super(2); // call vehicle constructor
        System.out.println("Car is being created");
    }
    void start(){
        Scooter scooterObj = new Scooter();
        super.start();
        scooterObj.breaking(this);
        System.out.println(this);
        System.out.println(this.model + " car is starting.");
    }
}
class Scooter{
    void breaking(Car car){
        System.out.println(car.model + " is breaking.");
    }
}
