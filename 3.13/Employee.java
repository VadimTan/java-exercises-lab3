public class Employee {
    private String firstName;
    private String lastName;
    private double monthlySalary;

    public Employee(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;

        this.monthlySalary = (monthlySalary > 0.0) ? monthlySalary : 0.0;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = (monthlySalary > 0.0) ? monthlySalary : 0.0;
    }

    public double getYearlySalary() {
        return 12 * monthlySalary;
    }

    public void applyRaise() {
        monthlySalary *= 1.10;
    }
}
