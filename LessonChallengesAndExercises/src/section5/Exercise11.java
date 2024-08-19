package section5;

/*
    "Equality Printer":
    Write a method printEqual with 3 parameters of type int. The method should not return anything (void).
    If one of the parameters is less than 0, print text "Invalid Value".
    If all numbers are equal print text "All numbers are equal"
    If all numbers are different print text "All numbers are different".
    Otherwise, print "Neither all are equal nor different".

    NOTES:
    The solution will not be accepted if there are extra spaces.
    The method printEqual needs to be defined as public static like we have been doing so far in the course.
*/
public class Exercise11 {

    public static void main(String[] args) {
        printEqual(10,10,-1);
    }

    public static void printEqual(int a, int b, int c) {
        if (a < 0 || b < 0 || c < 0) {
            System.out.println("Invalid Value");
        }

        if (a == b && b == c){
            System.out.println("Numbers are equals");
        } else {
            System.out.println("Numbers are not equal");
        }
    }
}
