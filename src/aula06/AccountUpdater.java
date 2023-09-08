package aula06;

import java.text.NumberFormat;

public class AccountUpdater {
    private double totalBalance;
    private final double selic;

    public AccountUpdater(double selic) {
        this.selic = selic;
    }

    public void run(BankAccount account) {
        if (account == null) {
            System.out.println("Not a valid account");

            return;
        }

        NumberFormat formatter = NumberFormat.getCurrencyInstance();

        System.out.println("Old balance: " + formatter.format(account.getBalance()));
        account.updateAccount(this.selic);
        System.out.println("New balance: " + formatter.format(account.getBalance()));

        this.totalBalance += account.getBalance();
    }

    public double getTotalBalance() {
        return this.totalBalance;
    }
}
