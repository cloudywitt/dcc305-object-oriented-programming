package Aula01;

import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the weight:");
        float weight = input.nextFloat();

        System.out.println("Enter the height:");
        float height = input.nextFloat();

        float imc = weight / (height * height);

        System.out.println("The IMC is " + imc);
    }
}