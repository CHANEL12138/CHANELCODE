public class Account {
    private String name;
    private double balance;
    Object obj = new Object();

    public Account(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }
    public Account() {
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }




//    public void withdraw(double money)//
//    {
//        double balance = getBalance();
//        try {//此处模拟网络延迟
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        double CurrentMoney = balance - money;
//        this.setBalance(CurrentMoney);
//    }
public void withdraw(double money)//
    {
//        synchronized (this)//obj也可以
//        {
            double balance = getBalance();
            try {
                Thread.sleep(1000);//此处模拟网络延迟
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            double CurrentMoney = balance - money;
            this.setBalance(CurrentMoney);
        //}
    }
}
