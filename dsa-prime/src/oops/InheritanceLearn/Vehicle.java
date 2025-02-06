package oops.InheritanceLearn;

public class Vehicle {
        int wheelsCount;
        String vehicleName;
        String bodyFrame;

        void vehicleDetails(){
            System.out.println("Vehicle name : " + vehicleName);
            System.out.println("Vehicle frame : " + bodyFrame);
            System.out.println("Vehicle wheel count : " + wheelsCount);
        }
        void start(){
            System.out.println("Vehicle is starting.");
        }
}
