package aula03.Exercise01;

public class Employee {
    String name;
    String department;
    double salary;
    String entryDate;
    String rg;

    void increaseSalary(double increase) {
        this.salary += increase;
    }
    double calcAnnualIncome() {
        return this.salary * 12;
    }
}
