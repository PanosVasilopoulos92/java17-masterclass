package section8_polymorphism.lesson103_challenge;

public class SmartKitchen {
    private Refrigerator refrigerator;
    private DishWasher dishWasher;
    private CoffeeMaker coffeeMaker;

    public SmartKitchen(){}

    public SmartKitchen(Refrigerator refrigerator, DishWasher dishWasher, CoffeeMaker coffeeMaker){
        this.refrigerator = refrigerator;
        this.dishWasher = dishWasher;
        this.coffeeMaker = coffeeMaker;
    }

    public Refrigerator getRefrigerator() {
        return refrigerator;
    }

    public void setRefrigerator(Refrigerator refrigerator) {
        this.refrigerator = refrigerator;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }

    public void setDishWasher(DishWasher dishWasher) {
        this.dishWasher = dishWasher;
    }

    public CoffeeMaker getCoffeeMaker() {
        return coffeeMaker;
    }

    public void setCoffeeMaker(CoffeeMaker coffeeMaker) {
        this.coffeeMaker = coffeeMaker;
    }

    public void addWater(){
        coffeeMaker.setHasWorkToDo(true);
        System.out.println("Water was added.");
    }

    public void pourMilk(){
        refrigerator.setHasWorkToDo(true);
        System.out.println("Milk was poured.");
    }

    public void loadDishWasher(){
        dishWasher.setHasWorkToDo(true);
        System.out.println("Dishes were added.");
    }

    public void setKitchenState(boolean isRefrigeratorAvailable, boolean isDishWasherAvailable, boolean isCoffeemakerAvailable){
        refrigerator.setHasWorkToDo(isRefrigeratorAvailable);
        dishWasher.setHasWorkToDo(isDishWasherAvailable);
        coffeeMaker.setHasWorkToDo(isCoffeemakerAvailable);
    }

    public void doKitchenWork(){
        refrigerator.orderFood();
        dishWasher.doDishes();
        coffeeMaker.brewCoffee();
    }

    @Override
    public String toString() {
        return "SmartKitchen{" +
                "refrigerator=" + refrigerator +
                ", dishWasher=" + dishWasher +
                ", coffeeMaker=" + coffeeMaker +
                '}';
    }
}
