package MayOT;

import java.util.Date;

public class Transaction {
    private Account account;
    private Date dateCreated;
    private final boolean status;
    private double Balance;
    private double Amount;

    public Account getAccount() {
        return account;
    }
    public Date getDateCreated() {
        return dateCreated;
    }
    public boolean isStatus() {
        return status;
    }
    public double getBalance() {
        return Balance;
    }
    public double getAmount() {
        return Amount;
    }

    public Transaction(Account account,
                       boolean status, double amount, double balance) {
        this.account = account;
        this.dateCreated = new Date();
        this.status = status;
        Amount = amount;
        Balance = balance;
    }


    @Override
    public String toString() {
        return getDateCreated()+"    "+getAccount().getId()+"    "+
                (isStatus() ?"W":"D")+"    "+getAmount()+"    "+getBalance();
    }
}
