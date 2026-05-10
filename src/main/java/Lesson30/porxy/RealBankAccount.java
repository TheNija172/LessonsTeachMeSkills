package Lesson30.porxy;

public class RealBankAccount implements BankAccount {

    private int balance;

    public RealBankAccount(int balance) {
        this.balance = balance;
    }

    @Override
    public void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdraw: " + amount);
        } else {
            System.out.println("Not enough money");
        }
    }
}
