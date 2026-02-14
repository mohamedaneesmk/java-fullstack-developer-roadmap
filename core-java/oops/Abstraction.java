public class Abstraction {

    // ---------------- ABSTRACT CLASS ----------------
    static abstract class Vehicle {

        // Abstract method (no body)
        abstract void start();

        // Normal method
        void fuel() {
            System.out.println("Vehicle needs fuel");
        }
    }

    // ---------------- CONCRETE CLASS ----------------
    static class Car extends Vehicle {

        // Implementing abstract method
        @Override
        void start() {
            System.out.println("Car starts with a key");
        }
    }

    public static void main(String[] args) {

        // Reference of abstract class, object of child class
        Vehicle vehicle = new Car();

        vehicle.start(); // implemented method
        vehicle.fuel(); // inherited method
    }
}
