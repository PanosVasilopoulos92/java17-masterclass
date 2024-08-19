package section9_arrays;

import java.util.Arrays;
import java.util.Scanner;

/*
 *  Create an array and reverse its values, not sort it.
 */
public class Lesson127Challenge {

    public static void main(String[] args) {
        int[] firstArray = reverseArray(populateArray());
        System.out.println(Arrays.toString(firstArray));
    }

    private static int[] populateArray() {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Provide an integer number: ");
            array[i] = scanner.nextInt();
        }
        return array;
    }

    private static int[] reverseArray(int[] array) {
        int start = 0;
        int end = array.length - 1;

        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
        return array;
    }
}
