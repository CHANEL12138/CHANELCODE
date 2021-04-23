import java.util.StringTokenizer;

public class StringLearn {
    public static void main(String[] args)
    {
        StringBuffer();
        StringToken();
        ToStringAndDigit();
        RegularExpression();
        StringFormat();

    }
    public static void StringToken()//stringToken类
    {
        StringTokenizer sh = new StringTokenizer("this is a test"," ");//用空格分开
        while(sh.hasMoreTokens())
            Print(sh.nextToken());
    }
    public static void StringBuffer()//StringBuffer类学习
    {
        String s = "";//不可变更
        String a = "a";
        StringBuffer s1 = new StringBuffer();
        for(int i=0;i<10;i++)
        {
            s+=a;//慢
        }
        for(int i=0;i<10;i++)
        {
            s1.append(i);//快
        }
        Print(s1);
        s1.insert(3,"GoD");
        Print(s1);
        s1.reverse();
        Print(s1);
        s1.setCharAt(1,'a');
        Print(s1);
        s1.setLength(5);
        Print(s1);
        Print(s1.charAt(2));
    }
//    4.StringBuffer、StringBuilder中的常用方法
//    增：append(xxx)
//    删：delete(int start,int end)
//    改：setCharAt(int n ,char ch) / replace(int start, int end, String str)
//    查：charAt(int n )
//    插：insert(int offset, xxx)
//    长度：length();
//    *遍历：for() + charAt() / toString()
    public static void ToStringAndDigit()//string类与int等互相转化
    {
        String b="I love Java";
        Print(b);
        b=String.valueOf(123113);//静态String类valueOf方法将int转为string
        Print(b);
        int i;
        i=Integer.parseInt(b);//静态数据封装类将String型转为int
        Print(i);
        char[] c;
        c=b.toCharArray();//string转char[]
        String new1=new String(c);//char[]转string
    }
    public static void RegularExpression()//正则表达式
    {
        "Java is fun".matches("Java.*");//全为真
        "Java is cool".matches("Java.*");
        "Java is powerful".matches("Java.*");
        "440-02-4534".matches("\\d{3}-\\d{2}-\\d{4}");

        String s = "a+b$#c".replaceAll("[$+#]", "NNN");//将$+#分别换成NNN
        Print(s);


        String[] Tokens = "Java,C?C#,C++".split("[,.;:?]");//String类按模式分离
        for (int i = 0; i < Tokens.length; i++)
        {
            Print(Tokens[i]);
        }

    }
    public static void StringFormat()//string封装类指定格式化，返回string
    {
        String s =String.format("%7.2f%6d%-4s",45.556,14,"AB");
        Print(s);
    }





    public static void Print(Object s)
    {
        System.out.println(s);
    }
}
