package section14_lambda_expressions.lesson189_challenge;

import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {

        // anonymous function
        Consumer<String> printTheParts = new Consumer<String>() {
            @Override
            public void accept(String s) {
                String[] parts = s.split(" ");
                for (String part : parts) {
                    System.out.println(part);
                }
            }
        };

        // Lambda expression
        Consumer<String> printWordsLambda = s -> {
            String[] parts = s.split(" ");
            for (String part : parts) {
                System.out.println(part);
            }
        };

        printTheParts.accept(" Let's split this into an array");
        printWordsLambda.accept(" Let's split this into an array");


    }
}
