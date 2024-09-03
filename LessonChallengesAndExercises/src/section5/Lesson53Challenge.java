package section5;

public class Lesson53Challenge {

    public static void main(String[] args) {
        System.out.println(getDurationString(-14_000));
        System.out.println(getDurationString(201, 52));
    }

    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return "Cannot accept negative values";
        }

        int hours = seconds / 3600;
        seconds %= 3600;

        int minutes = seconds / 60;
        seconds %= 60;

        return ("The duration is: " + hours + "h " + minutes + "m " + seconds + "s");
    }

    public static String getDurationString(int minutes, int seconds) {
        if (minutes < 0 || seconds < 0) {
            return "Cannot accept negative values";
        }
        int totalSeconds = (minutes * 60) + seconds;
        return getDurationString(totalSeconds);
    }

}
