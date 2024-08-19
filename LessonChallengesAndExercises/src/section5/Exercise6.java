package section5;

public class Exercise6 {
    /*
    "Decimal Comparator":
    Write a method areEqualByThreeDecimalPlaces with two parameters of type double.
    The method should return boolean, and it needs to return true if two double numbers are the same
    up to three decimal places. Otherwise, return false.

    TIP: Use paper and pencil.
    TIP: Use casting.
    NOTE: The areEqualByThreeDecimalPlaces method  needs to be defined as public static like we have been doing so far in the course.
    NOTE: Do not add a  main method to solution code.
    */

    public static void main(String[] args) {
        double num1 = 12.76599325;
        double num2 = 12.76595325;
        boolean numbersAreEquals = areEqualByThreeDecimalPlaces(num1, num2);
        System.out.println(numbersAreEquals);
    }

    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
        boolean areEquals = false;
        final int numbersOfDecimalDigitsThatMatter = 1000; // for three important digits after comma
        long num1ToLong = Math.round(num1 * numbersOfDecimalDigitsThatMatter);
        long num2ToLong = Math.round(num2 * numbersOfDecimalDigitsThatMatter);
        System.out.println(num1ToLong + "\n"+ num2ToLong);

        if (num1ToLong == num2ToLong) {
            areEquals = true;
        }

        return areEquals;
    }
}
