package scenarioBasedProblems;

abstract class BankAccount {
    private int accountNumber;
    protected double balance;

    public BankAccount(int accNo, double balance) {
        this.accountNumber = accNo;
        this.balance = balance;
    }

    public abstract void calculateInterest();

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + ", New Balance: " + balance);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew: " + amount + ", New Balance: " + balance);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    public double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate = 0.04;

    public SavingsAccount(int accNo, double balance) {
        super(accNo, balance);
    }

    @Override
    public void calculateInterest() {
        double interest = balance * interestRate;
        System.out.println("Interest for Savings Account: " + interest);
    }
}

class CurrentAccount extends BankAccount {
    public CurrentAccount(int accNo, double balance) {
        super(accNo, balance);
    }

    @Override
    public void calculateInterest() {
        System.out.println("No interest for Current Account.");
    }
}

public class BankMain {
    public static void main(String[] args) {
        BankAccount acc1 = new SavingsAccount(201, 1000);
        acc1.deposit(500);
        acc1.calculateInterest();
        acc1.withdraw(300);

        System.out.println();

        BankAccount acc2 = new CurrentAccount(202, 2000);
        acc2.deposit(1000);
        acc2.calculateInterest();
        acc2.withdraw(5000);
    }
}
