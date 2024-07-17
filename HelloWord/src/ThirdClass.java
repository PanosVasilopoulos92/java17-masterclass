public class ThirdClass {

    public static void main(String[] args) {
        double myDouble1 = 20.00;
        double myDouble2 = 80.00;
        double result = (myDouble1 + myDouble2) * 100.00;
        double remainder = result % 39.00;
        boolean isZero = (remainder == 0) ? true : false;

        System.out.println("Remainder = " + remainder);

        if (!isZero){
            System.out.println("Remainder is not zero.");
        } else {
            System.out.println("Remainder is zero.");
        }

    }
}
