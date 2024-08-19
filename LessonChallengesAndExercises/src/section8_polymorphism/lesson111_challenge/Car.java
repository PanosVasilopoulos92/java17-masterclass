package section8_polymorphism.lesson111_challenge;

public class Car {
    private String description;

    public Car(){}

    public Car(String description) {
        this.description = description;
    }

    public void startEngine(){
        System.out.println("Engine has started.");
    }

    public void drive(){
        System.out.println("Car has started to move.");
    }

    protected void runEngine(){
        System.out.println("Run engine enabled.");
    }

    @Override
    public String toString() {
        return "Car{" +
                "description='" + description + '\'' +
                '}';
    }
}
