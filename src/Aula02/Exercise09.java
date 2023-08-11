import java.util.Scanner;

public class Exercise09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of rows you want for the table: ");
        int rowNumber = input.nextInt();

        for (int i = 1; i <= rowNumber; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i * j + " ");
            }

            System.out.println();
        }
    }
}
