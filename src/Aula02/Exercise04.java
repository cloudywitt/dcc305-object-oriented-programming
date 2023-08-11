public class Exercise04 {
    public static void main(String[] args) {
        for (int n = 1; n <= 10; n++) {
            int factorial = 1;

            // Calculate factorial of n
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }

            System.out.println("!" + n + " = " + factorial);
        }
    }
}
