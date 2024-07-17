package section5;

/*
    "Playing Cat":
    The cats spend most of the day playing. In particular, they play if the temperature is between 25 and 35 (inclusive). Unless it is summer,
    then the upper limit is 45 (inclusive) instead of 35.
    Write a method isCatPlaying that has 2 parameters. Method needs to return true if the cat is playing, otherwise return false
    1st parameter should be of type boolean and be named summer it represents if it is summer.
    2nd parameter represents the temperature and is of type int with the name temperature.
    NOTES
    The isCatPlaying method needs to be defined as public static ​like we have been doing so far in the course.
*/
public class Exercise12 {

    public static void main(String[] args) {

        boolean isCatPlaying = isCatPlaying(true, 12);
        System.out.println(isCatPlaying);

    }

    public static boolean isCatPlaying(boolean isSummer, int temperature) {
        int maxTemp = 35;
        int minTemp = 25;
        boolean isCatPlaying = false;

        if (isSummer) {
            maxTemp = 45;
        }

        if (isSummer && (temperature <= maxTemp && temperature >= minTemp)) {
            isCatPlaying = true;
        } else if(!isSummer && (temperature <= maxTemp && temperature >= minTemp)){
            isCatPlaying = true;
        }

        return isCatPlaying;
    }
}
