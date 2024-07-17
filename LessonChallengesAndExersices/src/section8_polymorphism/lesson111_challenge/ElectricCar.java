package section8_polymorphism.lesson111_challenge;

public class ElectricCar extends Car {
    private double rangePerKW;
    private int batterySize;

    public ElectricCar(String description, double rangePerKW, int batterySize) {
        super(description);
        this.rangePerKW = rangePerKW;
        this.batterySize = batterySize;
    }

    public double getRangePerKW() {
        return rangePerKW;
    }

    public int getBatterySize() {
        return batterySize;
    }

    public double calculateCost(int batterySize) {
        return batterySize * 100.0; // Totally hypothetically cost calculation.
    }

    @Override
    public void startEngine() {
        super.startEngine();
        System.out.println("Electricity level has started to decrease.");
    }

    @Override
    public String toString() {
        return "ElectricCar{" +
                "rangePerLitreOfFuel=" + rangePerKW +
                ", batterySize=" + batterySize +
                '}' + super.toString();
    }
}
