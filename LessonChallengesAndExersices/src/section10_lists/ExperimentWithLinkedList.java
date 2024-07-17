package section10_lists;

import java.util.LinkedList;

public class ExperimentWithLinkedList {

    public static void main(String[] args) {
        LinkedList<String> cities = new LinkedList<>();
        var countries = new LinkedList<String>();

        cities.add("Athens");
        cities.add(0, "Thessaloniki");
        System.out.println(cities);
        // Queue methods
        cities.offer("Hindenburg");
        System.out.println(cities);
        System.out.println("-------\n");

        countries.add("Denmark");
        countries.add("Norway");
        countries.addFirst("Hellas");
        countries.addLast("Switzerland");
        System.out.println(countries);

        String s1 = countries.remove();
        System.out.println("Country removed: " + s1);
        System.out.println(countries);
        System.out.println();
        String s2 = countries.removeLast();
        System.out.println("Country removed: " + s2);
        System.out.println(countries);
        System.out.println("-------\n");

        // Queue/Dequeue poll methods
        String s3 = countries.poll(); // removes first element from list.
        System.out.println("Country removed: " + s3);

        countries.push("Hellas");
        countries.push("Switzerland"); // last element in.
        System.out.println(countries);
        System.out.println("------\n");

        String s4 = countries.pop(); // removes first element from list.
        System.out.println("Country removed: " + s4);
        System.out.println(countries);
        System.out.println("-----\n");

        gettingElements(countries);
        System.out.println(countries);
    }

    private static void gettingElements(LinkedList<String> list){
        System.out.println("Retrieved element: "+ list.get(1));
        System.out.println("Retrieved element: "+ list.peek());
    }
}
