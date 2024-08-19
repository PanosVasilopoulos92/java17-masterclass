package section17_streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class StreamsMain {

    public static void main(String[] args) {
        Stream<Integer> randomNumbers = Stream.generate(() -> new Random().nextInt(10)).limit(10);
        randomNumbers.forEach(System.out::println);

        Integer randomNum = new Random().nextInt(100);
//        boolean isInteger = randomNum instanceof Integer ? true : false;
//        System.out.println(isInteger);
        System.out.println(randomNum);
        System.out.println("-".repeat(12));

        List<String> names = Arrays.asList("Panos", "Efraim", "Maria");
//        List<String> namesListOf = List.of("Panos", "Efraim", "Maria");
        List<String> namesModified = new ArrayList<>(names);
        namesModified.removeIf(letter -> letter.startsWith("P"));
        System.out.println(namesModified);
        System.out.println("-".repeat(12));

        List<String> namesToUpperCase = names.stream().map(String::toUpperCase).toList();
//        System.out.println(namesToUpperCase);
        System.out.println(names);
        namesToUpperCase.forEach(System.out::println);
    }
}
