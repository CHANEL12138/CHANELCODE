public class MyException extends Exception{
    MyException(){}
    MyException(String s)
    {
        super(s);
    }
    //如果是运行时异常就继承RuntimeException
    /*public static void main(String[] args) {
        MyException s = new MyException("用户名错误！");
        s.printStackTrace();
        System.out.println(s.getMessage());
    }*/
}
