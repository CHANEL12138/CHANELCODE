public class HandleLargeNumber {
    public static void main(String[] args) {
        //初始化两个加数数组，其中num1是大数，只考虑一位进位
        int[]  num1 = {0,9,9,7,9,4,5,6,7,2,3,4,5,6,4,7,8,9,8,7,6,9};
        int[]  num2 = {0,0,5,9,1,6,4,5,6,2,3,4,5,7,2,1,3,6,0,3,2,9};
        //声明和num1长度相同的结果数组
        int[]  result = new int[num1.length];
        //打印两个数组
        printArray(num1);
        System.out.printf(" \n 加上: \n");
        printArray(num2);
        System.out.printf(" \n 等于: \n");
        addArray(num1,num2, result);
        printArray(result);
    }
    //从数组元素不是0的索引开始打印数组
    //可以用System.out.printf方法在控制台上显示格式化输出，参考书本P126 格式化控制台输出
    public static void printArray(int[] array){
        //补充方法体
        boolean flag=false;
        for(int i=0;i<array.length;i++)
        {
            if(array[i]!=0&&!flag)
            {
                flag=true;
            }
            if(flag)
            {
                System.out.print(array[i]);
            }
        }
    }
    //对num1和num2的各个元素进行加法运算，结果依次存放到数组result中。
    public static void  addArray(int[] num1, int[] num2 , int[] result){
        //补充方法体
        for(int i=num1.length-1;i>=0;i--)
        {
            result[i]+=num1[i]+num2[i];
            if(result[i]>9)
            {
                result[i-1]++;
                result[i]=result[i]-10;
            }
        }
    }
}