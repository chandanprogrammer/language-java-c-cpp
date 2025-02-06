package oops.ThisSuperKeyword;

public class Vehicle {
    int wheelsCount;
    String model;
    Vehicle(){
        System.out.println("Creating a vehicle instance");
    }
    Vehicle(int wheelsCount){
        this.wheelsCount = wheelsCount;
        System.out.println("Creating vehicle with wheelsCount " + wheelsCount);
    }
    void start(){
        System.out.println("Vehicle is starting");
    }
}

