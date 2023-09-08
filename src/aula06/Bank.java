package aula06;

public class Bank {
    private String name;
    private BankAccount[] accounts;
    private int accountsNum;

    public Bank(int accountCapacity) {
        this.accounts = new BankAccount[accountCapacity];
    }

    public boolean isFull() {
        return this.accountsNum == this.accounts.length;
    }

    public void addAccount(BankAccount account) {
        if (account == null) {
            System.out.println("Not a valid account");
        } else if (this.isFull()) {
            System.out.println("The bank has reached its maximum capacity");
        } else {
            for (int i = 0; i < this.accounts.length; i++) {
                if (this.accounts[i] == null) {
                    this.accounts[i] = account;
                }
            }

            this.accountsNum++;
        }
    }

    public BankAccount getAccount(int index) {
        if (index < 0 || index > this.accounts.length - 1) {
            System.out.println("Not a valid account index");

            return null;
        }

        return this.accounts[index];
    }

    public int getAccountsNum() {
        return this.accountsNum;
    }
}
