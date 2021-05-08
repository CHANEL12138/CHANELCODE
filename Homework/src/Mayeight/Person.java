package Mayeight;
//(Person、Student、Employee,Faculty和Staff类）设计一个名为Person的类以及两个名为Student和Employee的子类。
// Employee类又有子类：教员类Faculty和职员类Staff。每个人都有姓名(name)、地址address、电话号码phoneNumber和电子邮件地址email。
// 学生有班级状态(大一： FRESHMAN =1、大二： SOPHOMORE=2、大三：  JUNIOR =3 、大四SENIOR = 4）。将这些状态定义为常量。
// 一个雇员涉及办公室office，工资salary。
// 教员有办公时间officeHours和级别rank(助教： ASSISTANT_PROFESSOR =1，讲师 ：LECTURER =2，副教授 ASSOCIATE_PROFESSOR =3；，教授：PROFESSOR =4)。
// 职员有头衔title。要求重写每个类中的toString方法(public String toString()),显示相应的类名和人名。
//
//画出这些类的UML图并实现这些类（不需要标注属性和方法）。编写一个测试程序，创建Person、Student、Employee、Faculty和Staff,并且调用它们的toString()方法。
//
//注意：为了简化编程，这题我们不考虑数据封装。父类允许子类访问的属性适用权限为protected。这样也无需去定义属性对应的get和set方法了。所有类中的构造方法都使用默认的构造方法。不需要再多定义构造方法。
public class Person {
    String name;
    String address;
    String phoneNumber;
    String email;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
