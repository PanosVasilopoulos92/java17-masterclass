public class SecondClass {

    public static void main(String[] args) {
        boolean isAlien = false;

        if (!isAlien){
            System.out.println("It is not an alien");
        } else {
            System.out.println("It is an alien");
        }

        int topScore = 100;
        if (topScore != 10){
            System.out.println("You won!!");
        }

        // Ternary operator - Conditional operator:
        String car = "Opel";
        boolean isOpel;
//        boolean isNotOpel = true;

        isOpel = (car == "Opel") ? true : false;
        System.out.println(isOpel);
        System.out.println(car != "Opel" ? "it is Opel" : "it is not Opel");
//        System.out.println(car == "Opel" ? isOpel : isNotOpel);

        boolean isSuzuki = (car == "Suzuki");
        System.out.println(isSuzuki);
    }
}
