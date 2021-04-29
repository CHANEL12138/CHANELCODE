import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class Account {
    private int id = 0;
    private double balance = 0;
    //私有变量id和balance
    Date dataCreated;//日期类
    private static double annualInterestRate = 0;//定义一个类静态常量
    Account() {
        this.dataCreated=new Date();
    }//无参构造函数
    public Account(int id, double balance) {//有参构造函数
        this.id = id;
        this.balance = balance;
        this.dataCreated=new Date();
    }
    //setter和getter
    public static void setAnnualInterestRate(double annualInterestRate) {
        Account.annualInterestRate = annualInterestRate;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }
    public Date getDataCreated() {
        return dataCreated;
    }
    public double getMonthlyInterest (){
        return getBalance()*getAnnualInterestRate()/100/12;
    }
    public void withDraw(double value) {//取钱方法
        if (getBalance() < value) {//如果钱不够
            System.out.println("The Balance is Insufficient!");
        } else {
            setBalance(getBalance() - value);
        }
    }
    public void deposit(double value){
        setBalance(getBalance()+value);
    }//存钱方法
    public void BalancePrint()//打印该账户的id和余额
    {
        System.out.println("Homework.Account id "+getId()
                +" Balance is "+getBalance());
    }
    public void DateFormat()
    {
        SimpleDateFormat sdf = new SimpleDateFormat("创建账户时间是：yyyy年MM月dd日 HH时mm分ss秒ssss毫秒 ");
        System.out.println(sdf.format(dataCreated));
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, balance);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Account)) return false;
        Account account = (Account) o;
        return id == account.id && Double.compare(account.balance, balance) == 0;
    }


    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", balance=" + balance +
                ", dataCreated=" + dataCreated +
                '}';
    }

    public static void main(String[] args)//主函数
    {
        Account account1 = new Account(1112,20000);//第一个对象
        Account.setAnnualInterestRate(4.5);
        account1.withDraw(2500);
        account1.deposit(3000);
        account1.BalancePrint();
        System.out.println("Monthly interest is "+account1.getMonthlyInterest());
        System.out.println("This Homework.Account was created at "+account1.getDataCreated());
        account1.DateFormat();
        System.out.println("*************************************");
        Account account2 = new Account(2233,30000);//第二个对象
        account2.BalancePrint();
        System.out.println("Monthly interest is "+account2.getMonthlyInterest());
        System.out.println("This Homework.Account was created at "+account2.getDataCreated());
        account2.DateFormat();
        System.out.println("*************************************");
        Account.setAnnualInterestRate(3.95);
        System.out.println("Homework.Account id "+account1.getId()+
                " Monthly interest is "+account1.getMonthlyInterest());
        System.out.println("Homework.Account id "+account2.getId()+
                " Monthly interest is "+account2.getMonthlyInterest());

        System.out.println(account1.hashCode());
        System.out.println(account2.hashCode());

    }
}
