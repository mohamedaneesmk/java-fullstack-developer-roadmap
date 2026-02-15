import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListDemo {
    public static void main(String[] args) {

        // 1️. Creating an ArrayList (Generic)
        ArrayList<Integer> list = new ArrayList<>();

        // 2️. Adding elements
        list.add(2);
        list.add(3);
        list.add(9);
        list.add(3);          // duplicates allowed
        list.add(null);       // null allowed

        System.out.println("Initial List: " + list);

        // 3️. Accessing elements
        System.out.println("Element at index 1: " + list.get(1));

        // 4️. Updating elements
        list.set(0, 10);
        System.out.println("After update: " + list);

        // 5️. Removing elements
        list.remove(2);       // removes element at index 2
        list.remove(Integer.valueOf(3)); // removes first occurrence of 3
        System.out.println("After removal: " + list);

        // 6️. Size of ArrayList
        System.out.println("Size: " + list.size());

        // 7️. Searching elements
        System.out.println("Contains 9? " + list.contains(9));
        System.out.println("Index of 9: " + list.indexOf(9));

        // 8️. Iterating ArrayList (for-each)
        System.out.print("For-each loop: ");
        for (Integer i : list) {
            System.out.print(i + " ");
        }
        System.out.println();

        // 9️. Iterator
        System.out.print("Using Iterator: ");
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        // 10. Sorting
        Collections.sort(list);
        System.out.println("Sorted List: " + list);

        // 1️1. Clearing ArrayList
        list.clear();
        System.out.println("After clear: " + list);

        // 1️2. Checking empty
        System.out.println("Is list empty? " + list.isEmpty());
    }
}
