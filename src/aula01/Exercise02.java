package aula01;

import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final float PI = 3.14159F;

        System.out.println("Enter the radius:");
        float radius = input.nextFloat();

        float circleArea = PI * radius * radius;

        System.out.println("The area is " + circleArea);
    }
}
