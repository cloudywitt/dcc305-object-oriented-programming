package aula09;

public abstract class BankAccount {
    protected double balance;

    public double getBalance() {
        return this.balance;
    }

    public void payIn(double amount) throws InvalidAmountException {
        if (amount < 0) {
//            throw new IllegalArgumentException("Cannot pay in less than 0");
            throw new InvalidAmountException(amount);
        }

        this.balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > this.balance) {
            System.out.println("Not enough money");
        } else if (amount < 0) {
            System.out.println("Please, enter a valid amount");
        } else {
            this.balance -= amount;
        }
    }

    public abstract void updateAccount(double percentage);
}
