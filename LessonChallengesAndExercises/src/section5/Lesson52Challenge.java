package section5;

public class Lesson52Challenge {

    public static void main(String[] args) {
        double result = convertToCentimeters(9, 13);
        System.out.println(result + " cm");
    }

    public static double convertToCentimeters(int heightInInches) {
        return 2.54 * heightInInches;
    }

    public static double convertToCentimeters(int feet, int inches) {
        int totalInches = (feet * 12) + inches;
        return (convertToCentimeters(totalInches));
    }
}
