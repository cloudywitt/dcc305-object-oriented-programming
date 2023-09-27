package aula09;

public class SavingAccount  extends BankAccount {
        public void updateAccount(double percentage) {
            if (percentage < 0) {
                System.out.println("Can not update less than 0%");

                return;
            }

            this.balance = this.balance + (this.balance * (percentage / 100) * 3);
    }
}
