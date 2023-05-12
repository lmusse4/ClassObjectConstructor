public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(500, "Leyla");
        account.deposit(100);
        account.printAccountDetails();

        // create two bank accounts with different balances
        BankAccount account1 = new BankAccount(5000, "Larry");
        BankAccount account2 = new BankAccount(300, "Mary");

        // withdraw $100 from account 1 and deposit it into account 2
        account1.withdrawal(100);
        account2.deposit(100);

        // print the account details to the console
        account1.printAccountDetails();
        account2.printAccountDetails();


    }
}

