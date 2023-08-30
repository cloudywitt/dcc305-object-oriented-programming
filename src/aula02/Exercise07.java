public class Exercise07 {
    public static void main(String[] args) {
        int prevPreviousNum = 0;
        int previousNum = 1;
        int nthTerm;

        do {
            nthTerm = previousNum + prevPreviousNum;

            System.out.println(nthTerm);

            prevPreviousNum = previousNum;
            previousNum = nthTerm;
        } while (nthTerm < 100);
    }
}