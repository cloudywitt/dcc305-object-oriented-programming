package aula08_1;

public interface BankAccount {
    public double getBalance();

    public void payIn(double amount);

    public void withdraw(double amount);

    public void updateAccount(double percentage);
}
