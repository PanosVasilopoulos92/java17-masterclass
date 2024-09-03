package section5;

/*
*   "Minutes To Years, Days and Hours Calculator":
    Write a method printYearsAndDays with parameter of type long named minutes.
    The method should not return anything (void) and it needs to calculate the years and days from the minutes parameter.
    If the parameter is less than 0, print text "Invalid Value".
    Otherwise, if the parameter is valid then it needs to print a message in the format "XX min = YY y, ZZ d and EE h".

    XX represents the original value minutes.
    YY represents the calculated years.
    ZZ represents the calculated days.

    TIPS:
    Be extra careful about spaces in the printed message.
    Use the remainder operator

    NOTES:
    The printYearsAndDays method needs to be defined as public static like we have been doing so far in the course.
    The solution will not be accepted if there are extra spaces.
*/
public class Exercise10 {

    public static void main(String[] args) {
        printYearsAndDays(900_060);
    }

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Wrong input");
        }
        long tmpMinutes = minutes;

        long years = tmpMinutes / 525_600; // 525.660 is the number of minutes inside a year.
        tmpMinutes %= 525_600;

        long days = tmpMinutes / 1440;
        tmpMinutes %= 1440;

        long hours = tmpMinutes / 60;

        System.out.println(minutes + " minutes are equal to: " + years + " years, " + days + " days and " + hours + "hours.");

    }
}
