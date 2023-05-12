public class BankAccount {
    private double balance;
    private String accountHolderName;

    public BankAccount(double balance, String accountHolderName) {
        this.balance = balance;
        this.accountHolderName = accountHolderName;
    }

    public void deposit(double amount) {
        balance = balance + amount;
    }

    public void withdrawal(double amount) {
        if (balance >= amount) {
            balance = balance - amount;
        } else {
            System.out.println("Not enough funds.");
        }
    }

    public void printAccountDetails() {
        System.out.println("Account holder's name: " + accountHolderName);
        System.out.println("Account balance: $" + balance);
    }
}