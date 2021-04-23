import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/*
     Collection接口引出的类中存地址
 */
public class CollectionTest01 {
    public static void main(String[] args) {
        Collection c = new ArrayList();//有序可重复
        c.add(100);//自动装箱为Integer
        c.add(200);
        c.add(300);
        c.add(100);
        c.add("Hello World");

        c.remove(200);

        System.out.println(c.contains(200));
        System.out.println(c.contains("Hello World"));

        System.out.println(c.size());

        Iterator it1 = c.iterator();
        while (it1.hasNext())
        {
            Object obj = it1.next();
            System.out.println(obj);
        }

        c.clear();
        System.out.println(c.size());
/*
  重点：当集合的结构发生改变时，迭代器必须重新获取，如果还是用以前老的迭代器，会出现
    异常：java.util.ConcurrentModificationException
    但是删除时可以调用迭代器的remove方法是可以的，就将迭代器和集合中的都删除了
 */


        Collection c1 = new HashSet();//无序不重复
        c1.add(60);
        c1.add(70);
        c1.add(80);
        c1.add(60);
        c1.add("Lobster");
        Iterator it2 = c1.iterator();
        while (it2.hasNext())
        {
            Object obj = it2.next();
            System.out.println(obj);
        }

    }
}
