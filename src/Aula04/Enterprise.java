public class Enterprise {
    String name;
    String cnpj;
    Employee[] employees;

    void addEmployee(Employee emp) {
        for (int i = 0; i < this.employees.length; i++) {
            if (this.employees[i] == null) {
                this.employees[i] = emp;

                break;
            }
        }
    }

    void showEmployees() {
        for (int i = 0; i < this.employees.length; i++) {
            if (this.employees[i] != null) {
                System.out.println("Employee " + (i + 1));
                this.employees[i].showAttributes();
                System.out.println("--------------------");
            }
        }
    }

    boolean checkEmployeeExistence(String name) {
        for (Employee employee : this.employees) {
            if (employee.name != null && employee.name.equals(name)) {
                return true;
            }
        }

        return false;
    }
}
