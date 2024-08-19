package section9_arrays;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise41 {

    public static void main(String[] args) {
        int[] firstArray = new int[5];

        System.out.println("Provide 5 numbers and we will sort them for you.");
        for (int i = 0; i < 5; i++) {
            firstArray[i] = getUserInput();
        }

        Arrays.sort(firstArray);
        System.out.println("Numbers in ascending order: " + Arrays.toString(firstArray));
    }

    public static int getUserInput() {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Provide number: ");
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Only integer values are accepted.");
            return getUserInput();
        }
    }
}
