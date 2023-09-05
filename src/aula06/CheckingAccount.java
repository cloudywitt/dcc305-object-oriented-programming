package aula06;

public class CheckingAccount extends BankAccount{

    @Override
    public void payIn(double amount) {
        super.payIn(amount - 0.10);
    }

    @Override
    public void updateAccount(float percentage) {
        super.updateAccount(percentage * 2);
    }
}
