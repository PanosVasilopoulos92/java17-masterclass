package section8_polymorphism.exercise40;

public class Main {

    public static void main(String[] args) {
        Car car1 = new Car("Fiat", 4);
        System.out.println(car1);
        car1.startEngine();
        car1.accelerate();
        car1.brake();
        System.out.println("------");

        Car car2 = new Mitsubishi("MitsubishiT20", 6);
        System.out.println(car2);
        car2.startEngine();
        System.out.println(car2.getName());
        car2.accelerate();
//        System.out.println(car2.getClass());
        System.out.println("------");

        Car car3 = new Holden("Holden rx90", 2);
        System.out.println(car2);
        car3.startEngine();
        car3.accelerate();
        car3.brake();
        System.out.println("------");

        displayCarName(car1);
        displayCarName(car2);
        displayCarName(car3);

    }

    public static void displayCarName(Car car) {
        System.out.println(car.getName());
    }
}
