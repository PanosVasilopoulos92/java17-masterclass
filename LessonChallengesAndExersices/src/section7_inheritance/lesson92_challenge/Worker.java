package section7_inheritance.lesson92_challenge;

public class Worker {
    private String name;
    private String birthDate;
    protected String endDate;

    public Worker(){}

    public Worker (String name, String birthDate, String endDate){
        this.name = name;
        this.birthDate = birthDate;
        this.endDate = endDate;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public int getAge(){
        int currentYear = 2024;
        return currentYear - Integer.parseInt(birthDate);
    }

    public double collectPay(){
        return 0.0;
    }

    public void terminate(String endDate){
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
