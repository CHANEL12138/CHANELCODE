public class Test {
    public static void main(String[] args) {
        Account account = new Account("acc_no1",10000);
        AccountThread accountThread1 = new AccountThread(account);
        AccountThread accountThread2 = new AccountThread(account);
        accountThread1.start();
        accountThread2.start();



    }
}
