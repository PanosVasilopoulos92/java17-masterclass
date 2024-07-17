package section8_polymorphism.lesson111_challenge;

public class GasPoweredCar extends Car {
    private double rangePerLitreOfFuel;
    private int numberOfCylinders;

    public GasPoweredCar(String description, double rangePerLitreOfFuel, int numberOfCylinders) {
        super(description);
        this.rangePerLitreOfFuel = rangePerLitreOfFuel;
        this.numberOfCylinders = numberOfCylinders;
    }

    public double getRangePerLitreOfFuel() {
        return rangePerLitreOfFuel;
    }

    public int getNumberOfCylinders() {
        return numberOfCylinders;
    }

    public double calculateCost(int numberOfCylinders) {
        return numberOfCylinders * 1000; // Totally hypothetically cost calculation.
    }

    @Override
    public void startEngine() {
        super.startEngine();
        System.out.println("Gas has started to be consumed.");
    }

    @Override
    public String toString() {
        return "GasPoweredCar{" +
                "rangePerLitreOfFuel=" + rangePerLitreOfFuel +
                ", numberOfCylinders=" + numberOfCylinders +
                '}' + super.toString();
    }
}
