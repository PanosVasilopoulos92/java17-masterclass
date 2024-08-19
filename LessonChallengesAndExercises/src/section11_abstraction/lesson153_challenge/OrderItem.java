package section11_abstraction.lesson153_challenge;

public class OrderItem extends ProductForSale {
    private int quantity;
    private ProductForSale productForSale;

    public OrderItem(ProductForSale productForSale, int quantity) {
        this.productForSale = productForSale;
        this.quantity = quantity;
    }

    @Override
    public void showDetails() {
        System.out.println(productForSale.type);
        System.out.println(productForSale.description);
        System.out.println(productForSale.price);
    }

    @Override
    public double calculatePrice() {
         return quantity * productForSale.price;
    }

    @Override
    public String toString() {
        return "OrderItem{" +
                "quantity=" + quantity +
                ", productForSale=" + productForSale +
                '}';
    }
}
