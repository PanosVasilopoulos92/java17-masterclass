package section12_generics.lesson167_challenge;

public interface IMappable {
    void render();

    static double[] stringToLatLon(String location) {

        String[] splits = location.split(",");
        double lat = Double.parseDouble(splits[0]);
        double lng = Double.parseDouble(splits[1]);
        return new double[]{lat, lng};

    }
}
