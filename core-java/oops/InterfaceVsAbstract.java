// ---------------- ABSTRACT CLASS ----------------
abstract class Vehicle {

    // Normal method
    void fuel() {
        System.out.println("Vehicle needs fuel");
    }

    // Abstract method
    abstract void start();
}

// ---------------- INTERFACE ----------------
interface MusicSystem {

    // Abstract method by default
    void playMusic();
}

// ---------------- CHILD CLASS ----------------
// Uses BOTH abstract class and interface
class Car extends Vehicle implements MusicSystem {

    // Implementing abstract method from Vehicle
    @Override
    void start() {
        System.out.println("Car starts with key");
    }

    // Implementing interface method
    @Override
    public void playMusic() {
        System.out.println("Playing music in car");
    }
}

// ---------------- MAIN CLASS ----------------
public class InterfaceVsAbstract {

    public static void main(String[] args) {

        Car car = new Car();

        car.start();       // from abstract class
        car.fuel();        // normal method from abstract class
        car.playMusic();   // from interface
    }
}
