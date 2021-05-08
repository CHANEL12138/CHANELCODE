package Mayeight;

public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person("张三");
        Employee e1 = new Employee("李四");
        Faculty f1 = new Faculty("王五");
        Staff s1 = new Staff("赵六");
        Student s2 = new Student("钱七");
        System.out.println(p1);
        System.out.println(e1);
        System.out.println(f1);
        System.out.println(s1);
        System.out.println(s2);
    }
}
