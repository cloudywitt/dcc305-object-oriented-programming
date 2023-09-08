package aula06;

import java.text.NumberFormat;

public class Main {
    public static void main(String[] args) {
        NumberFormat formatter = NumberFormat.getCurrencyInstance();

        BankAccount acc = new BankAccount();
        CheckingAccount checkingAcc = new CheckingAccount();
        SavingAccount savingAcc = new SavingAccount();

        double payInAmount = 1000.00;

        acc.payIn(payInAmount);
        checkingAcc.payIn(payInAmount);
        savingAcc.payIn(payInAmount);

        // Question 4
//        AccountUpdater accUpd = new AccountUpdater(0.10);
//        double updatePercentage = 0.01;
//
//        acc.updateAccount(updatePercentage);
//        checkingAcc.updateAccount(updatePercentage);
//        savingAcc.updateAccount(updatePercentage);
//
//        String accBalanceFormatted = formatter.format(acc.getBalance());
//        String checkingBalanceFormatted = formatter.format(checkingAcc.getBalance());
//        String savingBalanceFormatted = formatter.format(savingAcc.getBalance());
//
//        System.out.println("Account balance: " + accBalanceFormatted);
//        System.out.println("Checking Account balance: " + checkingBalanceFormatted);
//        System.out.println("Saving Account balance: " + savingBalanceFormatted);

        // Question 7
//        AccountUpdater accUpd = new AccountUpdater(0.01);
//
//        accUpd.run(acc);
//        accUpd.run(checkingAcc);
//        accUpd.run(savingAcc);
//
//        System.out.println("Total balance: " + formatter.format(accUpd.getTotalBalance()));
        // Question 10
        Bank myBank = new Bank(5);

        myBank.addAccount(acc);
        myBank.addAccount(savingAcc);
        myBank.addAccount(checkingAcc);

        AccountUpdater accountUpdater = new AccountUpdater(0.10);

        for (int i = 0; i < myBank.getAccountsNum(); i++) {
            accountUpdater.run(myBank.getAccount(i));
        }

        System.out.println(formatter.format(accountUpdater.getTotalBalance()));
    }
}
