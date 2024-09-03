package section5;

/*
    "Area Calculator":
    Write a method named area with one double parameter named radius.
    The method needs to return a double value that represents the area of a circle.
    If the parameter radius is negative then return -1.0 to represent an invalid value.
    Write another overloaded method with 2 parameters x and y (both doubles), where x and y represent the sides of a rectangle.
    The method needs to return an area of a rectangle.
    If either or both parameters is/are a negative return -1.0 to indicate an invalid value.

    NOTE: All methods need to be defined as public static like we have been doing so far in the course.
*/
public class Exercise9 {

    public static void main(String[] args) {
        double circleArea = area(12.4);
        System.out.println(circleArea + " cm^2");

        double rectangleArea = area(12.2, 18.14);
        System.out.println(rectangleArea + " cm^2");
    }

    public static double area(double radius) {
        if (radius < 0) {
            return -1;
        }

        return Math.PI * Math.pow(radius, 2.0);
    }

    public static double area(double x, double y) {
        if (x < 0 || y < 0) {
            return -1;
        }
        return x * y;
    }
}
