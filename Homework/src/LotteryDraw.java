import java.util.Scanner;

public class LotteryDraw {
    static int first;//定义彩票第一个数字
    static int second;//定义彩票第二个数字
    static void Print(Object ob)//定义静态方法输出
    {
        System.out.print(ob);
    }
    public static void main(String[] args)//主函数
    {
        Scanner input = new Scanner(System.in);//定义输入对象
        first=(int)(Math.random()*10);//算第一位随机数
        second=(int)(Math.random()*10);//算第二位随机数
        while(first==second)//当第一第二位彩票号码相等时
        {
            second=(int)(Math.random()*10);//第二位重新计算
        }
        Print("Please input two lottery digit:");
        int first1;//用户输入的第一位
        int second1;//用户输入的第二位
        String number="";
        number=input.nextLine();//输入用户输入的号码
        first1=number.charAt(0)-48;//将字符串的第一位转成数字
        second1=number.charAt(1)-48;
        Print("The lottery number is "+ first+second+"\n");
        if((first==first1&&second==second1)||(first==second1&&
                second==first1))//如果数字都相等
        {
                if(first1==first&&second1==second)//如果数字及顺序相等
            {
                Print("10000$Price for you!");
            }
                else
            Print("3000$ Price for you!");
        }
        else if(first==first1||second==second1||
        first==second1||second==first1)//如果数字有一个相等
        {
            Print("1000$ Price for you!");
        }

        else//如果都不相等
        {
            Print("You lose!");
        }
    }
}
