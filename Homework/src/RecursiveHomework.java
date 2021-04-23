import java.util.Scanner;

public class RecursiveHomework {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int i = input.nextInt();
        System.out.print("The reversal of " + i + " is ");
        reverseDisplay(i);
        System.out.print("Enter 8 integers: ");

        int[] list = new int[8];
        for (i = 0; i < list.length; i++)
            list[i] = input.nextInt();
        System.out.println("The largest element is " + largest(list));
        input.close();
    }
    public static void reverseDisplay(int value)
    {
        if(value<10)//小于十直接输出
        {
            System.out.print(value+"\n");
        }
        else
        {
            System.out.print(value%10);
            value=value/10;
            reverseDisplay(value);//递归计算
        }
    }
    public static int largest(int[] list) {//主方法
        return largest(list, list.length);
    }
    public static int largest(int[] list, int high) {//辅助递归方法
        int max;
        if(high==0)
        {
            return list[0];
        }
        else
        {
            max=largest(list,high-1);
            max=Math.max(max,list[high-1]);
        }
        return max;
    }
}
