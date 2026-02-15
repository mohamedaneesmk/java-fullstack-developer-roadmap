// Interface
interface Father {
    void speak(); // abstract by default
}

// Implementing class
class InterfaceDemo implements Father {

    @Override
    public void speak() {
        System.out.println("Speaking!!");
    }

    public static void main(String[] args) {
        InterfaceDemo obj = new InterfaceDemo();
        obj.speak();
    }
}
