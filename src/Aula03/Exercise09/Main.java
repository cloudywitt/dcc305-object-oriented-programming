package Aula03.Exercise09;

public class Main {
    public static void main(String[] args) {
        Date exerciseCompletionDate = new Date();

        exerciseCompletionDate.day = 18;
        exerciseCompletionDate.month = 8;
        exerciseCompletionDate.year = 2023;

        System.out.println(exerciseCompletionDate.getDate());
    }
}
