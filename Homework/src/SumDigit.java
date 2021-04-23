import java.util.Scanner;

public class SumDigit {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        Print("Please input a Long Type: ");
        long a;
        a=input.nextLong();
        Print("The sum is: "+sumDigits(a)+"\n");

        Print("Please input a String Type: ");
        String str=input.next();
        Print("The sum is: "+sumDigits(str)+"\n");
    }
    public static int sumDigits(long n)
    {
        int sum=0;
        for(int i=0;n!=0;i++)
        {
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
    public static int sumDigits(String s)
    {
        long a=Long.parseLong(s);
        return sumDigits(a);
    }
    public static void Print(Object obj)
    {
        System.out.print(obj);
    }
}
