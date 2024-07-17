package section7_inheritance.exercise33;

public class Point {
    private int x;
    private int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public static double calculateDistance(Point point1, Point point2){
        return Math.sqrt(Math.pow((point2.x - point1.x), 2) + Math.pow((point2.y - point1.y), 2));  // Math type:  d(A,B)=√ (xB − xA) * (xB - xA) + (yB − yA) * (yB - yA)
    }
}
