public class Accounts {

    public static void main(String[] args) {
        Account tomAccount = new Account("Tom's account", 100.0);
        tomAccount.deposit(20);
        System.out.println(tomAccount.toString());
    }
}
