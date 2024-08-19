package section8_polymorphism.exercise40;

public class Holden extends Car{

    public Holden(String name, int cylinders){
        super(name, cylinders);
    }

    @Override
    protected void startEngine() {
        System.out.printf("%s has started.\n", getClass().getSimpleName());
    }


    @Override
    protected void accelerate() {
        System.out.printf("%s is accelerating.\n", getClass().getSimpleName());
    }


    @Override
    protected void brake() {
        System.out.printf("%s hits the brakes.\n", getClass().getSimpleName());
    }

}
