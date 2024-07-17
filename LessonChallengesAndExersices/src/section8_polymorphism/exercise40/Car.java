package section8_polymorphism.exercise40;

public class Car {
    private String name;
    private int cylinders;
    private int wheels;
    private boolean engine;

    public Car() {
    }

    public Car(String name, int cylinders) {
        this.engine = true;
        this.wheels = 4;
        this.name = name;
        this.cylinders = cylinders;
    }

    protected void startEngine() {
        System.out.printf("%s has started.\n", getClass().getSimpleName());
    }

    protected void accelerate() {
        System.out.printf("%s is accelerating.\n", getClass().getSimpleName());
    }

    protected void brake() {
        System.out.printf("%s hits the brakes.\n", getClass().getSimpleName());
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", cylinders=" + cylinders +
                ", wheels=" + wheels +
                ", engine=" + engine +
                '}';
    }
}
