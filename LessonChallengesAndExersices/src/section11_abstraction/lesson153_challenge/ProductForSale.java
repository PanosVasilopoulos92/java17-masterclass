package section11_abstraction.lesson153_challenge;

public abstract class ProductForSale {
    protected String type;
    protected String description;
    protected double price;

    public ProductForSale() {
    }

    public ProductForSale(String type, String description, double price) {
        this.type = type;
        this.description = description;
        this.price = price;
    }

    public  abstract double calculatePrice();

    public abstract void showDetails();

}
