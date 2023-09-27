package aula09;

public class TestPayIn {
    public static void main(String[] args) {
        BankAccount checkingAcc = new CheckingAccount();

        try {
            checkingAcc.payIn(-1.0);
//              IllegalArgumentException e
        } catch (InvalidAmountException e) {
//            System.out.println("You tried an invalid amount");
            System.out.println(e.getMessage());
        }

        System.out.println(checkingAcc.getBalance());
    }
}
