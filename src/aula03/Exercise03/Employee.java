package aula03.Exercise03;

import java.text.NumberFormat;

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
    void showAttributes() {
        NumberFormat currency = NumberFormat.getCurrencyInstance();

        System.out.println("Name: " + this.name);
        System.out.println("Department: " + this.department);
        System.out.println("Salary: " + currency.format(this.salary));
        System.out.println("Entry Date: " + this.entryDate);
        System.out.println("RG: " + this.rg);
    }
}
