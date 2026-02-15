import java.util.LinkedHashSet;
import java.util.Iterator;

public class LinkedHashSetDemo {
    public static void main(String[] args) {

        // Creating LinkedHashSet
        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        // Adding elements
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(10);     // duplicate (ignored)
        set.add(null);   // one null allowed

        System.out.println("Initial LinkedHashSet: " + set);

        // Size of LinkedHashSet
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

        // Checking empty
        System.out.println("Is LinkedHashSet empty? " + set.isEmpty());

        // Clearing LinkedHashSet
        set.clear();
        System.out.println("After clear: " + set);
    }
}
