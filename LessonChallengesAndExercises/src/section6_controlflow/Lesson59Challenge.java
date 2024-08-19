package section6_controlflow;

/*
 *  Enhanced switch expression
 */
public class Lesson59Challenge {

    public static void main(String[] args) {
        String day = printDayOfWeek(4);
        System.out.println(day);
    }

    public static String printDayOfWeek(int numberOfDay) {
        return switch (numberOfDay) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Thursday";
            case 4 -> "Wednesday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            case 8, 9, 10 -> {
                String msg = "Test multiple cases";
                yield msg;
            }
            default -> "Invalid input";
        };

    }

}
