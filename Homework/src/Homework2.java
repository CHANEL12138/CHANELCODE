import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String str;
        Print("Enter a string: ");
        str=input.nextLine();
        Print("The reversed string is ");
        Print(Reverse(str));
        Print("\n");
        OddStr(str);

        Print("The count of uppercase is "+Uppercase(str));
    }
    public static String Reverse(String str)
    {
        String a="";
        for(int i=0;i<str.length();i++)
        {
            a=str.charAt(i)+a;//将字符串从头到尾取出来放到新字符串的前面
        }
        return a;
    }
    public static void OddStr(String str)
    {
        for(int i=1;i<str.length();i++) {
            Print(str.charAt(i));
            i++;
        }
        Print("\n");
    }
    public static int Uppercase(String str)
    {
        int count=0;
        for(int i=0;i<str.length();i++)
        {
            if(Character.isUpperCase(str.charAt(i)))
            count++;
        }
        return count;
    }
    public static void Print(Object obj)
    {
        System.out.print(obj);
    }
}
