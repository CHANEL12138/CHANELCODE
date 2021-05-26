package MayOT;


public class SavingsAccount extends Account{

    private static double AnnualInterestRate;

    public SavingsAccount(String name, int id, double balance) {
        super(name,id,balance);
    }
    public static double getAnnualInterestRate() {
        return AnnualInterestRate;
    }
    public static void setAnnualInterestRate(double v) {
        AnnualInterestRate = v;
    }
    public double getMonthlyInterest()
    {
        return getAnnualInterestRate()*getBalance()/1200;
    }






    @Override
    public String toString() {
        return "SavingsAccount [MonthlyInterest="+getMonthlyInterest()+", " +
                "Id="+getId()+", " +
                "Balance="+getBalance()+", Name="+getName()+", DateCreated="+getDateCreated()+"]";
    }
}
