import java.util.Scanner;

public class NumberRead {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int[] a = new int[10];
        int[] b = new int[10];
        for(int i=0;i<10;i++)b[i]=0;
        Print("Enter 10 Numbers : ");
        for(int i=0;i<10;i++)//输入十个数
        {
            a[i]=input.nextInt();
            if(b[a[i]]==1)//如果输入过
            {
                continue;
            }
            else//没输出过就打印
            {
                if(i==9)
                    Print(a[i]);
                else
                Print(a[i]+" ");
            }
            b[a[i]]=1;
        }
    }
    public static void Print(Object obj){System.out.print(obj);}
}
