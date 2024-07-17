package section9_arrays;

import java.util.Arrays;
import java.util.Random;

public class Lesson122Challenge {

    public static void main(String[] args) {
        int[] firstArray = populateArray(12);
        System.out.println(Arrays.toString(firstArray));
        firstArray[11] = 8;
        System.out.println(Arrays.toString(firstArray));

        if (Arrays.binarySearch(firstArray, 8) <= 0) {
            System.out.println("8 exist in the array");
        } else {
            System.out.println("8 does not exist in the array");
        }

        System.out.println("--------\n");

        int[] secondArray = sortInDescendingOrder(firstArray);
        System.out.println(Arrays.toString(secondArray));
        System.out.println(Arrays.toString(firstArray)); // By using the method 'sortInDescendingOrder' the underlying array (firstArray) has been changed.
        System.out.println("--------\n");

        int[] thirdArray = Arrays.copyOf(firstArray, 14);
        System.out.println(Arrays.toString(thirdArray));

//        Arrays.fill(thirdArray, 8);
//        System.out.println(Arrays.toString(thirdArray));


    }

    public static int[] populateArray(int length) {
        Random random = new Random();

        int[] array = new int[length];

        for (int i = 0; i < length; i++) {
            array[i] = random.nextInt(101);
        }

        return array;
    }

    public static int[] sortInDescendingOrder(int[] arr) {
        int indexDescending = arr.length - 1;
        int[] descendingOrderArray = new int[arr.length];

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            descendingOrderArray[i] = arr[indexDescending];
            indexDescending--;
        }

        return descendingOrderArray;
    }
}
