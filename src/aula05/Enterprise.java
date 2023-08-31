package aula05;

public class Enterprise {
    private String name;
    private String cnpj;
    private Employee[] employees;

    // Getters
    public String getName() {
        return this.name;
    }
    public String getCnpj() {
        return this.cnpj;
    }

    public void getEmployees() {
        for (int i = 0; i < this.employees.length; i++) {
            if (this.employees[i] != null) {
                System.out.println("Employee " + (i + 1));
                this.employees[i].showAttributes();
                System.out.println("--------------------");
            }
        }
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }


    public void setEmployee(Employee emp) {
        for (int i = 0; i < this.employees.length; i++) {
            if (this.employees[i] == null) {
                this.employees[i] = emp;

                break;
            }
        }
    }

    public boolean checkEmployeeExistence(String name) {
        for (Employee employee : this.employees) {
            if (employee.getName() != null && employee.getName().equals(name)) {
                return true;
            }
        }

        return false;
    }
}
