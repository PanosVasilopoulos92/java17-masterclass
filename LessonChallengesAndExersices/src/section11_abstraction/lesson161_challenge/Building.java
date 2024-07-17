package section11_abstraction.lesson161_challenge;

public class Building implements Mappable{
    private String name;
    private UsageType usage;

    public Building(String name, UsageType usage) {
        this.name = name;
        this.usage = usage;
    }

    public String getName() {
        return name;
    }

    public UsageType getUsage() {
        return usage;
    }

    @Override
    public String getLabel() {
        return name + " (" + usage + ")";
    }

    @Override
    public String getMarker() {
        return switch (usage){
            case UNIVERSITY -> Color.YELLOW + " " + PointMarkers.RECTANGLE;
            case RESIDENTIAL -> Color.BLUE + " " + PointMarkers.DIAMOND;
            case ENTERTAINMENT -> Color.GREEN + " " + PointMarkers.STAR;
            case BUSINESS -> Color.RED + " " + PointMarkers.POLYGON;
            case SPORTS -> Color.BLACK + " " + PointMarkers.CIRCLE;
            default -> "Not valid";
        };
    }

    @Override
    public Geometry getShape() {
        return Geometry.POINT;
    }
}
