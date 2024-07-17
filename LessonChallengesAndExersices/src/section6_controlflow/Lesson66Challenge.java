package section6_controlflow;

public class Lesson66Challenge {

    public static void main(String[] args) {
        int sumOfDigits = sumDigits(12334);
        System.out.println(sumOfDigits);
    }

    public static int sumDigits(int number) {
        int totalDigitsInNumber = 0;
        int sumOfDigits = 0;

        if (number < 0) {
            return -1;
        }

        while (number % 10 != 0) {
            sumOfDigits += number % 10;
            number /= 10;
            totalDigitsInNumber++;
        }

        System.out.println("Total digits in number: " + totalDigitsInNumber);
        return sumOfDigits;
    }
}
