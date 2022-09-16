package ch11hw4;
public class AccountTest {
    public static void main(String[] args) {
        AccountClient accountClient = new AccountClient();
        Account from = new Account();
        Account to = new Account();

        accountClient.withDraw(from, 100.0);
        accountClient.deposit(from, 500.0);
        accountClient.deposit(to, 100.0);
        accountClient.transfer(to, from, 500.0);
    }
}
