package section13_nested_classes.lesson179_challenge.burger;

public class Store {

    public static void main(String[] args) {

        Meal regularMeal = new Meal();
        regularMeal.addToppings("Ketchup", "Mayo", "Bacon", "Cheddar");
        System.out.println(regularMeal);

        Meal USRegularMeal = new Meal(1.12);
        System.out.println(USRegularMeal);

    }
}
