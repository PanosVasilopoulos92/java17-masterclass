package section12_generics.lesson167_challenge;

import java.util.Arrays;

public abstract class Line implements IMappable {
    private double[][] locations;

    public Line(String... locations) {
        this.locations = new double[locations.length][];
        int index = 0;
        for (var location : locations){
            this.locations[index++] = IMappable.stringToLatLon(location);
        }
    }

    private String locations() {
        return Arrays.deepToString(locations);
    }

    @Override
    public void render() {
        System.out.println("Render "+ this + " as LINE (" + locations() + ")");
    }

    @Override
    public String toString() {
        return "Line{" +
                "locations=" + Arrays.deepToString(locations) +
                '}';
    }
}
