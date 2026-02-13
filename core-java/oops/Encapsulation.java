class Student {
    // private variables (data hiding)
    private String name;
    private int age;

    // getter method
    public String getName() {
        return name;
    }

    // setter method
    public void setName(String name) {
        this.name = name;
    }

    // getter method
    public int getAge() {
        return age;
    }

    // setter method with validation
    public void setAge(int age) {
        if(age > 0) {
            this.age = age;
        }
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Anees");
        s.setAge(21);

        System.out.println(s.getName());
        System.out.println(s.getAge());
    }
}
