package aula08_1;

public class SavingAccount implements BankAccount {
    private double balance;

    @Override
    public double getBalance() {
        return this.balance;
    }

    @Override
    public void payIn(double amount) {
        this.balance += amount;
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

        this.balance = this.balance + (this.balance * (percentage / 100) * 3);
    }
}
