package section5;

/*
    "Number In Word":
    Write a method called printNumberInWord. The method has one parameter number which is the whole number.
    The method needs to print "ZERO", "ONE", "TWO", ... "NINE", "OTHER" if the int parameter number is 0, 1, 2, .... 9
    or other for any other number including negative numbers. You can use if-else statement or switch statement whatever
    is easier for you.

    NOTE: Method printNumberInWord needs to be public static for now, we are only using static methods.
*/
public class Exercise13 {

    public static void main(String[] args) {
        System.out.println(printNumberInWord(4));
    }

    public static String printNumberInWord(int num) {

        String numInWord = switch (num) {
            case 1 -> "One";
            case 2 -> "Two";
            case 3 -> "Three";
            case 4 -> "Four";
            default -> "Something else";
        };

        return numInWord;
    }
}
