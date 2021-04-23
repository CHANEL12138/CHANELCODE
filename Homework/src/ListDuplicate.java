import java.util.Arrays;
import java.util.Scanner;

public class ListDuplicate {
    static int count1=0;
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter list1 : ");
        int a = input.nextInt();
        int[] list1 = new int[a];
        for(int i=0;i<a;i++)list1[i]=input.nextInt();
        System.out.print("Enter list2 : ");
        a = input.nextInt();
        int[] list2 = new int[a];
        for(int i=0;i<a;i++)list2[i]=input.nextInt();
        //分别创建并读入两个数组



        System.out.print("After Eliminate Duplicates Data, the array is : \n");
        int[] result=eliminateDuplicates(list1,list2);//调去重方法
        System.out.println(Arrays.toString(result));

        System.out.print("After Order and Eliminate Duplicates Data, the array is : \n");
        int[] result1=mergeDuplicatesOrder(list1,list2);//调去重排序方法
        System.out.println(Arrays.toString(result1));


    }
    public static int[] eliminateDuplicates(int[] list)
    {
        int[] newList=new int[list.length];
        Arrays.sort(list);//先排序
        int count1=0;
        for(int i=0;i< list.length-1;i++)
        {
            if(list[i]!=list[i+1])//如果下一位和当前位不相等
            {
                newList[count1]=list[i];//存入新数组中
                count1++;
                if(i+1==list.length-1)
                {
                    newList[count1]=list[i+1];
                    count1++;
                }
            }
        }
        int[] result=new int[count1];//以新数组的长度返回数组
        System.arraycopy(newList,0,result,0,count1);
        return result;
    }
    public static int[] eliminateDuplicates(int[] list1, int[] list2)
    {
        int[] newList=new int[list1.length+ list2.length];
        System.arraycopy(list1,0,newList,0,list1.length);//加入list1
        System.arraycopy(list2,0,newList,list1.length,list2.length);//加入list2
        newList=eliminateDuplicates(newList);//将合并数组去重输出
        return newList;
    }
    public static int[] mergeDuplicatesOrder (int[] list1, int[] list2)
    {
        int[] newList= eliminateDuplicates(list1,list2);
        Arrays.sort(newList);//排序
        return newList;
    }
}
