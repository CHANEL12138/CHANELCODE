package Apriltf;

public class TestS {
    public static void main(String[] args) {
        Student s1 = new Student("Tom");
        Student s2 = new Student("Jack");
        Course c1 = new Course("java");
        Course c2 = new Course("c");
        Faculty f1 = new Faculty("hyy");



        f1.addCourse(c1);
        f1.addCourse(c2);
        c1.addStu(s1);
        c1.addStu(s2);
        c2.addStu(s1);
        c2.addStu(s2);


        c1.PrintStudent();
        c2.PrintStudent();
        f1.PrintCourse();
    }
}
