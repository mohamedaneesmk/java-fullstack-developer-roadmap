import java.util.TreeMap;
import java.util.Map;

public class TreeMapDemo {
    public static void main(String[] args) {

        // Creating TreeMap
        TreeMap<Integer, String> map = new TreeMap<>();

        // Adding key-value pairs
        map.put(3, "Spring");
        map.put(1, "Java");
        map.put(4, "React");
        map.put(2, "Python");
        map.put(1, "Java Updated"); // duplicate key (value replaced)
        // map.put(null, "Null");   // Null keys not allowed

        System.out.println("Initial TreeMap: " + map);

        // Getting value
        System.out.println("Value for key 2: " + map.get(2));

        // Checking key
        System.out.println("Contains key 3? " + map.containsKey(3));

        // Removing entry
        map.remove(4);
        System.out.println("After removal: " + map);

        // Size of TreeMap
        System.out.println("Size: " + map.size());

        // Iterating using entrySet
        System.out.println("Iterating using entrySet:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        // First and last keys
        System.out.println("First key: " + map.firstKey());
        System.out.println("Last key: " + map.lastKey());

        // Clearing TreeMap
        map.clear();
        System.out.println("After clear: " + map);
    }
}
