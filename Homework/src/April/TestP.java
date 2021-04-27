package April;

public class TestP {
    public static void main(String[] args) {
        Person p1 = new Person("小明");
        Person p2 = new Person("小红");
        Person p3 = new Person("小黄");
        Person p4 = new Person("小蓝");


        p2.setBoss(p1);
        p3.setBoss(p1);
        p4.setBoss(p1);

        p2.PrintBoss();
        p3.PrintBoss();
        p4.PrintBoss();
        p1.PrintSub();

    }
}
