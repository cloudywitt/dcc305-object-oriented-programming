package aula09;

public class CheckingAccount extends BankAccount {
    @Override
    public void payIn(double amount) {
        double fee = 0.10;

        super.payIn(amount - fee);
    }

    public void updateAccount(double percentage) {
        if (percentage < 0) {
            System.out.println("Can not update less than 0%");

            return;
        }

        this.balance = this.balance + (this.balance * (percentage / 100) * 2);
    }
}
