package experiments;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    static List<Integer> numbers = new ArrayList<>(20);

    public static void main(String[] args) {
        System.out.println(getNumbers());

    }

    public static int getNumbers() {
        for (int i = 0; i < 11; i++) {
            numbers.add(i);
        }
        System.out.println(numbers);

        return numbers.get(1 % numbers.size());    // with this, the return value will never create a error/exception 'IndexOutOfBound'.
    }
}
