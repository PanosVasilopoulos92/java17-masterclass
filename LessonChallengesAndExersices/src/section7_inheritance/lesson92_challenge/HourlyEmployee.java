package section7_inheritance.lesson92_challenge;

public class HourlyEmployee extends Employee{
    private double hourlyPayRate;

    public HourlyEmployee(){}

    public HourlyEmployee(String name, String birthDate, String endDate, String hireDate, double hourlyPayRate){
        super(name, birthDate, endDate,  hireDate);
        this.hourlyPayRate = hourlyPayRate;
    }

    public double getHourlyPayRate() {
        return hourlyPayRate;
    }

    public void setHourlyPayRate(double hourlyPayRate) {
        this.hourlyPayRate = hourlyPayRate;
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "hourlyPayRate=" + hourlyPayRate +
                ", employeeId=" + employeeId +
                ", hireDate='" + hireDate + '\'' +
                ", name='" + getName() + '\'' +
                ", birthDate='" + getBirthDate() + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
