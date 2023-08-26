public class TestEnterprise {
    public static void main(String[] args) {
        Enterprise enterprise = new Enterprise();
        enterprise.employees = new Employee[5];

        for (int i = 0; i < 5; i++) {
            Employee emp = new Employee();

            emp.salary = (1800.0 + 200.0 * i);

            enterprise.addEmployee(emp);
        }

        enterprise.employees[3].name = "Nikolai";
        enterprise.showEmployees();

        System.out.println("Is Nikolai in? Answer: " + enterprise.checkEmployeeExistence("Nikolai"));
        System.out.println("Is Gabriela in? Answer: " + enterprise.checkEmployeeExistence("Gabriela"));
    }
}