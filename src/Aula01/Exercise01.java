package Aula01;

import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first grade:");
        float firstGrade = input.nextFloat();

        System.out.println("Enter the second grade:");
        float secondGrade = input.nextFloat();

        float mean = (firstGrade + secondGrade) / 2;

        System.out.println("The mean is " + mean);
    }
}
