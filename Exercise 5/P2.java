public class I8 {
    public static void main(String[] args) {
        // Hybrid inheritance demonstration
        SportsCar sportsCar = new SportsCar();
        sportsCar.start(); 
        sportsCar.driveFast(); 
        Bike bike = new Bike();
        bike.start();
    }
}

class Vehicle {
    void start() {
        System.out.println("Vehicle is starting");
    }
}

class Car extends Vehicle {
    void start() {
        System.out.println("Car is starting");
    }
}


class SportsCar extends Car {
    void driveFast() {
        System.out.println("Sports car is driving fast");
    }
}

class Bike extends Vehicle {
    void start() {
        System.out.println("Bike is starting");
    }
}

