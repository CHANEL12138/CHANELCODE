public class AccountThread extends Thread{
    private Account acc;

    public AccountThread(Account acc) {
        this.acc = acc;
    }

    @Override
    public void run() {
        double money = 5000;
        //synchronized (this)//这样不行，因为两个线程分别有两把锁,不共享
        synchronized (acc)//这样也可以，只是扩大了同步范围
        {
            acc.withdraw(money);
        }

        System.out.println(Thread.currentThread().getName() + " Get " + money + "and balance is "+ acc.getBalance());
    }
}
