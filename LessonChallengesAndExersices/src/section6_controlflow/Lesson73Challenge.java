package section6_controlflow;

/*
* Reading user Input and use try-catch statement
* */

import java.util.Scanner;

public class Lesson73Challenge {
    public static void main(String[] args) {
        int sum = 0;

        do {
            try {
                sum = getUserInputAndCalculateSum();
                break;
            } catch (NumberFormatException e) {
                System.out.println("Please provide only integer values. Start again:");
            }
        } while (true);

        System.out.println("Sum = " + sum);
    }

    public static int getUserInputAndCalculateSum() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number #1: ");
        int num1 = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter number #2: ");
        int num2 = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter number #3: ");
        int num3 = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter number #4: ");
        int num4 = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter number #5: ");
        int num5 = Integer.parseInt(scanner.nextLine());
        System.out.println();

        return num1 + num2 + num3 + num4 + num5;

    }

//    public static boolean isValidInput(int input){
//        if input
//    }

//    public static int calculateSum(int num1, int num2, int num3) {
//        getUserInput();
//        return num1 + num2 + num3;
//    }
}
