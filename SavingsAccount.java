public class SavingsAccount extends BankAccount {
    public static final double RATE = 0.025; // 2.5%

    private int savingsNumber = 0;

    private String accountNumber;

    public SavingsAccount(String name, double initialBalance) {
        super(name, initialBalance);
        accountNumber = super.getAccountNumber() + "-" + savingsNumber;
    }

    public SavingsAccount(SavingsAccount originalAccount, double initialBalance) {
        super(originalAccount, initialBalance);
        savingsNumber = originalAccount.savingsNumber + 1;
        accountNumber = super.getAccountNumber() + "-" + savingsNumber;
    }

    public void postInterest() {
        double interest = getBalance() * RATE / 12; 
        deposit(interest);
    }

    @Override
    public String getAccountNumber() {
        return accountNumber;
    }
}