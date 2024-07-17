package section7_inheritance.exercise33;

public class Main {

    public static void main(String[] args) {
        Point point1 = new Point(2, 4);
        Point point2 = new Point(6, 10);

        System.out.printf("Distance is %.2f cm", Point.calculateDistance(point1, point2));
    }
}
