package April;

public class CourseNew {
    private String courseName;
    private String[] students = new String[2];
    private int numberOfStudents;
    public CourseNew(String courseName) { this.courseName = courseName;}
    public void addStudent(String student) {
        if(numberOfStudents==students.length)
        {
            String[] newString = new String[numberOfStudents*2];
            System.arraycopy(students,0,newString,0,students.length);
            students = newString;
        }
        students[numberOfStudents] = student;
        numberOfStudents++;
    }
    //这里这样做的原因是如果把student数组返回的话就可以直接对对象里面的数据进行修改，打破了封装。
    public String[] getStudents() {
        String[] stu = new String[getNumberOfStudents()];
        System.arraycopy(students,0,stu,0,getNumberOfStudents());
        return stu;
    }
    public int getNumberOfStudents() {return numberOfStudents;}
    public String getCourseName() { return courseName;}
    public void dropStudent(String student) {
        boolean target = false;
        for(int i = 0 ; i < getNumberOfStudents();i++)
        {
            if(students[i].equals(student))
            {
                target = true;
            }
            if(target)
            {
                if(i+1==getNumberOfStudents())
                {
                    break;
                }
                students[i] = students[i+1];
            }
        }
        numberOfStudents--;
    }
    public void clear()
    {
        numberOfStudents = 0;
        students = new String[2];
    }
}