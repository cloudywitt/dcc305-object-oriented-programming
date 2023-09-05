package aula06;

public class SavingAccount  extends BankAccount{
    @Override
    public void updateAccount(float percentage) {
        super.updateAccount(percentage * 3);
    }
}
