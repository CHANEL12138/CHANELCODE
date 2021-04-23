public class EnumTest01 {
    public static void main(String[] args) {
        //方法的执行结果不止两种，每一种都可以数出来 用枚举类型,两种情况使用布尔类型
        Result r = divide(5,0);
        Result r1 = divide(30,6);
        System.out.println(r== Result.Success?"Success":"Fail");
        System.out.println(r1== Result.Success?"Success":"Fail");




    }
//    public static boolean divide(int a,int b)
//    {
//        try {
//            int c = a / b;
//            return true;
//        }catch (Exception e)
//        {
//            return false;
//        }
//    }
    public static Result divide(int a,int b)
    {
        try {
            int c = a / b;
            return Result.Success;
        }catch (Exception e)
        {
            return Result.Fail;
        }
    }
enum Result{
        Success,Fail
}
}
