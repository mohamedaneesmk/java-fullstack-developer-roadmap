import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {

        // Creating HashMap
        HashMap<Integer, String> map = new HashMap<>();

        // Adding key-value pairs
        map.put(1, "Java");
        map.put(2, "Python");
        map.put(3, "Spring");
        map.put(1, "Java Updated"); // duplicate key (value replaced)
        map.put(null, "Null Key");  // one null key allowed
        map.put(4, null);           // multiple null values allowed

        System.out.println("Initial HashMap: " + map);

        // Getting value using key
        System.out.println("Value for key 2: " + map.get(2));

        // Checking key and value
        System.out.println("Contains key 3? " + map.containsKey(3));
        System.out.println("Contains value Java? " + map.containsValue("Java"));

        // Removing element
        map.remove(4);
        System.out.println("After removal: " + map);

        // Size of HashMap
        System.out.println("Size: " + map.size());

        // Iterating using entrySet
        System.out.println("Iterating using entrySet:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        // Iterating using keySet
        System.out.println("Iterating using keySet:");
        Set<Integer> keys = map.keySet();
        for (Integer key : keys) {
            System.out.println(key + " = " + map.get(key));
        }

        // Checking empty
        System.out.println("Is HashMap empty? " + map.isEmpty());

        // Clearing HashMap
        map.clear();
        System.out.println("After clear: " + map);
    }
}
