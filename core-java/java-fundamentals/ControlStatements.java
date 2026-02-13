class ControlDemo {
    public static void main(String[] args) {

        int num = 5;

        // if-else
        if (num % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

        // for loop
        for (int i = 1; i <= num; i++) {
            if (i == 3) continue;
            System.out.println(i);
        }
    }
}
