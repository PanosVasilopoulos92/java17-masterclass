package section11_abstraction.lesson153_challenge_second_approach;

public class ArtObject extends ProductForSale{

    public ArtObject(String type, String description, double price) {
        super(type, description, price);
    }

    @Override
    public void showDetails() {
        System.out.println(this);
    }

    @Override
    public void printPricedItem(int quantity) {
        super.printPricedItem(quantity);
    }

    @Override
    public String toString() {
        return "ArtObject{" +
                "type='" + type + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
}
