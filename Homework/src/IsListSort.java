import java.util.Scanner;

public class IsListSort {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Print("Enter a size of a list : ");
        int size;
        size=input.nextInt();
        int[] a = new int[size];//动态开辟数组
        for(int i=0;i<size;i++)
            a[i]=input.nextInt();//输入个数
        if(isSorted(a))
        {
            Print("The list is sorted ! ");
        }
        else
        {
            Print("The list is not sorted !");
        }
    }
    public static void Print(Object obj){System.out.print(obj);}
    public static boolean isSorted(int[] list)
    {
        for(int i=0;i< list.length-1;i++)
        {
            if(list[i+1]<list[i])//如果下一个数小于上一个书就返回假
            {
                return false;
            }
        }
        return true;
    }
}
