public class Encapsulation {

    // ---------------- DATA HIDING ----------------
    static class Student {

        // private variables (cannot be accessed directly)
        private String name;
        private int age;
        private long phone;

        // ---------------- CONSTRUCTOR ----------------
        // Used to initialize data at object creation
        Student(String name, int age, long phone) {
            this.name = name;   // this refers to current object
            this.age = age;
            this.phone = phone;
        }

        // ---------------- SETTERS ----------------
        // Used to modify private data (controlled access)

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setPhone(long phone) {
            this.phone = phone;
        }

        // ---------------- GETTERS ----------------
        // Used to read private data

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public long getPhone() {
            return phone;
        }
    }

    public static void main(String[] args) {

        // Object creation
        Student student = new Student("Anees", 22, 123456789);

        // Accessing data ONLY through getters
        System.out.println(student.getName());
        System.out.println(student.getAge());
        System.out.println(student.getPhone());

        // Modifying data ONLY through setters
        student.setAge(23);

        System.out.println("Updated Age: " + student.getAge());
    }
}
