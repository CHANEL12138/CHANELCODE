import java.util.Scanner;

public class NumberJudge {
    static void Print(Object obj)
    {
        System.out.print(obj);
    }
    static int[] n = {0,1,2,4,5,7,8,9,10};//定义整型数组储存数字位置
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String str = "";//定义一个字符串
        while (true)
        {
            Print("Enter a SSN:");
            str = input.nextLine();//输入字符串
            if (str.charAt(3) == '-' && str.charAt(6) == '-')//先判断第三个字符与第六个字符是否是-
            {
                int j = 0;//定义定位变量j
                for (int i = 0; i < 9; i++)//判断九位数字
                {
                    if (Character.isDigit(str.charAt(n[j])))//如果是数字
                    {
                        j++;//下一位判断
                        if(j==9)
                        {
                            Print(str + " is a valid social security number\n");
                            return;
                        }
                        continue;//继续循环
                    }
                    else//不是数字
                    {
                        Print(str + " is a invalid social security number\n");
                        break;//程序返回
                    }
                }
            }
            else//如果不是-
            {
                Print(str + " is a invalid social security number\n");//程序返回
            }
        }
    }
}
