public class MultiThreadingDemo {

    // Shared Resource
    static class Counter {
        private int count = 0;

        // Synchronized method to avoid race condition
        public synchronized void increment() {
            count++;
        }

        public int getCount() {
            return count;
        }
    }

    static class MyRunnable implements Runnable {

        private Counter counter;

        MyRunnable(Counter counter) {
            this.counter = counter;
        }

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + " started");

            for (int i = 1; i <= 5; i++) {
                counter.increment(); // Shared resource access

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println("Thread Interrupted");
                }

                System.out.println(Thread.currentThread().getName() + " - Count: " + counter.getCount());
            }

            System.out.println(Thread.currentThread().getName() + " finished");
        }
    }

    public static void main(String[] args) throws InterruptedException {

        Counter counter = new Counter();

        MyRunnable task = new MyRunnable(counter);

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        // Naming threads
        t1.setName("Thread-1");
        t2.setName("Thread-2");

        // Setting priority
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();

        // Check if thread is alive
        System.out.println("Is t1 alive? " + t1.isAlive());

        // Wait for threads to finish
        t1.join();
        t2.join();

        System.out.println("Final Counter Value: " + counter.getCount());
        System.out.println("Main thread finished");
    }
}