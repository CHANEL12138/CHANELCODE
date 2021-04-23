import java.util.Scanner;

public class ErrorCatchLearn {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Input two integers:");
        int number1=input.nextInt();
        int number2=input.nextInt();
        try {
            int result=quotient(number1,number2);
            System.out.println(number1+" / "+number2+" is "+ result);
        }
        catch (ArithmeticException ex)//在try里抓异常，如果有异常执行catch里面的
        {
            System.out.println("Exception:an integer "+"cannot be divided by zero");
        }
        System.out.println("Execution continues...");
    }
    public static int quotient(int number1,int number2)
    {
        if(number2==0)
            throw new ArithmeticException("Divisor can not be zero");
        return number1/number2;
    }
}
