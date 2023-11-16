public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee("John", "Doe", 5000.0);
        Employee employee2 = new Employee("Jane", "Smith", 6000.0);

        System.out.println("Employee 1 Yearly Salary: $" + employee1.getYearlySalary());
        System.out.println("Employee 2 Yearly Salary: $" + employee2.getYearlySalary());

        employee1.applyRaise();
        employee2.applyRaise();

        System.out.println("\nAfter 10% Raise:");
        System.out.println("Employee 1 Yearly Salary: $" + employee1.getYearlySalary());
        System.out.println("Employee 2 Yearly Salary: $" + employee2.getYearlySalary());
    }
}
