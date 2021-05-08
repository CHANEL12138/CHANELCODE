package Mayeight;
public class Student extends Person{
    final static int FRESHMAN =1;
    final static int SOPHOMORE=2;
    final static int JUNIOR =3;
    final static int SENIOR = 4;
    int gradeStatus;

    public Student(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}
