package section8_polymorphism.lesson103_challenge;

public class CoffeeMaker {
    private boolean hasWorkToDo;

    public CoffeeMaker() {}

    public CoffeeMaker(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public boolean hasWorkToDo() {
        return hasWorkToDo;
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void brewCoffee(){
        if (hasWorkToDo){
            System.out.println("Brewing coffee");
        }
    }

    @Override
    public String toString() {
        return "CoffeeMaker{" +
                "hasWorkToDo=" + hasWorkToDo +
                '}';
    }

}
