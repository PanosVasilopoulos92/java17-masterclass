package section8_polymorphism.section_master_challenge;

public class Order {
    public static int orderNumber = 0;
    private Burger burger;
    private Drink drink;
    private SideItem sideItem;

    public Order() {
    }

    public Order(Burger burger, Drink drink, SideItem sideItem) {
        if (isValidSize(burger, drink, sideItem)) {
            this.burger = burger;
            this.drink = drink;
            this.sideItem = sideItem;
        } else {
            System.out.println("An error occurred in the order cause of ones item's size");
        }
    }

    public static int getOrderNumber() {
        return orderNumber;
    }

    public Burger getBurger() {
        return burger;
    }

    public Drink getDrink() {
        return drink;
    }

    public SideItem getSideItem() {
        return sideItem;
    }

    public String makeOrder(String typeOfBurger, String sizeOfBurger, String typeOfDrink,
                            String sizeOfDrink, String typeOfSideItem) {
        orderNumber++;

        Burger burger = new Burger(typeOfBurger, sizeOfBurger);
        Drink drink = new Drink(typeOfDrink, sizeOfDrink);
        SideItem sideItem = new SideItem(typeOfSideItem);

        if (!isValidSize(burger, drink, sideItem)) {
            return "Oops... there was an error in your order. We cannot proceed any further. Please try again.";
        } else {
            double price = calculateOrderPrice(burger, drink, sideItem);

            System.out.println("Perfect! Your order has been completed. Please wait for your receipt...");

            return String.format("Your order, with number: %d, consists of a %s, a %s and %s. It costs %.2f euros",
                    Order.orderNumber, burger.getType(), drink.getType(), sideItem.getType(), price);
        }

    }

    private boolean isValidSize(Burger burger, Drink drink, SideItem sideItem) {
        return (burger.getPrice() != -1) && (drink.getPrice() != -1) && (sideItem.getPrice() != -1);
    }

    private double calculateOrderPrice(Burger burger, Drink drink, SideItem sideItem) {
        double totalPrice = 0.0;
        double burgerFinalPrice = switch (burger.getType()) {
            case "simple burger" -> burger.getPrice() + 1.0;
            case "cheeseBurger" -> burger.getPrice() + 1.20;
            case "mushroomBurger" -> burger.getPrice() + 1.30;
            case "veganBurger" -> burger.getPrice() + 1.10;
            default -> -1;
        };

        return totalPrice = burgerFinalPrice + drink.getPrice() + sideItem.getPrice();
    }
}
