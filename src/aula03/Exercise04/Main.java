package aula03.Exercise04;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.name = "Rose";
        employee1.entryDate = "13/02/2023";
        employee1.salary = 3200;

        Employee employee2 = new Employee();
        employee2.name = "Rose";
        employee2.entryDate = "13/02/2023";
        employee2.salary = 3200;

        if (employee1 == employee2) {
            System.out.println("They're equal.");
        } else {
            System.out.println("They're different.");
        }
    }
}
