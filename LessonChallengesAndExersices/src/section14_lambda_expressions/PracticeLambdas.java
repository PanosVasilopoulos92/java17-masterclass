package section14_lambda_expressions;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class PracticeLambdas {

    private static final String DASHES = "\n------------------\n";

    public static void main(String[] args) {

        BiFunction<Integer, Integer, Integer> sum = (Integer a, Integer b) -> a + b;
        System.out.println(sum.apply(10, 12));

        Predicate<String> isStrEmpty = (String str) -> str.isEmpty();
        System.out.println(isStrEmpty.test("Hi!"));

        BiPredicate<String, String> strAreEquals = (str1, str2) -> str1.equals(str2);
        System.out.println(strAreEquals.test("Panos", "Panos4"));

        BooleanSupplier booleanSupplier = () -> Math.random() > 0.1;
        System.out.println(booleanSupplier.getAsBoolean());

//        String[] strs = new String[]{"One", "Two", "Three"};
        List<String> strList = Arrays.asList("One", "Two", "Three");
//        strList.add("heu"); // will cause runtime error
        System.out.println(strList);
        strList.replaceAll(str -> str.toUpperCase());
        System.out.println(strList);
        System.out.println(DASHES);

        // Challenge 1
        List<String> parts = List.of("engine", "hood", "wheel");

        Consumer<List<String>> printParts = (part) -> System.out.println(part);
        printParts.accept(parts);
        System.out.println(DASHES);

        // Challenge 2
        String source1 = "123456789";
        String source2 = "Hello friend, my name is Panos.";
        Function<String, StringBuilder> everySecondChar = (source) -> {
            StringBuilder retVal = new StringBuilder();
            for (int i = 0; i < source.length(); i++) {
                if (i % 2 != 0) {
                    retVal.append(source.charAt(i));
                }
            }
            return retVal;
        };

//        System.out.println(everySecondChar.apply(source1));

        printEverySecondCharacter(everySecondChar, source1);
        System.out.println(getEverySecondCharacter(everySecondChar, source1));
        System.out.println(DASHES);

        // Challenge 3
        Supplier<String> iLoveJava = () -> "I love Java";
        System.out.println(iLoveJava.get());

        String supplierResult = iLoveJava.get();
        System.out.println(supplierResult);
        System.out.println(DASHES);



    }

    public static void printEverySecondCharacter(Function<String, StringBuilder> everySecondChar, String source) {
        System.out.println(everySecondChar.apply(source));
    }

    public static StringBuilder getEverySecondCharacter(Function<String, StringBuilder> func, String source) {
        return func.apply(source);
    }
}
