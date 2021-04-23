import java.util.Scanner;

public class MyTriangle1 {
    double side1;
    double side2;
    double side3;//定义三边
    Scanner input = new Scanner(System.in);

    MyTriangle1(double side1, double side2, double side3) {//构造函数
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        while (IsValid()) {//如果无效重新读取三边
            System.out.println("The sides is inValid, Please retry: ");
            this.side1 = input.nextDouble();
            this.side2 = input.nextDouble();
            this.side3 = input.nextDouble();
        }
    }

    public boolean IsValid() {//检验方法
        return ((side1 + side2 <= side3) || (side1 + side3 <= side2)
                || (side3 + side2 <= side1));
    }

    public double Area() {//计算面积方法
        double s = (side1 + side2 + side3) / 2;
        double area = Math.pow(s * (s - side1) * (s - side2) * (s - side3), 0.5);
        return area;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double side1,side2,side3;
        System.out.print("Please input three sides:");
        side1=input.nextDouble();
        side2=input.nextDouble();
        side3=input.nextDouble();
        MyTriangle1 m = new MyTriangle1(side1,side2,side3);//创建对象
        System.out.println("The area of triangle is  "+m.Area());

    }
}
