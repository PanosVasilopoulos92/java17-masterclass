package section10_lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

record GroceryItems(String name, int amount, String type) {
    public GroceryItems(String name, int amount) {
        this(name, amount, "Eatable");
    }
}

public class ExperimentWithArrayList {

    public static void main(String[] args) {
        GroceryItems[] groceryItems = new GroceryItems[3];
        groceryItems[0] = new GroceryItems("apples", 4);
        groceryItems[1] = new GroceryItems("oranges", 8);
        groceryItems[2] = new GroceryItems("bananas", 5, "Fruit");

        System.out.println(Arrays.toString(groceryItems));

        ArrayList groceryItems2 = new ArrayList<>();
        groceryItems2.add(new GroceryItems("apples", 4));
        groceryItems2.add(new GroceryItems("cherries", 10, "Healthy"));
        groceryItems2.add("Not a grocery item");
        System.out.println(groceryItems2);

        ArrayList<GroceryItems> groceryItems3 = new ArrayList<>();
        groceryItems3.add(new GroceryItems("bananas", 5));
//        groceryItems3.add("not a grocery item"); // Now accepts only values of type 'GroceryItems'.
        int listSize = groceryItems3.size();
        System.out.println(listSize);
        System.out.println(groceryItems3.get(0));
        System.out.println("-------------\n");

        String[] items = {"apples", "bananas", "eggs", "milk"};

        List<String> list = List.of(items);
//        list.add("yogurt"); // List is immutable, so cannot add elements!
//        list.remove(0); // List is immutable, so cannot remove elements!
        System.out.println(list);

//        ArrayList<String> groceries = new ArrayList<>(List.of(items));
        ArrayList<String> groceries = new ArrayList<>(list);
        groceries.add("yogurt");
        System.out.println(groceries);
        groceries.set(0, "yogurt");
        System.out.println(groceries);
        System.out.println("------------\n");

        ArrayList<String> groceries2 = new ArrayList<>(List.of("nectarines", "ananas"));
        groceries2.addAll(groceries);
        System.out.println(groceries);
        System.out.println(groceries2);
        System.out.println("--------\n");

        groceries2.add("ananas");
        System.out.println(groceries2);
        groceries2.removeAll(List.of("ananas", "bananas"));
        System.out.println(groceries2);
        System.out.println("--------\n");

        groceries2.retainAll(Arrays.asList("yogurt", "milk", "eggs"));
        System.out.println(groceries2);
        groceries2.clear();
        System.out.println(groceries2);
        System.out.printf("List is empty: %s", groceries2.isEmpty());
        System.out.println("--------\n");

        groceries2.addAll(List.of("yogurt", "eggs", "honey", "feta"));
        System.out.println(groceries2);
        groceries2.remove(0);
        System.out.println(groceries2);
        System.out.println("--------");

        groceries2.sort(Comparator.naturalOrder());
        System.out.println(groceries2);
        groceries2.sort(Comparator.reverseOrder());
        System.out.println(groceries2);
        System.out.println("--------\n");

        var groceries2ToString = groceries2.toString();
        System.out.println(groceries2ToString.toUpperCase());

        var groceries2ToArray = groceries2.toArray(new String[0]);
        System.out.println(groceries2ToArray.length);
        System.out.println(Arrays.toString(groceries2ToArray));
        System.out.println("--------\n");

        groceries2.add("apples");
        System.out.println(groceries2);
        groceries2.add(groceries2.size()-1, "oranges");
        System.out.println(groceries2);
//        System.out.println(groceries2.get(20));
    }
}
