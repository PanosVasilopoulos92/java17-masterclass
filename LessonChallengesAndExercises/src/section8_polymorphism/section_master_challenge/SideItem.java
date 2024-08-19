package section8_polymorphism.section_master_challenge;

public class SideItem {
    private String type;
    private double price;

    public SideItem(){
        this.type = "potatoes";
        this.price = 1.90;
    }

    public SideItem(String type) {
        this.type = type;
        this.price = switch (type){
            case "potatoes"-> 1.90;
            case "salad"-> 2.10;
            default -> -1;
        };
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "SideItem{" +
                "type='" + type + '\'' +
                ", price=" + price +
                '}';
    }
}
