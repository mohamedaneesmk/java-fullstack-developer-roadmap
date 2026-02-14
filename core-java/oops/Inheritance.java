public class Inheritance {

    // ---------------- PARENT CLASS ----------------
    static class Animal {

        Animal() {
            System.out.println("Animal constructor called");
        }

        public void eat() {
            System.out.println("Animal is eating");
        }

        public void sound() {
            System.out.println("Animal makes a sound");
        }
    }

    // ---------------- CHILD CLASS ----------------
    static class Dog extends Animal {

        Dog() {
            super(); // calls Animal constructor
            System.out.println("Dog constructor called");
        }

        // Method Overriding
        @Override
        public void sound() {
            System.out.println("Dog barks");
        }

        public void bark() {
            System.out.println("Dog is barking");
        }
    }

    public static void main(String[] args) {

        // Normal object
        Dog dog = new Dog();
        dog.eat();    // inherited method
        dog.sound();  // overridden method
        dog.bark();   // child method

        System.out.println("------");

        // Upcasting (Polymorphism)
        Animal animal = new Dog();
        animal.eat();    // Animal method
        animal.sound();  // Dog method (runtime polymorphism)
        // animal.bark();  not accessible
    }
}
