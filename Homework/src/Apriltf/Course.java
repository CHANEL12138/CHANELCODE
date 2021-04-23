package Apriltf;

import java.util.ArrayList;
import java.util.List;

public class Course {
    String courseNo;
    String coursename;
    List<Student> studentList = new ArrayList<Student>(60);
    Faculty teacher;

    public Course(String coursename) {
        this.coursename = coursename;
    }

    public void addStu(Student stu)
    {
        studentList.add(stu);
    }
    public void setTeacher(Faculty teacher)
    {
        this.teacher = teacher;
        teacher.addCourse(this);
    }
    public void PrintStudent()
    {
        System.out.println(coursename + " 课程选课的学生有： ");
        for (Student student : studentList) {
            System.out.println(student);
        }
    }

    @Override
    public String toString() {
        return "Course:"+coursename;
    }
}
