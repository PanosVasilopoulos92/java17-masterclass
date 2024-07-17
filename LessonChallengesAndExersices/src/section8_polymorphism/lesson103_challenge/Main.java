package section8_polymorphism.lesson103_challenge;

public class Main {

    public static void main(String[] args) {
        Refrigerator refrigerator = new Refrigerator(false);
        DishWasher dishWasher = new DishWasher(false);
        CoffeeMaker coffeeMaker = new CoffeeMaker(false);
        SmartKitchen smartKitchen = new SmartKitchen(refrigerator, dishWasher, coffeeMaker);

        smartKitchen.addWater();

        System.out.println(smartKitchen.getRefrigerator().hasWorkToDo());

        smartKitchen.pourMilk();
        System.out.println(smartKitchen.getRefrigerator().hasWorkToDo());

//        smartKitchen.getCoffeeMaker().setHasWorkToDo(false);
        System.out.println(coffeeMaker.hasWorkToDo());
        System.out.println("-----");

        // Change the state of the appliances without directly access them:
        smartKitchen.setKitchenState(true, true, false);
        System.out.println(smartKitchen);
        smartKitchen.doKitchenWork();
        System.out.println("-----");

        smartKitchen.setKitchenState(true, true, true);
        smartKitchen.doKitchenWork();

    }
}
