package section6_controlflow;

/*
 * Find the Prime numbers
 */
public class Lesson61Challenge {

    public static void main(String[] args) {

        int counter = 0;

        for (int i = 2; i <= 24; i++) {
            if (isPrime(i)) {
                System.out.println(i);
                counter++;
            }

            if (counter >= 4) {
                break;
            }
        }

    }

    public static boolean isPrime(int number) {
        boolean numIsPrime = true;

        if (number <= 1) {
            return false;
        }

//        for (int i = 1; i < number; i++) {
//            for (int j = 1; j < number; j++) {
//                if (i * j == number) {
//                    numIsPrime = false;
//                }
//            }
//        }

        // A more efficient way:
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                numIsPrime = false;
                break;
            }
        }

        return numIsPrime;
    }
}
