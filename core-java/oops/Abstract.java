abstract class Laptop {
    abstract void turnOff(); // declaration

    void turnOn() {
        System.out.println("Turnning ON");
    }
}

class Asus extends Laptop {
    @Override
    public void turnOn() {
        System.out.println("This is from asus");
    }

    public void turnOff() { // defenition
        System.out.println("Asus laptop turnning Off");
    }
}

class Victor extends Laptop {
    public void turnOff() { // defenition
        System.out.println("Victor laptop turnning Off");
    }
}

public class Abstract {
    public static void main(String[] args) {
        Asus asus = new Asus();
        asus.turnOn();
        asus.turnOff();

        Victor victor = new Victor();
        victor.turnOn();
        victor.turnOff();
    }
}