package com.company;

import com.company.student.Student;

import java.util.List;

public class Lecture {
    public Student student;
    public List<Student> courseStudents;


    public void Enter(Student student) {
        System.out.println(student.getName() + " has entered the Lecture");
    }

    /**
     * Write test to verify that the highest grade returned is actually the
     * highest.
     * @param courseStudents
     * @return
     */
    public double getHighestGrade(List<Student> courseStudents) {
        return 0.0;
    }

}
