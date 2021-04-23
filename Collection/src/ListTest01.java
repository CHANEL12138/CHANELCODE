import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
    1、List集合存储元素特点：有序可重复
        有序：List集合中的元素有下标。
        从0开始，以1递增。
        可重复：存储一个1，还可以再存储1.
    2、List既然是Collection接口的子接口，那么肯定List接口有自己“特色”的方法：
        以下只列出List接口特有的常用的方法：
            void add(int index, Object element)
            Object set(int index, Object element)
            Object get(int index)
            int indexOf(Object o)
            int lastIndexOf(Object o)
            Object remove(int index)
     二、ArrayList和LinkedList
     ArrayList集合：
    1、默认初始化容量10（底层先创建了一个长度为0的数组，当添加第一个元素的时候，初始化容量10。）
    2、集合底层是一个Object[]数组。
    3、构造方法：
        new ArrayList();
        new ArrayList(20);
    4、ArrayList集合的扩容：
        增长到原容量的1.5倍。
        ArrayList集合底层是数组，怎么优化？
            尽可能少的扩容。因为数组扩容效率比较低，建议在使用ArrayList集合
            的时候预估计元素的个数，给定一个初始化容量。
    5、数组优点：
        检索效率比较高。（每个元素占用空间大小相同，内存地址是连续的，知道首元素内存地址，
        然后知道下标，通过数学表达式计算出元素的内存地址，所以检索效率最高。）
    6、数组缺点：
        随机增删元素效率比较低。
        另外数组无法存储大数据量。（很难找到一块非常巨大的连续的内存空间。）
    7、向数组末尾添加元素，效率很高，不受影响。
    8、面试官经常问的一个问题？
        这么多的集合中，你用哪个集合最多？
            答：ArrayList集合。
            因为往数组末尾添加元素，效率不受影响。
            另外，我们检索/查找某个元素的操作比较多。

    7、ArrayList集合是非线程安全的。（不是线程安全的集合。）
    链表的优点：
    由于链表上的元素在空间存储上内存地址不连续。
    所以随机增删元素的时候不会有大量元素位移，因此随机增删效率较高。
    在以后的开发中，如果遇到随机增删集合中元素的业务比较多时，建议
    使用LinkedList。

链表的缺点：
    不能通过数学表达式计算被查找元素的内存地址，每一次查找都是从头
    节点开始遍历，直到找到为止。所以LinkedList集合检索/查找的效率
    较低。

    ArrayList：把检索发挥到极致。（末尾添加元素效率还是很高的。）
    LinkedList：把随机增删发挥到极致。
    加元素都是往末尾添加，所以ArrayList用的比LinkedList多。




 */
public class ListTest01 {
    public static void main(String[] args) {
        List c = new ArrayList();
        c.add(123);
        c.add("Hello");
        c.add("World");
        //123 Hello World
        c.add(2,"Jack");//把下标一变成第二参数，后面的往后移一位
        c.set(0,66);//把下标一处变为66
        c.add("Jack");

        //66 Hello Jack World Jack
        //下标从0开始
        System.out.println(c.get(3));//将下标三拿到输出
        System.out.println(c.indexOf(123));//返回该Object的下标
        System.out.println(c.indexOf(66));
        System.out.println(c.indexOf("Jack"));//返回第一次的下标
        System.out.println(c.lastIndexOf("Jack"));//返回最后一次的下标
        c.remove(1);//移除下标为一的元素
        // 66 Jack World Jack
        Iterator it = c.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }


    }
}
