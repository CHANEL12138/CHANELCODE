import java.util.Arrays;
import java.util.Scanner;

public class SelectSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] a = new double[10];
        Print("Enter 10 double Numbers : ");
        for (int i = 0; i < 10; i++) {//输入十个数
            a[i] = input.nextDouble();
        }
        double[] result = Selection(a);
        for (double i : result)//增强for
            Print(i + " ");
    }

    public static void Print(Object obj) {
        System.out.print(obj);
    }

    public static double[] Selection(double[] a) {//选择排序算法返回数组
        double[] arr = Arrays.copyOf(a, a.length);
        for (int i = 0; i < arr.length - 1; i++) {
            // 每轮需要比较的次数 N-i
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    //交换位置
                    double temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }
        }
        return arr;
    }
}
