package com.project.student;

import java.util.*;
import java.util.stream.*;

public class Student implements Nameable {
  
  private String name;
  private Level level;
  private List<Double> grades;


  public Student(List<Double> grades, String name, Level level) {
    this.grades = grades;
    this.name = name;
    this.level = level;
  }

  public String getName() {
    return name;
  }

  public Level getLevel() {
    return level;
  }

  public List<Double> getGrades() {
    return grades;
  }

   public double getAverageGrade () {
    return (
      grades
        .stream()
        .reduce(0.0, (sum, grade) -> sum + grade)
        
    ) / grades.size();
  }
}