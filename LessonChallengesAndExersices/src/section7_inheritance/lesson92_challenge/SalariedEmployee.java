package section7_inheritance.lesson92_challenge;

public class SalariedEmployee extends Employee{
    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(){}

    public SalariedEmployee(String name, String birthDate, String endDate, String hireDate, double annualSalary, boolean isRetired){
        super(name, birthDate, endDate, hireDate);
        this.annualSalary = annualSalary;
        this.isRetired = isRetired;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public boolean isRetired() {
        return isRetired;
    }

    public void setRetired(boolean retired) {
        isRetired = retired;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "annualSalary=" + annualSalary +
                ", isRetired=" + isRetired +
                ", employeeId=" + employeeId +
                ", hireDate='" + hireDate + '\'' +
                ", name='" + getName() + '\'' +
                ", birthDate='" + getBirthDate() + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }

    public void retire(){}

    @Override
    public double collectPay() {
        return annualSalary /26;
    }
}
