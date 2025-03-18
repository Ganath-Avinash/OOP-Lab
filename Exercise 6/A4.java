public class A4{
    public static void main(String[] args) {
        ElectronicDevice phone = new Smartphone();
        ElectronicDevice laptop = new Laptop();

        phone.displayBrand("Apple");
        phone.turnOn();
        phone.turnOff();

        laptop.displayBrand("Dell");
        laptop.turnOn();
        laptop.turnOff();
    }
}

abstract class ElectronicDevice {
    abstract void turnOn();
    abstract void turnOff();

    void displayBrand(String brand) {
        System.out.println("Brand: " + brand);
    }
}

class Smartphone extends ElectronicDevice {

    void turnOn() {
        System.out.println("Smartphone is turning on...");
    }


    void turnOff() {
        System.out.println("Smartphone is turning off...");
    }
}

class Laptop extends ElectronicDevice {

    void turnOn() {
        System.out.println("Laptop is booting up...");
    }

    void turnOff() {
        System.out.println("Laptop is shutting down...");
    }
}

