package section14_lambda_expressions.lesson193_challenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class Main {

    static Random random = new Random();

    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Panos", "Angeliki", "Efraim", "Maria"));
        Function<String, String> toUpperCase = String::toUpperCase;
        Function<String, String> toLowerCase = s -> s.toLowerCase();
        BinaryOperator<String> concatStr = (s1, s2) -> s1.concat(s2);

        List<Function<String, String>> functions = new ArrayList<>(List.of(toUpperCase, toLowerCase, s -> "" + s.startsWith("P")));

        System.out.println(names);

        names.replaceAll(name -> nameToUpperCase(functions.get(0), name));
        System.out.println(names);

//        names.replaceAll(name -> toLowerCase.apply(name));
        names.replaceAll(toLowerCase::apply);
        System.out.println(names);

        names.replaceAll(name -> functions.get(0).apply(name));
        System.out.println(names);
        String dashes = "-".repeat(12);
        System.out.println(dashes);

        List<String> namesTransformed = transformValues(functions, names);
        System.out.println(namesTransformed);

        String lastName = "Vasilopoulos";
        System.out.println((String) lastName.transform(String::toUpperCase));
        System.out.println(lastName.charAt(0) + lastName.substring(1).transform(toLowerCase));
        System.out.println(dashes);

//        System.out.println(lastName + " " + getRandomCharacter('A', 'Z'));
        String randomLetter = getRandomCharacter('A', 'Z');
        String fullName = concatStr.apply(lastName + " ", randomLetter + ".");
        System.out.println(fullName);
        System.out.println(dashes);

        int age = 32;

        System.out.printf("My age is %d. %.2f", age, 442.9361);
        
    }

    public static String nameToUpperCase (Function<String, String> func, String name){
        return func.apply(name);
    }

    public static List<String> transformValues(List<Function<String, String>> functions, List<String> names){
        List<String> namesTransformed = new ArrayList<>(10);

//        names.replaceAll(name -> functions.get(0).apply(name));
        names.replaceAll(functions.get(0)::apply);

        names.removeIf(name -> name.startsWith("P"));
        namesTransformed.addAll(names);
        return namesTransformed;
    }

    public static String getRandomCharacter(char startChar, char endChar){
        char letter = (char) random.nextInt((int) startChar, (int) endChar);
        return letter + "";
    }

}
