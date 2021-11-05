package com.company;

import com.company.lecturer.Lecturer;
import com.company.student.Student;

import java.util.List;


public class Course {

    public  String name;
    private Lecturer lecturer;
    public List<Student> students;
    public Level level;

    public Course(String name, List<Student> students, Level level) {
        this.name = name;
        this.students = students;
        this.level = level;
    }

    public void setLecturer(Lecturer lecturer) {
        this.lecturer = lecturer;
    }

    /**
     * Add a function to find the average of all students grades.
     * Add another function to return the grades of students scoring above 60%.
     * @return
     */

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", lecturer=" + lecturer +
                ", students=" + students +
                ", level=" + level +
                '}' + '\n';
    }
}
