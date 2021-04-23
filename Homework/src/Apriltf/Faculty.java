package Apriltf;

import java.util.ArrayList;
import java.util.List;

public class Faculty {
    String tNo;
    String name;
    List<Course> courseList = new ArrayList<Course>(3);

    public Faculty(String name) {
        this.name = name;
    }
    public Faculty() {
    }

    public void addCourse(Course c)
    {
        courseList.add(c);
    }
    public void PrintCourse()
    {
        System.out.println(name+"老师教授的课程有：");
        for (Course course : courseList) {
            System.out.println(course);
        }
    }

}
