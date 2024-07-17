package section6_controlflow;

import java.util.Scanner;

public class Lesson74Challenge {

    public static void main(String[] args) {
        int minNumber = Integer.MAX_VALUE;
        int maxNumber = Integer.MIN_VALUE;
        int userInput = 0;

        while(true) {
            userInput = getNumberFromUser();

            if (userInput == -1){
                break;
            }

            if (userInput < minNumber) {
                minNumber = userInput;
            } else if (userInput > maxNumber) {
                maxNumber = userInput;
            }
        }

        System.out.println("Max number that was provided was " + maxNumber);
        System.out.println("Min number that was provided was " + minNumber);
    }

    public static int getNumberFromUser() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please provide a number or any character for exit program.");
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            return -1;
        }
    }
}
