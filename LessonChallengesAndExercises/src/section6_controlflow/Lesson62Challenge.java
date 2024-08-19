package section6_controlflow;

public class Lesson62Challenge {

    public static void main(String[] args) {
        printNumbers(1000);
    }

    public static void printNumbers(int maxNum) {
        int counter = 0;
        int sum = 0;

        for (int i = 1; i <= maxNum; i++) {
            if (counter > 5) {
                break;
            }

            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println(i);
                sum += i;
                counter++;
            }
        }
        System.out.println("Sum is " + sum);
    }
}
