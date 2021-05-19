package MayOT;

import java.util.ArrayList;

public class Person {
    private String name;
    private ArrayList<Account> accounts;

    public Person(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public ArrayList<Account> getAccounts() {
        return accounts;
    }



    public void addAccount(Account account)
    {
        ArrayList<Account> accounts = getAccounts();
        for(int i = 0 ;i<accounts.size();i++)
        {
            if(accounts.get(i).equals(account))
            {
                System.out.println("ID duplicate! unable to join!");
            }
            else
            {
                accounts.add(account);
            }
        }
    }

    public void printAllAccounts() {
        ArrayList<Account> accounts = getAccounts();
        System.out.println(getName()+" has "+accounts.size()+" account(s)");
        for (Account account : accounts) {
            System.out.println(account);
        }
    }


}
