import java.util.Scanner;

public class SolveEquitation {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double[] equ= new double[3];
        double[] roots=new double[2];
        Print("Enter a,b,c: ");
        for(int i=0;i<3;i++)
            equ[i]=input.nextDouble();//输入三个数当作a,b,c
        if(solveQuadratic(equ,roots)==2)//如果有两个根
        {
            Print("The equation has two roots : ");
            Print(roots[0]+" and " + roots[1]);
        }
        else if(solveQuadratic(equ,roots)==0)//如果没有根
        {
            Print("The equation has no root!");
        }
        else//如果有一个根
        {
            Print("The equation has one root :");
            Print(roots[0]);
        }
    }
    public static void Print(Object obj){System.out.print(obj);}//输出函数
    public static int solveQuadratic(double[] eqn, double[] roots)//方法头
    {
        double a = eqn[0];
        double b = eqn[1];
        double c = eqn[2];
        double delta=b*b-4*a*c;//计算delta
        if(delta>0)//有两个根
        {
            roots[0]=((0-b)+Math.sqrt(delta))/2*a;
            roots[1]=((0-b)-Math.sqrt(delta))/2*a;
            return 2;
        }
        else if(delta==0)//有一个根
        {
            roots[0]=((0-b)+Math.sqrt(delta))/2*a;
            return 1;
        }
        else//没有根
        {
            return 0;
        }

    }
}
