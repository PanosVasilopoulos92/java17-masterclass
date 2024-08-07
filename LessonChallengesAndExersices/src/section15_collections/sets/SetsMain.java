package section15_collections.sets;

import java.util.*;

public class SetsMain {

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 9, 1, 1, 1, 1, 1, 1, 1, 1));
        Set<Integer> numbers = new HashSet<>(20);
        numbers.addAll(nums);
        System.out.println(numbers);
        System.out.println(numbers.size());

        Iterator<Integer> iterator = nums.iterator();

        int numberOfAsses = 0;
        while (iterator.hasNext()) {
            int num = iterator.next();
            if (num == 1) {
                numberOfAsses++;
            }
        }
        System.out.printf("List contains %d Asses%n", numberOfAsses);

        Set<Integer> checkedSet1 = Collections.checkedSet(numbers, Integer.class);
        checkedSet1.add(12);
        System.out.println(checkedSet1);
//        checkedSet1.add("12");
        System.out.println("-".repeat(12));

        // Create a Set using HashSet
        Set<String> fruits = new HashSet<>();

        // Adding elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Apple"); // Duplicate entry will be ignored

        System.out.println("Fruits Set: " + fruits);

        // Checks if a specific element exists
        if (fruits.contains("Banana")) {
            System.out.println("Banana is in the set.");
        }

        fruits.remove("Cherry");
        System.out.println("After removing Cherry: " + fruits);

        System.out.println("Size of the set: " + fruits.size());

        // Iterates through the set
        System.out.println("Iterating through the set:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Clears the set
        fruits.clear();
        System.out.println("After clearing the set: " + fruits);

        System.out.println("*".repeat(19));

        // Create a TreeSet of Strings
        TreeSet<String> treeSet = new TreeSet<>();

        treeSet.add("Banana");
        treeSet.add("Apple");
        treeSet.add("Orange");
        treeSet.add("Mango");
        treeSet.add("Grapes");
        treeSet.add("Apple"); // Duplicate entry, will be ignored

        // Will automatically order the inputs in natural order or based on a comparator provided.
        System.out.println("TreeSet elements: " + treeSet); // Output: [Apple, Banana, Grapes, Mango, Orange]

        // Checks if an element exists
        if (treeSet.contains("Mango")) {
            System.out.println("Mango is in the TreeSet.");
        }

        // Removes an element
        treeSet.remove("Orange");
        System.out.println("After removing Orange: " + treeSet); // Output: [Apple, Banana, Grapes, Mango]

        // Getting the first and last elements
        System.out.println("First element: " + treeSet.first()); // Output: Apple
        System.out.println("Last element: " + treeSet.last());   // Output: Mango

        // Navigating through the TreeSet
        System.out.println("Element just higher than Banana: " + treeSet.higher("Banana")); // Output: Grapes
        System.out.println("Element just lower than Mango: " + treeSet.lower("Mango"));     // Output: Grapes

        // Clearing the TreeSet
        treeSet.clear();
        System.out.println("After clearing, TreeSet size: " + treeSet.size()); // Output: 0

    }
}
