package section11_abstraction.lesson161_challenge;

public class UtilityLine implements Mappable {
    private String name;
    private UtilityType type;

    public UtilityLine(String name, UtilityType type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public UtilityType getType() {
        return type;
    }

    @Override
    public String getLabel() {
        return null;
    }

    @Override
    public String getMarker() {
        return null;
    }

    @Override
    public Geometry getShape() {
        return null;
    }
}
