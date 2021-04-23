package Apriltf;

public class Student {
    String stuNo;
    String name;

    public Student(String name) {
        this.name = name;
    }
    public Student() {
    }


    @Override
    public String toString() {
        return "Stu:"+name;
    }
}
