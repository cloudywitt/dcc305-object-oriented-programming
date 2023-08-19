package Aula03.Exercise07;

public class TestEmployee {
    public static void main(String[] args) {
        Employee emp = new Employee();
        Date empEntryDate = new Date();

        empEntryDate.day = 21;
        empEntryDate.month = 4;
        empEntryDate.year = 2019;

        emp.entryDate = empEntryDate;
        emp.showAttributes();
    }
}
