package section10_lists;

import java.util.ArrayList;
import java.util.Scanner;

public class Lesson135Challenge {

    static ArrayList<String> arrayList = new ArrayList<>();

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        while (true) {
            displayOptions();
            handleUserInput(getUserInput(""));
        }
    }

    private static String getUserInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.next();
    }

    private static void handleUserInput(String userChoice) {

        switch (userChoice) {
            case "0" -> {
                System.out.println("Program exits...");
                System.exit(0);
            }
            case "1" -> arrayList.add(getUserInput("Type the item you want to add to the list:"));
            case "2" -> {
                if (arrayList.size() == 0) {
                    System.out.println("Cannot remove from empty list.");
                    break;
                }
                arrayList.remove(getUserInput("Type the item you want to remove from list:"));
            }
            case "3" -> System.out.println(arrayList);
            default -> System.out.println("Not a valid input.");
        }
    }

    private static void displayOptions() {
        System.out.println();

        String displayOptions = """
                Available options:
                0 - to close program.
                1 - to add item to list.
                2 - to remove item from the list.
                3 - to display the items in the list.
                Now enter the number of your preferred option:""";
        System.out.print(displayOptions);
    }
}
