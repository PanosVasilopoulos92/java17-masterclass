package section14_lambda_expressions.lesson190_challenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class Main {

    public static void main(String[] args) {
        String[] namesArr = {"Pan,os", "E,fra,im", "M,aria", "Ange,liki"};
        System.out.println(Arrays.toString(namesArr));
        List<String> names = new ArrayList<>(List.of(namesArr));
        names.add("Jim");
        names.add("Anna");
        System.out.println(names);

        UnaryOperator<String> transformNames = name -> name.toUpperCase();
        Arrays.setAll(namesArr, i -> transformNames.apply(namesArr[i]));
        System.out.println(Arrays.toString(namesArr));

//        UnaryOperator<String> addPeriodsToNames = str -> str.concat(".");
        UnaryOperator<String> removeCommas = str -> str.replace(",", "");
//        names.replaceAll(addPeriodsToNames);
        names.replaceAll(removeCommas);
        System.out.println(names);

        UnaryOperator<String> addLastname = name -> {
            String lastName = new StringBuilder(name).reverse().toString();
            return name.concat(" " + lastName);
        };
        names.replaceAll(addLastname);
        System.out.println(names);
        System.out.println("----------------");

        UnaryOperator<String> generateRandomMiddleInitial = name -> name.concat(generateRandomLetter());
        names.replaceAll(generateRandomMiddleInitial);
        names.forEach(s -> System.out.println(s));

    }

    public static String generateRandomLetter() {
        int randomInt = (int) (Math.random() * 26);
        char randomLetter = (char) ('A' + randomInt);
        return " " + randomLetter + ". ";
    }
}
