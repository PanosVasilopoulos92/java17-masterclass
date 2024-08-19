package section7_inheritance.lesson92_challenge;

public class Employee extends Worker {
    protected long employeeId;
    protected String hireDate;

    private static int employeeNo = 1;

    public Employee(){}

    public Employee(String name, String birthDate, String endDate, String hireDate) {
        super(name, birthDate, endDate);
        this.employeeId = Employee.employeeNo++;
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", hireDate='" + hireDate + '\'' +
                ", endDate='" + endDate + '\'' +
                "} " + super.toString();
    }
}
