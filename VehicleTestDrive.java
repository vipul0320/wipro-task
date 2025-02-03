/*Implement a class hierarchy for Vehicles with a base class Vehicle that contains a method startEngine(). 
Derive two classes: Car and Motorcycle, both overriding the startEngine() method to print different messages
 indicating how their engines are started. Create a method vehicleTestDrive(Vehicle vehicle) that accepts any
  object of type Vehicle and calls its startEngine() method. Demonstrate polymorphism by passing different 
  vehicle objects to this method. */
abstract class Vehicle {
    public abstract void startEngine();
}

class Car extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("The car engine starts with a key turn.");
    }
}

class Motorcycle extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("The motorcycle engine starts with a button press.");
    }
}


public class VehicleTestDrive {
    
    public static void vehicleTestDrive(Vehicle vehicle) {
        vehicle.startEngine();
    }

    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle motorcycle = new Motorcycle();

        System.out.println("Test Drive 1: ");
        vehicleTestDrive(car);
        
        System.out.println("\nTest Drive 2: ");
        vehicleTestDrive(motorcycle);
    }
}
