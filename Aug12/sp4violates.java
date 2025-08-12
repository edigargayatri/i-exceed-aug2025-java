// Single large interface (bad)
interface BankServices {
    void deposit(double amount);
    void withdraw(double amount);
    void openFixedDeposit(double amount, int years);
    void issueCreditCard();
    void processLoan();
}

// SavingsAccount is forced to implement unused methods
class SavingsAccount implements BankServices {
    @Override
    public void deposit(double amount) {
        System.out.println("Deposited " + amount);
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("Withdrew " + amount);
    }

    @Override
    public void openFixedDeposit(double amount, int years) {
        System.out.println("Opened FD for " + years + " years");
    }

    @Override
    public void issueCreditCard() {
        throw new UnsupportedOperationException("Credit card not supported for SavingsAccount");
    }

    @Override
    public void processLoan() {
        throw new UnsupportedOperationException("Loan service not available for SavingsAccount");
    }
}

public class sp4violates {
    public static void main(String[] args) {
        BankServices savings = new SavingsAccount();

        savings.deposit(5000);
        savings.withdraw(2000);
        savings.openFixedDeposit(10000, 3);

        try {
            savings.issueCreditCard();
        } catch (UnsupportedOperationException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            savings.processLoan();
        } catch (UnsupportedOperationException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
