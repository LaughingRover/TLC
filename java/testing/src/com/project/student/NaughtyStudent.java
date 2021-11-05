package com.project.student;

import java.util.*;

public class NaughtyStudent extends Student {
  

  public NaughtyStudent(List<Double> grades, String name, Level level) {
    super(grades, name, level);
  }

  @Override
  public double getAverageGrade() { 
    return super.getAverageGrade() * 1.10; }
}