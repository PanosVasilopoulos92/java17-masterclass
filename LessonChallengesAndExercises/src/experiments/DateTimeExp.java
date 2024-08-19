package experiments;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeExp {

    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);
        String msg = "Format date and time";
        System.out.printf("%1$s: %2$tD %2$tT", msg, dateTime); // explicit indexing
        System.out.println();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String dateTimeString = dateTime.format(formatter);
        System.out.println(dateTimeString);
        System.out.println();

        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss z");
        System.out.println(zonedDateTime.format(formatter2));
    }
}
