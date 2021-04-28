package April;

public class TestAccount {
    public static void main(String[] args) {

    Account[] accounts = new Account[10];
    accounts[0] = new Account(0,100);
    accounts[1] = new Account(1,100);
    accounts[2] = new Account(2,100);
    accounts[3] = new Account(3,100);
    accounts[4] = new Account(4,100);
    accounts[5] = new Account(5,100);
    accounts[6] = new Account(6,100);
    accounts[7] = new Account(7,100);
    accounts[8] = new Account(8,100);
    accounts[9] = new Account(9,100);
    AccountClient accountClient = new AccountClient(accounts);
    accountClient.Login();

}

}
