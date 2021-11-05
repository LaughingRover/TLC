package com.project.lecture;

import java.util.*;
import com.project.student.*;

public class Lecture {
  List<Student> students;

  public Lecture() {
    students = new ArrayList<>();
  }

  public void enter(Student student) {
    students.add(student);
  }

  public double getHighestAverageGrade() {
    double HighestAverageGrade = 0.0;
    
    for (Student student : students) {
      HighestAverageGrade = student.getAverageGrade() > HighestAverageGrade 
        ? student.getAverageGrade()
        : HighestAverageGrade;
    }

    return HighestAverageGrade;
  }
}