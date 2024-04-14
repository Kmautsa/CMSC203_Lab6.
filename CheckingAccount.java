
public class CheckingAccount extends BankAccount {
    private static final double FEE = 0.15; // 15 cents

    public CheckingAccount(String name, double initialAmount) {
        super(name, initialAmount);
        setAccountNumber(getAccountNumber() + "-10");
    }

    @Override
    public boolean withdraw(double amount) {
        double totalAmount = amount + FEE;
        return super.withdraw(totalAmount);
    }
}