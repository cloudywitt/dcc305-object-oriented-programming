public class Exercise06 {
    public static void main(String[] args) {
        long factorial = 1;

        for (int n = 1; n <= 20; n++) {
            factorial *= n;

            System.out.println("!" + n + " = " + factorial);
        }
    }
}
