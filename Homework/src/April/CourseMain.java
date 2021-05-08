package April;

public class CourseMain {
    public static void main(String[] args) {
        CourseNew course1 = new CourseNew("Data Structures");
        CourseNew course2 = new CourseNew("Database Systems");
        course1.addStudent("Peter Jones");
        course1.addStudent("Brian Smith");
        course1.addStudent("Anne Kennedy");
        course1.addStudent("Susan Kennedy");
        course1.addStudent("John Kennedy");
        course1.addStudent("Kim Johnson");
        course1.addStudent("S1");
        course1.addStudent("S2");
        course1.addStudent("S3");
        course1.addStudent("S4");
        course1.addStudent("S5");
        course1.addStudent("S6");
        course1.addStudent("S7");
        course2.addStudent("Peter Jones");
        course2.addStudent("Steven Smith");


        System.out.println("Number of students in course1: " + course1.getNumberOfStudents());
        String[] students = course1.getStudents();
        for (int i = 0; i < students.length; i++)
            System.out.print(students[i] + ", ");
        System.out.println();
        System.out.print("Number of students in course2: " + course2.getNumberOfStudents());
        course1.dropStudent("S1");
        System.out.println("Number of students in course1: " + course1.getNumberOfStudents());
        students = course1.getStudents();
        for (int i = 0; i < course1.getNumberOfStudents(); i++)
            System.out.print(students[i] + (i < course1.getNumberOfStudents() - 1 ? ", " : " "));
        course1.clear();
        System.out.println("\nNumber of students in course1: " + course1.getNumberOfStudents());
    }
}
