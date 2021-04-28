package April;
import java.util.Scanner;
public class AccountClient {
    private Account[] accounts;
    private int AccountID ;
    private Account account;


    public AccountClient(Account[] accounts) {
        this.accounts = accounts;
    }
    public void setAccountID(int accountID) {
        AccountID = accountID;
    }
    public int getAccountID() {
        return AccountID;
    }
    public void setAccount() {
        for(int i = 0 ;i<accounts.length;i++)
        {
            if(AccountID==accounts[i].getId())
            {
                this.account = accounts[i];
            }
        }
    }

    public void Login()
    {
        int TempId;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a id : ");
        TempId = input.nextInt();
        for(int i = 0 ;i <accounts.length;i++)
        {
            if(accounts[i].getId()==TempId)
            {
                setAccountID(TempId);
                setAccount();
                Menu();
                break;
            }
            if(i==accounts.length-1)
            {
                System.out.print("Please input a correct id:");
                TempId = input.nextInt();
                i = 0;
            }
        }
    }
    public void Menu()
    {
        switch (MenuPrint())
        {
            case 1 :Balance();
            case 2 :Withdraw();
            case 3 :Deposit();
            case 4 :Exit();
        }
    }
    public int MenuPrint()
    {
        System.out.println("    Main menu");
        System.out.println("1: check balance");
        System.out.println("2: withdraw");
        System.out.println("3: deposit");
        System.out.println("4: exit");
        System.out.print("Enter a choice: ");
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }
    public void Balance()
    {
        System.out.println("******************");
        System.out.println("The balance is "+ account.getBalance());
        System.out.println("******************");
        Menu();
    }
    public void Withdraw()
    {
        System.out.println("******************");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a amount to withdraw : ");
        account.withdraw(input.nextDouble());
        System.out.println("******************");
        Menu();
    }
    public void Deposit()
    {
        System.out.println("******************");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a amount to deposit : ");
        account.deposit(input.nextDouble());
        System.out.println("******************");
        Menu();
    }
    public void Exit()
    {
        System.out.println("******************");
        System.out.println("See you!");
        System.out.println("******************");
        Login();
    }
}
