package aula09;

//                                         RuntimeException
public class InvalidAmountException extends Exception {
    InvalidAmountException(double amount) {
        super("Invalid amount: " + amount);
    }
}
