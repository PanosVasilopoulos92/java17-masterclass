package section12_generics.lesson167_challenge;

public class Main {

    public static void main(String[] args) {
        var nationalParks = new Park[]{
                new Park("Athens Metropolitan", "12.4343, -21.653"),
                new Park("Thessaloniki Metropolitan", "19.234, -91.0004")
        };

        Layer<Park> parkLayer = new Layer<>(nationalParks);
        parkLayer.renderLayer();
        System.out.println("-".repeat(20));

        parkLayer.addElement(new Park("Chaidari Metropolitan", "21.2334, -190.69869"));
        parkLayer.renderLayer();
    }
}
