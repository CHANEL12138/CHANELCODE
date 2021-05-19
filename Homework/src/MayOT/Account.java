package MayOT;

import java.util.ArrayList;

public class Account {
    private int id;
    private String name;
    private double balance;
    private java.util.Date dateCreated;
    //建立和交易关联一多关系的数据域
    private ArrayList<Transaction> transactions;

    public Account() { dateCreated = new java.util.Date(); }
    public Account(String name, int id, double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
        dateCreated = new java.util.Date();
    }

    public int getId() {    return this.id;   }
    public double getBalance() {    return balance;  }
    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }
    public String getName() {   return name;   }
    protected void setBalance(double balance) {   this.balance = balance;  }
    public java.util.Date getDateCreated() {  return dateCreated;  }

    public void addTrans(Transaction t){   transactions.add(t);   }
    public void withdraw(double amount) {
        //insert code
        if(getBalance()<amount)
        {
            System.out.println("Insufficient Balance! Withdraw error! ");
        }
        else
        {
            Transaction transaction = new Transaction(this,false,
                    getBalance(),getBalance()-amount);
            setBalance(getBalance()-amount);
            addTrans(transaction);
        }
    }

    public void deposit(double amount) {
        //insert code
        Transaction transaction = new Transaction(this,true,
                getBalance(),getBalance()+amount);
        setBalance(getBalance()+amount);
    }

    @Override
    //重写Account类的equals方法，给出相等的算法
    public boolean equals(Object obj) {
        if(this==obj) return true;
        if (obj != null&&obj instanceof Account) {
            if(((Account) obj).id==this.id)
            return true;
        }
        return false;
    }
}


