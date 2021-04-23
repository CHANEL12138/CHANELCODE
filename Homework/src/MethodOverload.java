public class MethodOverload {
    public static void main(String[] args)
    {
        System.out.println(MaxNumbers(2.0,3.5));
        System.out.println(MaxNumbers(2.0,3.5,9.8));
        displaySortedNumbers(8,3,5);
        displaySortedNumbers(8,3);

    }
    public static double MaxNumbers(double num1,double num2,double num3)
    {
        if(MaxNumbers(num1,num2)<num3)return num3;
        else
        {
            return MaxNumbers(num1,num2);
        }
    }
    public static double MaxNumbers(double num1,double num2)
    {
        return num1>num2?num1:num2;
    }
    public static void displaySortedNumbers(double num1,double num2,double num3)
    {
        if(MaxNumbers(num1,num2)<num3)
        {
            System.out.print(num3+" ");
            System.out.print(MaxNumbers(num1,num2)+" ");
            System.out.print(Math.min(num1,num2));
        }
        else
        {
            System.out.print(MaxNumbers(num1,num2)+" ");
            System.out.print(Math.min(num1,num2)+" ");
            System.out.print(num3+"\n");
        }
    }
    public static void displaySortedNumbers(double num1,double num2)
    {
        System.out.print(MaxNumbers(num1,num2)+" ");
        System.out.print(Math.min(num1,num2));
    }
}
