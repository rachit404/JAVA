package DSA;

import java.util.HashMap;

public class Hashmap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        // Adding key-value pairs to the HashMap
        map.put("Alice", 25);
        map.put("Bob", 30);
        map.put("Charlie", 35);

        // Accessing values using keys
        System.out.println("Alice's age: " + map.get("Alice"));
        System.out.println("Bob's age: " + map.get("Bob"));
        // Checking if a key exists
        if (map.containsKey("Charlie")) {
            System.out.println("Charlie is in the map.");
        } else {
            System.out.println("Charlie is not in the map.");
        }

        // Removing a key-value pair
        map.remove("Bob");

        // Checking if the map is empty
        if (map.isEmpty()) {
            System.out.println("The map is empty.");
        } else {
            System.out.println("The map is not empty.");
        }
        // Iterating through the HashMap
        System.out.println("Current entries in the map:");
        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }
        // Clearing the HashMap
        map.clear();
        System.out.println("The map has been cleared.");
        // Checking if the map is empty after clearing
        if (map.isEmpty()) {
            System.out.println("The map is now empty.");
        } else {
            System.out.println("The map is not empty.");
        }
    }
}