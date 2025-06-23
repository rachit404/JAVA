package DSA;

public class Hashset {
    public static void main(String[] args) {
        // Create a HashSet
        java.util.HashSet<String> set = new java.util.HashSet<>();

        // Add elements to the HashSet
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");

        // Display the HashSet
        System.out.println("HashSet: " + set);

        // Check if an element exists
        if (set.contains("Banana")) {
            System.out.println("Banana is in the HashSet.");
        } else {
            System.out.println("Banana is not in the HashSet.");
        }

        // Remove an element
        set.remove("Apple");
        System.out.println("After removing Apple: " + set);

        // Iterate through the HashSet
        System.out.println("Iterating through HashSet:");
        for (String fruit : set) {
            System.out.println(fruit);
        }
        // Check the size of the HashSet
        System.out.println("Size of HashSet: " + set.size());
        // Clear the HashSet
        set.clear();
        System.out.println("After clearing, HashSet size: " + set.size());
        // Check if the HashSet is empty
        if (set.isEmpty()) {
            System.out.println("HashSet is empty.");
        } else {
            System.out.println("HashSet is not empty.");
        }   
        // Re-add elements to demonstrate that it can be reused
        set.add("Orange");
        set.add("Grapes");
        set.add("Mango");   
        System.out.println("Re-added elements: " + set);
        // Check if the HashSet contains a specific element
        if (set.contains("Mango")) {
            System.out.println("Mango is in the HashSet.");
        } else {
            System.out.println("Mango is not in the HashSet.");
        }
        // Display the final state of the HashSet
        System.out.println("Final HashSet: " + set);        
    }
}
