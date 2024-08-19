package experiments;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalExp {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,2);
        System.out.println(numbers);
        Optional<Integer> num = numbers.stream().reduce(Integer::max);
        System.out.println(num);
        num.ifPresent(System.out::println);
    }
}
