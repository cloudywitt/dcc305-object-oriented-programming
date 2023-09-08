package aula06;

public class CheckingAccount extends BankAccount{

    @Override
    public void payIn(double amount) {
        if (amount < 5.00) {
            System.out.println("You cannot make a pay in of less than 5.00");

            return;
        }

        double fee = 0.10;

        super.payIn(amount - fee);
    }

    @Override
    public void updateAccount(double percentage) {
        super.updateAccount(percentage * 2);
    }
}
