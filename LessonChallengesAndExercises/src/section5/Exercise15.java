package section5;

/*
    "Sum Odd":
    Write a method called isOdd with an int parameter and call it number. The method needs to return a boolean.
    Check that number is > 0, if it is not return false.
    If number is odd return true, otherwise return false.
    Write a second method called sumOdd that has 2 int parameters start and end, which represent a range of numbers.
    The method should use a for loop to sum all odd numbers in that range including the end and return the sum.
    It should call the method isOdd to check if each number is odd.
    The parameter end needs to be greater than or equal to start and both start and end parameters have to be greater than 0.
    If those conditions are not satisfied return -1 from the method to indicate invalid input.
    *
    TIP: use the remainder operator to check if the number is odd
    NOTE: Both methods needs to be defined as public static like we have been doing so far in the course.
*/
public class Exercise15 {

    public static void main(String[] args) {
        int sum =  sumOdd(10, 100);
        System.out.println("Sum of odd numbers is: "+sum);
    }

    public static boolean isOdd(int number) {
        boolean isOddNumber = false;

        if (number < 0) {
            return false;
        }

        if (number % 2 != 0) {
            isOddNumber = true;
        }

        return isOddNumber;
    }

    public static int sumOdd(int start, int end) {
        int sum = 0;

        if (start < 0) {
            return -1;
        }

        for (int i = start; i<=end; i++){
            if (isOdd(i)){
                System.out.println(i);
                sum += i;
            }
        }

        return sum;
    }

}
