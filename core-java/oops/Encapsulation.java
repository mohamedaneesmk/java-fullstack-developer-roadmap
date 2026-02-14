public class Encapsulation {

    static class Student {
        private String name;
        private int age;
        private long phone;

        Student(String name, int age, long phone) {
            this.name = name;
            this.age = age;
            this.phone = phone;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setPhone(long phone) {
            this.phone = phone;
        }

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
        Student student = new Student("Anees", 22, 123456789);

        System.out.println(student.getName());
        System.out.println(student.getAge());
        System.out.println(student.getPhone());

    }
}