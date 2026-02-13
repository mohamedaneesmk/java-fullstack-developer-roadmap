class MethodsAndConstructors {

    int value;

    // Constructor (same name as class)
    MethodsAndConstructors(int v) {
        value = v;
    }

    // Method
    void show() {
        System.out.println("Value: " + value);
    }

    public static void main(String[] args) {
        MethodsAndConstructors obj = new MethodsAndConstructors(10); // constructor call
        obj.show(); // method call
    }
}
