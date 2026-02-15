import java.util.TreeSet;
import java.util.Iterator;

public class TreeSetDemo {
    public static void main(String[] args) {

        // Creating TreeSet
        TreeSet<Integer> set = new TreeSet<>();

        // Adding elements
        set.add(40);
        set.add(10);
        set.add(30);
        set.add(20);
        set.add(10);   // duplicate (ignored)
        // set.add(null); //  Not allowed (NullPointerException)

        System.out.println("Initial TreeSet: " + set);

        // Size of TreeSet
        System.out.println("Size: " + set.size());

        // Checking element
        System.out.println("Contains 20? " + set.contains(20));

        // Removing element
        set.remove(30);
        System.out.println("After removal: " + set);

        // Iterating using for-each loop
        System.out.print("For-each loop: ");
        for (Integer i : set) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Iterating using Iterator
        System.out.print("Using Iterator: ");
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        // First and last elements
        System.out.println("First element: " + set.first());
        System.out.println("Last element: " + set.last());

        // Clearing TreeSet
        set.clear();
        System.out.println("After clear: " + set);
    }
}
