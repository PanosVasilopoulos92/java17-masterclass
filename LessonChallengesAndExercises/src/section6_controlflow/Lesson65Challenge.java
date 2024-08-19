package section6_controlflow;

public class Lesson65Challenge {

    public static void main(String[] args) {
        int start = 5;
        int end = 21;
        int totalOddNumbers = 0;
        int totalEvenNumbers = 0;

        while (start <= end) {
            if (isEven(start)) {
                System.out.println("Number " + start + " is even.");
                totalEvenNumbers++;
            } else {
                totalOddNumbers++;
            }
            start++;
        }
        System.out.println("Total odd numbers passed: " + totalOddNumbers);
        System.out.println("Total even numbers passed: " + totalEvenNumbers);
    }

    public static boolean isEven(int number) {
        boolean isEvenNumber = false;

        if (number < 0) {
            return false;
        }

        if (number % 2 == 0) {
            isEvenNumber = true;
        }

        return isEvenNumber;
    }

}
