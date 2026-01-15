package Lesson6;

/*
Создать класс CreditCard c полями номер счета, текущая сумма на счету. Добавьте
метод, который позволяет начислять сумму на кредитную карточку. Добавьте метод,
который позволяет снимать с карточки некоторую сумму. Добавьте метод, который
выводит текущую информацию о карточке.
*/

public class CreditCard {
    private int accountNumber;
    private double balance;

    public CreditCard(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void increaseBalance(double amount){
        this.balance += amount;
    }

    public void reduceBalace(double amount){
        if (amount > this.balance){
            System.out.println("Недостаточно средств для снятия");
            return;
        }
        this.balance -= amount;
    }

    @Override
    public String toString() {
        return "Номер счёта: " + accountNumber + "\nСумма на счету:" + balance;
    }
}
