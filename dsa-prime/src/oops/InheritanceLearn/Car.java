package oops.InheritanceLearn;

public class Car extends Vehicle {
    public static void main(String[] args) {
        Car obj = new Car();
        obj.vehicleName = "Car";
        obj.wheelsCount = 4;
        obj.bodyFrame = "Aluminium";
        obj.vehicleDetails();
        obj.start();
    }
    void start(){
        System.out.println("Car is starting."); // Method overriding
    }
}
