public class Accounts {

    public static void main(String[] args) {
        Account accountA = new Account("A's account", 100.0);
        Account accountB = new Account("B's account", 0.0);
        Account accountC = new Account("C's account", 0.0);

        transfer(accountA, accountB, 50.0);
        transfer(accountB, accountC, 25.0);
    }

    public static void transfer(Account from, Account to, double howMuch) {
        from.withdrawal(howMuch);
        to.deposit(howMuch);
    }
}
