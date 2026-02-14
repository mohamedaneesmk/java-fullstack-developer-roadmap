public class Polymorphism {

    // ---------------- PARENT CLASS ----------------
    static class Animal {

        public void sound() {
            System.out.println("Animal makes a sound");
        }
    }

    // ---------------- CHILD CLASS ----------------
    static class Dog extends Animal {

        // Overriding parent method
        @Override
        public void sound() {
            System.out.println("Dog barks");
        }
    }

    static class Cat extends Animal {

        // Overriding parent method
        @Override
        public void sound() {
            System.out.println("Cat meows");
        }
    }

    public static void main(String[] args) {

        // Same reference type, different objects
        Animal a1 = new Dog();
        Animal a2 = new Cat();

        a1.sound(); // Dog version
        a2.sound(); // Cat version
    }
}
