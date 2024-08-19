package section8_polymorphism.section_master_challenge;

public class Burger {
    private String type;
    private String size;
    private double price;

    public Burger() {
        this.type = "simple burger";
        this.size = "medium";
    }

    public Burger(String type, String size) {
        this.type = type;
        this.size = size;
        this.price = switch(size){
            case "small"-> 1.70;
            case "medium"-> 2.10;
            case "large"-> 3.20;
            default -> -1;
        };
    }

    public String getType() {
        return type;
    }

    public String getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Burger{" +
                "type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                '}';
    }
}
