import java.util.Scanner;

public class Exercise08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int x = input.nextInt();

        while (x > 1) {
            System.out.print(x + " -> ");

            boolean isEven = x % 2 == 0;
            x = isEven ? x / 2: 3 * x + 1;
        }

        System.out.println("1");
    }
}
