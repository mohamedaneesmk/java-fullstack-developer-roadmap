class VariablesDemo {

    // Instance variable
    int instanceVar = 10;

    // Static variable
    static int staticVar = 20;

    void show() {
        // Local variable
        int localVar = 30;

        System.out.println("Local Variable: " + localVar);
        System.out.println("Instance Variable: " + instanceVar);
        System.out.println("Static Variable: " + staticVar);
    }

    public static void main(String[] args) {
        VariablesDemo obj = new VariablesDemo();
        obj.show();
    }
}
