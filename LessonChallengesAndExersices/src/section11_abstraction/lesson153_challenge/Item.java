package section11_abstraction.lesson153_challenge;

public class Item extends ProductForSale{

    public Item(String type, String description, double price) {
        super(type, description, price);
    }

    @Override
    public double calculatePrice() {
        return 0;
    }

    @Override
    public void showDetails() {
        System.out.println(type);
        System.out.println(description);
        System.out.println(price);
    }

    @Override
    public String toString() {
        return "Item{" +
                "type='" + type + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
}
