package section9_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Lesson126Challenge {

    public static void main(String[] args) {
        int[] providedNumbers = new int[5];

        for (int i = 0; i < providedNumbers.length; i++) {
            providedNumbers[i] = getUserInput("Provide any number: ");
        }
        System.out.println(Arrays.toString(providedNumbers));

        int minValueInArray = findMin(providedNumbers);
        System.out.println(minValueInArray);
    }

    public static int getUserInput(String prompt) {
        System.out.print(prompt);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static int findMin(int[] arr) {
        int min = Integer.MAX_VALUE;

        for (int el : arr) {
            if (el < min) {
                min = el;
            }
        }
        return min;
    }
}
