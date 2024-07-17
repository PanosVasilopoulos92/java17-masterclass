package section7_inheritance.lesson82_challenge;

public class Customer {
    private String name;
    private double creditLimit;
    private String email;

    public Customer() {
        this("Panos", "panos@gmail.com");  // Constructors chaining
        System.out.println("Default constructor was called.");
    }

    public Customer(String name, double creditLimit, String email) {
        System.out.println("Overloaded constructor was called");
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public Customer(String name, String email){
        this(12_000);
        this.name = name;
        this.email = email;
    }

    public Customer(double creditLimit){
        this.creditLimit =creditLimit;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString(){
        return "Customer" +
                "name='" + name + '\'' +
                ", creditLimit=" + creditLimit +
                ", email='" + email + '\'';
    }

    public void printState(){
        System.out.println("Customer" +
                "name='" + name + '\'' +
                ", creditLimit=" + creditLimit +
                ", email='" + email + '\'');
    }
}
