package section7_inheritance.exercise32;

public class Main {

    public static void main(String[] args) {
        Wall myWall = new Wall(100.0, 2.5);
        System.out.println(myWall.getArea());

        myWall.setHeight(2.8);
        System.out.println(myWall.getArea());
    }
}
