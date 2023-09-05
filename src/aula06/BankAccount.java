package aula06;

public class BankAccount {
    double balance;

    public double getBalance() {
        return this.balance;
    }

    public void payIn(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) { // maybe some security stuffs to make it more real life like
        if (amount > this.balance) {
            System.out.println("Not enough money");

            return;
        }

        this.balance -= amount;
    }

    public void updateAccount(float percentage) {
        this.balance = this.balance + (this.balance * percentage / 100);
    }
}
