package section6_controlflow;

/*
    "Number Palindrome":
    Write a method called isPalindrome with one int parameter called number.
    The method needs to return a boolean.
    It should return true if the number is a palindrome number otherwise it should return false.

    NOTE: The method isPalindrome needs to be defined as public static like we have been doing
* */
public class Exercise16 {

    public static void main(String[] args) {
        System.out.println(isPalindrome(1221));
    }

    public static boolean isPalindrome(int number) {
        int reversedNum = 0;
        int tmpNumber = number;

        while (tmpNumber > 0) {
            int digit = tmpNumber % 10;
            tmpNumber /= 10;

            reversedNum *= 10;
            reversedNum += digit;
        }

        return number == reversedNum;

    }
}
