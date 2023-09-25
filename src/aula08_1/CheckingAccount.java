package aula08_1;

public class CheckingAccount implements BankAccount, Taxable {
    private double balance;

    @Override
    public double getBalance() {
        return this.balance;
    }

    @Override
    public void payIn(double amount) {
        if (amount < 5.00) {
            System.out.println("You cannot make a pay in of less than 5.00");

            return;
        }

        double fee = 0.10;

        this.balance += amount - fee;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > this.balance) {
            System.out.println("Not enough money");
        } else if (amount < 0) {
            System.out.println("Please, enter a valid amount");
        } else {
            this.balance -= amount;
        }
    }

    @Override
    public void updateAccount(double percentage) {
        if (percentage < 0) {
            System.out.println("Can not update less than 0%");

            return;
        }

        this.balance = this.balance + (this.balance * (percentage / 100) * 2);
    }

    @Override
    public double calcTax() {
        return this.balance * 0.10;
    }
}
