package aula03.Exercise06;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();

        employee.name = "Bento";
        employee.department = "HR";
        employee.salary = 3300.00;
        employee.rg = "17.418.621-6";

        employee.entryDate = new Date();

        employee.entryDate.day = 5;
        employee.entryDate.month = 12;
        employee.entryDate.year = 2021;

        employee.showAttributes();
    }
}
