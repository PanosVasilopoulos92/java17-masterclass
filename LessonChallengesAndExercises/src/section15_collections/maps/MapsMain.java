package section15_collections.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapsMain {

    public static void main(String[] args) {

        // Create a HashMap to store fruit prices
        Map<String, Double> fruitPrices = new HashMap<>();

        // Adding elements to the map
        fruitPrices.put("Apple", 0.99);
        fruitPrices.put("Banana", 0.59);
        fruitPrices.put("Cherry", 2.99);
        fruitPrices.put("Date", 3.49);
        fruitPrices.put("Elderberry", 1.99);

        // Displaying the map
        System.out.println("Fruit Prices: " + fruitPrices);

        // Accessing a value
        Double applePrice = fruitPrices.get("Apple");
        System.out.println("Price of Apple: $" + applePrice);

        // Checking if a key exists
        if (fruitPrices.containsKey("Banana")) {
            System.out.println("Banana is available.");
        }

        // Removing an element
        fruitPrices.remove("Cherry");
        System.out.println("After removing Cherry: " + fruitPrices);

        // Iterating through the map
        System.out.println("All fruit prices:");
        for (Map.Entry<String, Double> entry : fruitPrices.entrySet()) {
            System.out.println(entry.getKey() + ": $" + entry.getValue());
        }

        // Getting the size of the map
        System.out.println("Total number of fruits: " + fruitPrices.size());

        // Clearing the map
        fruitPrices.clear();
        System.out.println("After clearing, map size: " + fruitPrices.size());

        System.out.println("*".repeat(12));


        // Implementation of TreeMap
        // Create a TreeMap to store country names and their capitals
        TreeMap<String, String> countryCapitalMap = new TreeMap<>();

        // Adding elements to the TreeMap
        countryCapitalMap.put("Hellas", "Athens");
        countryCapitalMap.put("Canada", "Ottawa");
        countryCapitalMap.put("India", "New Delhi");
        countryCapitalMap.put("USA", "Washington, D.C.");
        countryCapitalMap.put("Australia", "Canberra");

        // Displaying the TreeMap
        System.out.println("Country-Capital Map: " + countryCapitalMap);

        // Accessing a value
        String capitalOfIndia = countryCapitalMap.get("Hellas");
        System.out.println("Capital of Hellas: " + capitalOfIndia);

        // Checking if a key exists
        if (countryCapitalMap.containsKey("Germany")) {
            System.out.println("Germany is in the map.");
        }

        // Removing an element
        countryCapitalMap.remove("Australia");
        System.out.println("After removing Australia: " + countryCapitalMap);

        // Iterating through the TreeMap
        System.out.println("All countries and their capitals:");
        for (Map.Entry<String, String> entry : countryCapitalMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Getting the first and last keys
        System.out.println("First Country: " + countryCapitalMap.firstKey());
        System.out.println("Last Country: " + countryCapitalMap.lastKey());

        // Clearing the TreeMap
        countryCapitalMap.clear();
        System.out.println("After clearing, map size: " + countryCapitalMap.size());
    }
}
