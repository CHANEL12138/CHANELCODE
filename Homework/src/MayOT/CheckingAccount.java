package MayOT;

import java.util.Date;

public class CheckingAccount extends Account{
    private double creditAmount;

    public CheckingAccount(String name, int id, double balance, double creditAmount) {
        super(name, id, balance);
        this.creditAmount = creditAmount;
        Date dateCreate = super.getDateCreated();
        dateCreate = new Date();
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
            Transaction transaction = new Transaction(this,false,amount,getBalance());
            addTrans(transaction);
            setBalance(getBalance()-amount);
        }
    }


    @Override
    public String toString() {
        return "CheckingAccount [creditAmount="+getCreditAmount()+"," +
                " Id="+getId()+", " +
                "Balance="+getBalance()+", Name="+getName()+", " +
                "DateCreated="+getDateCreated();
    }
}
