package section12_generics.lesson167_challenge;

import java.util.Arrays;

public abstract class Point implements IMappable{
    public double[] location = new double[2];

    public Point(String location) {
        this.location = IMappable.stringToLatLon(location);
    }

    private String location(){
        return  Arrays.toString(location);
    }

    @Override
    public void render() {
        System.out.println("Render "+ this + " as POINT (" + location() + ")");
    }

    @Override
    public String toString() {
        return "Point{" +
                "location=" + Arrays.toString(location) +
                '}';
    }
}
