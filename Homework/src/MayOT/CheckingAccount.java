package MayOT;


public class CheckingAccount extends Account{
    private double creditAmount;

    public CheckingAccount(String name, int id, double balance, double creditAmount) {
        super(name, id, balance);
        this.creditAmount = creditAmount;
    }
    public double getCreditAmount() {
        return creditAmount;
    }


    @Override
    public void withdraw(double amount) {

        if(Math.abs(getBalance())+amount>=getCreditAmount())
        {
            System.out.println("Insufficient Balance!");
        }
        else
        {
            setBalance(getBalance()-amount);
            Transaction transaction = new Transaction(this,false,amount,getBalance());
            addTrans(transaction);
        }
    }


    @Override
    public String toString() {
        return "CheckingAccount [creditAmount="+getCreditAmount()+"," +
                " Id="+getId()+", " +
                "Balance="+getBalance()+", Name="+getName()+", " +
                "DateCreated="+getDateCreated()+"]";
    }
}
