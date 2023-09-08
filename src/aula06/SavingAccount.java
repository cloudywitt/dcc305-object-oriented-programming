package aula06;

public class SavingAccount  extends BankAccount{
    @Override
    public void updateAccount(double percentage) {
        super.updateAccount(percentage * 3);
    }
}
