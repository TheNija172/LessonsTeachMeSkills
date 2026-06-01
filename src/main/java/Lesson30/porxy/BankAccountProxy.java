package Lesson30.porxy;

public class BankAccountProxy implements BankAccount {

    private final RealBankAccount realAccount;
    private final String role;

    public BankAccountProxy(String role, int initialBalance) {
        this.role = role;
        this.realAccount = new RealBankAccount(initialBalance);
    }

    @Override
    public void withdraw(int amount) {

        if (!role.equals("ADMIN")) {
            System.out.println("Only admin can withdraw");
            return;
        }

        realAccount.withdraw(amount);
    }
}
