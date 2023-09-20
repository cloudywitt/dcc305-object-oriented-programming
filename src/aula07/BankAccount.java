package aula07;

public abstract class BankAccount {
    protected double balance;

    public double getBalance() {
        return this.balance;
    }

    public void payIn(double amount) {
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
//    public void updateAccount(double percentage) {
//        if (percentage < 0) {
//            System.out.println("Can not update less than 0%");
//
//            return;
//        }
//
//        this.balance = this.balance + (this.balance * percentage / 100);
//    }
}
