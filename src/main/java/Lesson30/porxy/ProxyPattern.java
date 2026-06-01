package Lesson30.porxy;

public class ProxyPattern {
    public static void main(String[] args) {
        BankAccount account = new BankAccountProxy("USER", 1000);
        account.withdraw(200);
    }
}
