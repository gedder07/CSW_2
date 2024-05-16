public abstract class Account {
private int accountNumber;
private double balance;
public Account(int accno, double bal) {
this.accno = accno;
this.bal = bal;
}
public int getAccountNumber() {
return accno;
}
public void setAccountNumber(int accountNumber) {
this.accno = accno;
}
public double getBalance() {
return bal;
}
public void setBalance(double balance) {
this.bal = bal;
}
public abstract void deposit(double amount);
public abstract boolean withdraw(double amount);
}
public class SavingsAccount extends Account {
private double interestRate;
public SavingsAccount(int accountNumber, double balance, double interestRate) {
super(accno, bal);
this.interestRate = interestRate;
}
public double getInterestRate() {
return interestRate;
}
public void setInterestRate(double interestRate) {
this.interestRate = interestRate;
}
public void deposit(double amount) {
setBalance(getBalance() + amount);
}
public boolean withdraw(double amount) {
if (getBalance() >= amount) {
setBalance(getBalance() - amount);
return true;
}
return false;
}
public String toString() {
return "SavingsAccount [accountNumber=" + getAccountNumber() + ", balance=" + getBalance() +", interestRate="+ interestRate + "]";
}
}
public class CurrentAccount extends Account {
private double overdraftLimit;
public CurrentAccount(int accountNumber, double balance, double overdraftLimit) {
super(accountNumber, balance);
this.overdraftLimit = overdraftLimit;
}
public double getOverdraftLimit() {
return overdraftLimit;
}
public void setOverdraftLimit(double overdraftLimit) {
this.overdraftLimit = overdraftLimit;
}
public void deposit(double amount) {
setBalance(getBalance() + amount);
}
public boolean withdraw(double amount) {
if (getBalance() + overdraftLimit >= amount) {
setBalance(getBalance() - amount);
return true;
}
return false;
}
public String toString() {
return "CurrentAccount [accountNumber=" + getAccountNumber() + ", balance=" + getBalance() +", overdraftLimit=" + overdraftLimit + "]";
}
}
public class BankingApplication {
public static void main(String[] args) {
Account savingsAccount = new SavingsAccount(8767, 8758, 0.95);
Account currentAccount = new CurrentAccount(8765567, 589, 454);
System.out.println("Savings Account: " + savingsAccount);
savingsAccount.deposit(234);
savingsAccount.withdraw(485);
System.out.println("Updated Savings Account: " + savingsAccount);
System.out.println();
System.out.println("Current Account: " + currentAccount);
currentAccount.deposit(758);
currentAccount.withdraw(756);
System.out.println("Updated Current Account: " + currentAccount);
}
}
