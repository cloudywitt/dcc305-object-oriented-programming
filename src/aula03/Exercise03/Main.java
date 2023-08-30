package aula03.Exercise03;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();

        employee.name = "Kob";
        employee.salary = 4300;
        employee.department = "IT";
        employee.rg = "32.474.128-5";
        employee.entryDate = "02/03/2020";

        employee.showAttributes();
    }
}
