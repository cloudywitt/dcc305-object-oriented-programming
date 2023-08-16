package Aula03.Exercise02;

public class TestEmployee {
    public static void main(String[] args) {
        Employee employee = new Employee();

        employee.name = "James G.";
        employee.salary = 800;
        employee.increaseSalary(200);

        System.out.println("Salary: " + employee.salary);
        System.out.println("Annual income: " + employee.calcAnnualIncome());
    }
}
