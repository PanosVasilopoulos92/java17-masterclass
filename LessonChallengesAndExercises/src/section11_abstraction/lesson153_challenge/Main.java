package section11_abstraction.lesson153_challenge;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Item item1 = new Item("banana", "it is a fruit", 0.90);
        Item item2 = new Item("apple", "it is a fruit", 0.45);
        Item item3 = new Item("cherries", "it is a fruit", 0.02);
        System.out.println(item2);

        OrderItem order1 = new OrderItem(item1, 10);
        OrderItem order2 = new OrderItem(item2, 10);
        OrderItem order3 = new OrderItem(item3, 20);
        System.out.println(order1);

        System.out.println(order1.calculatePrice());

        ArrayList<OrderItem> completeOrder = new ArrayList<>(100);
        completeOrder.add(order1);
        completeOrder.add(order2);
        completeOrder.add(order3);
        System.out.println("------\n");

        double totalAmountOfOrders = 0.0;

        System.out.println(completeOrder);
        for (OrderItem order : completeOrder) {
            System.out.println(order);
            System.out.printf("price of order: %.2f\n", order.calculatePrice());
            totalAmountOfOrders += order.calculatePrice();
        }

        System.out.println("total amount = " + totalAmountOfOrders);

    }
}
