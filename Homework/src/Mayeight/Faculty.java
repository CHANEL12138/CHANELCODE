package Mayeight;

public class Faculty extends Employee{
    final static int ASSISTANT_PROFESSOR =1;
    final static int LECTURER =2;
    final static int ASSOCIATE_PROFESSOR =3;
    final static int PROFESSOR =4;
    int officeHours;
    int rank;

    public Faculty(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "name='" + name + '\'' +
                '}';
    }
}
