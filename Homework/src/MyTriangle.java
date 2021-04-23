import java.util.Scanner;

public class MyTriangle {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        double side1=0;
        double side2=0;
        double side3=0;
        do{
            Print("Please input three sides of a triangle: ");
            side1=input.nextDouble();
            side2=input.nextDouble();
            side3=input.nextDouble();
        }while(!isValid(side1,side2,side3));
        Print("The area of the Triangle is: "+area(side1,side2,side3));
    }
    public static boolean isValid(double side1,double side2,double side3)
    {
        if((side1+side2>side3)&&(side1+side3>side2)&&(side3+side2>side1))
        {
            return true;
        }
        else
        {
            Print("The Triangle is not valid! \n");
            return false;
        }
    }
    public static double area(double side1,double side2,double side3)
    {
        double c=(side1+side2+side3)/2;
        return Math.sqrt(c*(c-side1)*(c-side2)*(c-side3));
    }
    public static void Print(Object obj)
    {
        System.out.print(obj);
    }
}
