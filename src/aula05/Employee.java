package aula05;

import java.text.NumberFormat;

public class Employee {
    private static int classId;
    private final int id;
    private String name;
    private String department;
    private double salary;
    private String entryDate;
    private String rg;

    Employee() {
        this.id = ++Employee.classId;
    }

    Employee(String name) {
        this();
        setName(name);
    }

    // Getters
    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getDepartment() {
        return this.department;
    }

    public double getSalary() {
        return this.salary;
    }

    public String getEntryDate() {
        return this.entryDate;
    }

    public String getRg() {
        return this.rg;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setEntryDate(String entryDate) {
        this.entryDate = entryDate;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    // Object methods
    public void increaseSalary(double increase) {
        double newSalary = getSalary() + increase;

        setSalary(newSalary);
    }

    public double calcAnnualIncome() {
        return getSalary() * 12;
    }

    public void showAttributes() {
        NumberFormat currency = NumberFormat.getCurrencyInstance();

        System.out.println("Name: " + getName());
        System.out.println("Department: " + getDepartment());
        System.out.println("Salary: " + currency.format(getSalary()));
        System.out.println("Entry Date: " + getEntryDate());
        System.out.println("RG: " + getEntryDate());
    }
}

