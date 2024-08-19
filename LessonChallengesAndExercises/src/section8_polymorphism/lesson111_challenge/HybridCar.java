package section8_polymorphism.lesson111_challenge;

public class HybridCar extends Car {
    private double rangePerLitreOfFuel;
    private int numberOfCylinders;
    private int batterySize;

    public HybridCar(String description, double rangePerLitreOfFuel, int numberOfCylinders, int batterySize) {
        super(description);
        this.rangePerLitreOfFuel = rangePerLitreOfFuel;
        this.numberOfCylinders = numberOfCylinders;
        this.batterySize = batterySize;
    }

    public double getRangePerLitreOfFuel() {
        return rangePerLitreOfFuel;
    }

    public int getNumberOfCylinders() {
        return numberOfCylinders;
    }

    public int getBatterySize() {
        return batterySize;
    }

    public double calculateCost(int batterySize, int numberOfCylinders) {
        return batterySize * 100 + numberOfCylinders * 1000; // Totally hypothetically cost calculation.
    }

    @Override
    public void startEngine() {
        super.startEngine();
        System.out.println("Electrical motor will be used first.");
    }

    @Override
    public String toString() {
        return "HybridCar{" +
                "rangePerLitreOfFuel=" + rangePerLitreOfFuel +
                ", numberOfCylinders=" + numberOfCylinders +
                ", batterySize=" + batterySize +
                '}' + super.toString();
    }
}
