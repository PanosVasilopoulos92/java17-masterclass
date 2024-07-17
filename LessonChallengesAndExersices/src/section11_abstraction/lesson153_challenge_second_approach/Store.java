package section11_abstraction.lesson153_challenge_second_approach;

import java.util.ArrayList;

public class Store {
    private static ArrayList<ProductForSale> storeProducts = new ArrayList<>();

    public static void main(String[] args) {
        storeProducts.add(new ArtObject("yellowBanana", "a yellow fruit", 0.60));
        storeProducts.add(new ArtObject("greenBanana", "a green fruit", 0.60));

        System.out.println(storeProducts);

        for (var product : storeProducts) {
            product.printPricedItem(4);
            product.showDetails();
            System.out.println("-".repeat(10));
        }

//        OrderItem item = new OrderItem(10, new ArtObject("yellowBanana", "a yellow fruit", 0.60));
//        System.out.println(item);
    }
}
