package section11_abstraction.lesson153_challenge_second_approach;

public abstract class ProductForSale {
    protected String type;
    protected String description;
    protected double price;

    public ProductForSale(String type, String description, double price) {
        this.type = type;
        this.description = description;
        this.price = price;
    }

    public void printPricedItem(int quantity){
        System.out.printf("%d quantity at %.2f each cost %.2f. Item: %s, description: %s \n",
                quantity, price, getSalesPrice(quantity), type, description);
    }

    public double getSalesPrice(int quantity){
        return quantity * price;
    }

    public abstract void showDetails();
}
