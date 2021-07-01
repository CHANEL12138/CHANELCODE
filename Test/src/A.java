import org.junit.Test;

public class A {
    public int book = 6;
    static String ss;
    public void base()
    {
        System.out.println("父类普通方法");
    }
    public void test()
    {
        System.out.println("父类覆盖方法");
    }

    public static void main(String[] args) {
        System.out.println(ss);
        Changer c = new Changer();
        c.method(args);
        System.out.println(args[0] + " " + args[1]);
    }

    public static class Changer {
        void method(String[] s) {

            String temp = s[0];

            s[0] = s[1];

            s[1] = temp;

        }
    }

    class Subclass extends A
{
    public String book = "好家伙";

    @Override
    public void test() {
        System.out.println("子类覆盖的普通方法");
    }
    public void sub()
    {
        System.out.println("子类的普通方法");
    }
}


class C implements s {

    private String get()
    {
        return "C";
    }

}
class D extends C{


        private String get()
        {
            return "D";
        }
        public void te()
        {
            System.out.println(get());
        }
        public s test()
        {

            return new C();
        }
}
public interface s{

}
@Test
    public void test1()
    {
        C a = new C();


        A s = new Subclass();

        System.out.println(s.book);
        s.base();
        s.test();
        
    }
}