package section8_polymorphism.section_master_challenge;

import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to our Burger House! Please make your order based on the following options in menu:");

        String printedOrder = getUserChoices();
        System.out.println();

//        Order order1 = new Order();
//        String printedOrder1 = order1.makeOrder("cheeseBurger", "medium", "coca-cola",
//                "small", "salad");

        System.out.println(printedOrder);
        System.out.println("-----------\n");

        printedOrder = getUserChoices();
        System.out.println();
        System.out.println(printedOrder);
    }

    private static void printMenu() {
        System.out.println("Our available burgers are:\n " +
                "1. simple burger, " +
                "2. cheeseBurger, " +
                "3. mushroomBurger, " +
                "4. veganBurger.");
        System.out.println("Our available drinks are:\n" +
                "1. coca-cola, " +
                "2. lemonade, " +
                "3. orange juice.");
        System.out.println("The above are of size small, medium and large.");
        System.out.println("Burgers are accompanied with ether salad or potatoes.");
//        System.out.println("In case you want to exit the app, just type 'q' or 'Q'.");
    }

    public static String getUserChoices() {
        Order order = new Order();
        printMenu();

        System.out.print("So, choose your type of burger: ");
        String burgerTypeChoice = scanner.nextLine();
        System.out.print("Which size you prefer? ");
        String burgerSizeChoice = scanner.nextLine();

        System.out.print("What type of drink? ");
        String drinkTypeChoice = scanner.nextLine();
        System.out.print("Size? ");
        String drinkSizeChoice = scanner.nextLine();

        System.out.print("Now choose the side item that will accompanies your burger:");
        String sideItemTypeChoice = scanner.nextLine();

        return order.makeOrder(burgerTypeChoice, burgerSizeChoice, drinkTypeChoice, drinkSizeChoice, sideItemTypeChoice);
    }
}
