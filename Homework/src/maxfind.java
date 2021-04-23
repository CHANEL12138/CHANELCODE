import java.util.Scanner;

public class maxfind {
    public static void main(String[] args)
    {
        int max;
        int count=1;
        Scanner s= new Scanner(System.in);
        System.out.print(" Enter numbers, the program exits if the input is 0：");
        int temp=s.nextInt();//输入第一个数字
        max=temp;//赋给max准备比较
        while(temp!=0)//读到不为0时进行循环
        {
            temp=s.nextInt();
            if(temp>max)//读入的大于max的时候
            {
                max=temp;//将其赋值给max
                count=1;//count为1
            }
            else if(temp==max)//如果与max相等
            {
                count++;//给count加一
            }
        }
        System.out.println("The largest number is:"+ max);
        System.out.println("The occurrence count of the largest number is:" + count);
    }
}
