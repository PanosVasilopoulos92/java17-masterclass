package section5;

public class Exercise4 {
    /*
    "Barking Dog":
    We have a dog that likes to bark.  We need to wake up if the dog is barking at night!
    Write a method shouldWakeUp that has 2 parameters.

    1st parameter should be of type boolean and be named barking it represents if our dog is currently barking.
    2nd parameter represents the hour of the day and is of type int with the name hourOfDay and has a valid range of 0-23.
    We have to wake up if the dog is barking before 8 or after 22 hours so in that case return true.
    In all other cases return false.
    If the hourOfDay parameter is less than 0 or greater than 23 return false.
    TIP: Use the if else statement with multiple conditions.
    NOTE: The shouldWakeUp method  needs to be defined as public static like we have been doing so far in the course.
    NOTE: Do not add a  main method to solution code.
    */

    public static void main(String[] args) {
        boolean mustWakeUp = shouldWakeUp(true, 9);
        System.out.println(mustWakeUp);
    }

    public static boolean shouldWakeUp(boolean isBarking, int hourOfDay) {
        boolean mustWakeUp = false;

        if (hourOfDay < 0 || hourOfDay > 23) {
            return false;
        }

        if ((hourOfDay > 8 && hourOfDay < 22) && isBarking) {
            mustWakeUp = true;
        }

        return mustWakeUp;
    }
}
