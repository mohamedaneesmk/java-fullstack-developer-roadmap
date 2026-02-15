import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
    public static void main(String[] args) {

        // Creating HashSet (Generic)
        HashSet<Integer> set = new HashSet<>();

        // Adding elements
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(10);     // duplicate (ignored)
        set.add(null);   // one null allowed

        System.out.println("Initial HashSet: " + set);

        // Size of HashSet
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
        System.out.println("Is HashSet empty? " + set.isEmpty());

        // Clearing HashSet
        set.clear();
        System.out.println("After clear: " + set);
    }
}
