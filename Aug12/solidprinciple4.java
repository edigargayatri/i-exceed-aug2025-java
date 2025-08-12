// Remove 'public' from interfaces and extra classes
interface DepositService {
    void deposit(double amount);
}

interface WithdrawService {
    void withdraw(double amount);
}

interface FixedDepositService {
    void openFixedDeposit(double amount, int years);
}

interface CreditCardService {
    void issueCreditCard();
}

interface LoanService {
    void processLoan();
}

class SavingsAccount implements DepositService, WithdrawService, FixedDepositService {
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
}

class CreditCardDepartment implements CreditCardService {
    @Override
    public void issueCreditCard() {
        System.out.println("Credit card issued");
    }
}

public class solidprinciple4 {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount();
        sa.deposit(5000);
        sa.withdraw(2000);
        sa.openFixedDeposit(10000, 3);

        CreditCardDepartment ccDept = new CreditCardDepartment();
        ccDept.issueCreditCard();
    }
}
