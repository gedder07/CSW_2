abstract class Account {
    private int accountNo;
    private double balance;

    public Account(int accountNo, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }
}

class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(int accountNo, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    @Override
    public void deposit(double amount) {
        double interest = amount * interestRate / 100;
        super.deposit(amount + interest);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= getBalance()) {
            super.withdraw(amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }
}

class CurrentAccount extends Account {
    private double overdraftLimit;

    public CurrentAccount(int accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= getBalance() + overdraftLimit) {
            super.withdraw(amount);
        } else {
            System.out.println("Withdrawal amount exceeds overdraft limit");
        }
    }
}

public class Bank6246app_ {
    public static void main(String[] args) {
        // Creating instances of SavingsAccount and CurrentAccount
        SavingsAccount savingsAccount = new SavingsAccount(234234, 1075, 7.0);
        CurrentAccount currentAccount = new CurrentAccount(543264, 3823, 4567);

        // Testing deposit and withdrawal operations
        savingsAccount.deposit(800);
        savingsAccount.withdraw(300);
        currentAccount.deposit(900);
        currentAccount.withdraw(2300);

        // Displaying account details
        System.out.println("Savings Account Details:");
        System.out.println("Account Number: " + savingsAccount.getAccountNumber());
        System.out.println("Balance: $" + savingsAccount.getBalance());
        System.out.println("Interest Rate: " + savingsAccount.getInterestRate() + "%");

        System.out.println("\nCurrent Account Details:");
        System.out.println("Account Number: " + currentAccount.getAccountNumber());
        System.out.println("Balance: $" + currentAccount.getBalance());
        System.out.println("Overdraft Limit: $" + currentAccount.getOverdraftLimit());
    }
}
