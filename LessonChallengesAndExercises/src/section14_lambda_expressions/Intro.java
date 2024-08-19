package section14_lambda_expressions;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Intro {

    record Person(String firstName, String lastName) {
    }

    interface EnhancedComparator<T> extends Comparator<T> {
        int secondLevel(T o1, T o2);
    }

    public static void main(String[] args) {

        List<Person> persons = new ArrayList<>(Arrays.asList(
                new Intro.Person("Panos", "Vasilopoulos"),
                new Person("Angeliki", "Vasilopoulou"),
                new Person("Efraim", "Vasilopoulos")
        ));

        // Using anonymous class.
        var comparatorLastName = new Comparator<Person>() {

            @Override
            public int compare(Person o1, Person o2) {
                return o1.firstName.compareTo(o2.firstName);
            }
        };

        // Using anonymous class.
        persons.sort(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.firstName.compareTo(o2.firstName);
            }
        });

        System.out.println(persons);

        // with lambda expression:
        persons.sort((o1, o2) -> o1.firstName.compareTo(o2.firstName));

        System.out.println(persons);
    }
}
