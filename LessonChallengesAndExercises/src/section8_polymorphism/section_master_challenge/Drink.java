package section8_polymorphism.section_master_challenge;

public class Drink {
    private String type;
    private String size;
    private double price;

    public Drink() {
        this.type = "lemonade";
        this.size = "medium";
        this.price = 1.20;
    }

    public Drink(String type, String size) {
        this.type = type;
        this.size = size;

        this.price = switch (size){
            case "small"-> 1.00;
            case "medium"-> 1.20;
            case "large" -> 1.40;
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
        return "Drink{" +
                "type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                '}';
    }
}
