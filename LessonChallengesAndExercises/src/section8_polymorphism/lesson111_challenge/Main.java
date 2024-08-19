package section8_polymorphism.lesson111_challenge;

public class Main {

    public static void main(String[] args) {
        // Practice cases:
        Car car1 = new ElectricCar("Toyota", 100.0, 400);
        System.out.println(car1);

        double electricVehicleCost = ((ElectricCar) car1).calculateCost(((ElectricCar) car1).getBatterySize());
        System.out.println(electricVehicleCost);

        Car car2 = new GasPoweredCar("Toyota", 80.4, 8);
        if (car2 instanceof GasPoweredCar gasVehicle) {
            double gasVehicleCost = gasVehicle.calculateCost(gasVehicle.getNumberOfCylinders());
            System.out.println(gasVehicleCost);
        }

    }

}
