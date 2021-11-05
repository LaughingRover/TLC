package com.company.student;

import com.company.Level;
import com.company.Nameable;

import java.util.List;


public class Student implements Nameable {

    private Long id;
    private String name;
    public Level level;
    private List<Double> grades;


    public Student(Long id, String name, Level level, List<Double> grades) {
        this.id = id;
        this.name = name;
        this.level = level;
//        this.grades = grades;
    }

    /***
     * Refactor your student class to implement Nameable, and add the appropriate behaviour.
     * Returns:
     * @return
     */
    public String getName() {
        return name;
    }

    public Level getYear() {
        return level;
    }

        /**
         * Add a function to Student that returns their grades as a DoubleStream.
         */
    public List<Double> getGrades() {
        return grades;
    }

    public Double getAverageGrade() {
        return grades.stream().mapToDouble(x -> x).average().orElse(0.0);
    }


    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", level=" + level +
                '}';
    }

}
