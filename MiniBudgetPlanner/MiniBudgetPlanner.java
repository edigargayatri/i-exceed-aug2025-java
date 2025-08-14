import java.util.*;
 
// ----------------- Abstraction + Polymorphism -----------------
abstract class Transaction {
    private double amount;
    private String category;
 
    Transaction(double amount, String category) {
        this.amount = amount;
        this.category = category;
    }
 
    public double getAmount() { return amount; }
    public String getCategory() { return category; }
 
    // Polymorphism: subclasses implement differently
    public abstract void showInfo();
    public abstract boolean isIncome(); 
}
 
// ----------------- Inheritance -----------------
class Income extends Transaction {
    Income(double amount, String category) {
        super(amount, category);
    }
 
    @Override
    public void showInfo() {
        System.out.println("Income: " + getCategory() + " - " + getAmount());
    }
 
    @Override
    public boolean isIncome() {
        return true;
    }
}
 
class Expense extends Transaction {
    Expense(double amount, String category) {
        super(amount, category);
    }
 
    @Override
    public void showInfo() {
        System.out.println("Expense: " + getCategory() + " - " + getAmount());
    }
 
    @Override
    public boolean isIncome() {
        return false;
    }
}
 
//  Encapsulation + Alert System
class BudgetManager {
    private double balance;
    private List<Transaction> transactions;
 
    BudgetManager() {
        this.balance = 0;
        this.transactions = new ArrayList<>();
    }
 
    public double getBalance() { return balance; }
 
    // Added income and check alerts
    public void addIncome(double amount, String category) {
        Transaction income = new Income(amount, category);
        transactions.add(income);
        balance += amount;
        System.out.println("Income added.");
        checkAlert();
    }
 
    // Added expense and check alerts
    public void addExpense(double amount, String category) {
        if (amount > balance) {
            System.out.println("Not enough balance!");
            return;
        }
        Transaction expense = new Expense(amount, category);
        transactions.add(expense);
        balance -= amount;
        System.out.println("Expense added.");
        checkAlert();
    }
 
    // Show summary using polymorphism, no instanceof
    public void showSummary() {
        System.out.println("\n--- Budget Summary ---");
        System.out.println("Balance: " + balance);
 
        double totalIncome = 0;
        double totalExpense = 0;
 
        for (Transaction t : transactions) {
            t.showInfo();
            if (t.isIncome()){
                 totalIncome += t.getAmount();
            }
            else totalExpense += t.getAmount();
        }
 
        System.out.println("Total Income: " + totalIncome);
        System.out.println("Total Expenses: " + totalExpense);
        System.out.println("----------------------\n");
    }
 
    // Alert method
    private void checkAlert() {
        if (balance < 100) {
            System.out.println("ALERT: Your balance is very low!");
        }
        for (Transaction t : transactions) {
            if (!t.isIncome() && t.getAmount() > balance * 0.5) {
                System.out.println("ALERT: This expense is more than 50% of your current balance!");
            }
        }
    }
}
 
// Main Class 
public class MiniBudgetPlanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BudgetManager manager = new BudgetManager();
 
        System.out.println("Welcome to Mini Budget Planner!");
 
        boolean running = true;
        while (running) {
            System.out.println("1. Add Income\n2. Add Expense\n3. Show Summary\n4. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline
 
            switch (choice) {
                case 1 -> {
                    System.out.print("Enter income category: ");
                    String category = sc.nextLine();
                    System.out.print("Enter income amount: ");
                    double amount = sc.nextDouble();
                    manager.addIncome(amount, category);
                }
                case 2 -> {
                    System.out.print("Enter expense category: ");
                    String category = sc.nextLine();
                    System.out.print("Enter expense amount: ");
                    double amount = sc.nextDouble();
                    manager.addExpense(amount, category);
                }
                case 3 -> manager.showSummary();
                case 4 -> running = false;
                default -> System.out.println("Invalid choice!");
            }
        }
 
        sc.close();
    }
}