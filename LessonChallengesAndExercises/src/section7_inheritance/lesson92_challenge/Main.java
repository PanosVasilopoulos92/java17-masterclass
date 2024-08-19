package section7_inheritance.lesson92_challenge;

public class Main {

    public static void main(String[] args) {
        SalariedEmployee employee1 = new SalariedEmployee("Panos", "1992", "2024", "2023", 14_000, false);
        System.out.println(employee1);
        System.out.println(employee1.getAnnualSalary());

        HourlyEmployee employee2 = new HourlyEmployee("Efraim", "1992", "2024", "2023", 7.0);
        System.out.println(employee2);
        System.out.println(employee2.getName());

        Employee employee3 = new SalariedEmployee("Panos", "1992", "2024", "2023", 24_000, false);
        System.out.println(employee3);
        System.out.println(employee3.getAge());

        Employee employee4 = new SalariedEmployee("Panos", "1992", "2024", "2023", 44_000, false);
        System.out.println(employee4);
        System.out.println(employee4.getName());
        System.out.printf("Monthly salary: %.2f", employee4.collectPay());


    }
}
