import java.util.ArrayList;
import java.util.Collection;

/*
contains方法解析
    放在集合中的类型一定要重写equals方法。
    同理 remove方法的源码也是调的equals方法.
 */
public class CollectionTest02 {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        String a = new String("abc");
        String b = new String("def");
        String e = new String("abc");
        c.add(a);
        System.out.println(c.contains(e));//contains方法源代码里面调的是
        // equals方法，而String类重写了equals方法，所以这里应该返回true




        Collection c1 = new ArrayList();
        User u1 = new User("Jack");
        User u2 = new User("Jack");
        c1.add(u1);
        System.out.println(c1.contains(u2));//在没有重写user类的equals方法时，
        // contains调的User的父类Object类的Equals方法用“==”比较内存地址，所以为false
        System.out.println(c1.contains(u2));//重写后为true


        Collection c2 = new ArrayList();
        Integer i1 = 20;
        Integer i2 = 20;
        c2.add(i1);
        System.out.println(c2.contains(i2));//也返回true，因为Integer封装类重写了equals方法。
    }
}

class User
{
    String name;
    User(){}
    User(String name){this.name=name;}
    public boolean equals(Object obj)
    {
        if(obj==null||!(obj instanceof User))return false;
        if(obj==this)return true;
        User user = (User) obj;
        return user.name==this.name;
    }
}