public class Test {
    public static void main(String[] args) {
        Account account = new Account("acc_no1",10000);
        ThreadSafe.AccountThread accountThread1 = new ThreadSafe.AccountThread(account);
        ThreadSafe.AccountThread accountThread2 = new ThreadSafe.AccountThread(account);
        accountThread1.start();
        accountThread2.start();



    }
}
