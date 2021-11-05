package com.company;

import com.company.lecturer.Lecturer;
import com.company.student.NaughtyStudent;
import com.company.student.Student;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Double> janeGrades = List.of(1.0, 2.0, 3.0, 4.0);
        List<Double> johnGrades = List.of(2.0, 3.0, 4.0, 5.0);
        List<Double> jasminGrades = List.of(3.0, 4.0, 5.0, 6.0);
        List<Double> jimmyGrades = List.of(4.0, 5.0, 6.0, 7.0);
        List<Double> estherGrades = List.of(5.0, 6.0, 7.0, 8.0);
        List<Double> jacobGrades = List.of(5.0, 7.0, 8.0, 9.0);
        List<Double> janeenGrades = List.of(7.0, 8.0, 9.0, 1.0);
        List<Double> johansenGrades = List.of(8.0, 9.0, 1.0, 2.0);
        List<Double> josephineGrades = List.of(9.0, 1.0, 3.0, 3.0);
        List<Double> jackGrades = List.of(1.0, 1.0, 1.0, 1.0);
        List<Double> jocelynGrades = List.of(2.0, 2.0, 2.0, 2.0);
        List<Double> audreyGrades = List.of(3.0, 3.0, 3.0, 3.0);

        List<Student> students = List.of(
            new Student(1L, "Jane", Level.First, janeGrades),
            new NaughtyStudent(2L, "John", Level.Second, johnGrades),
            new Student(3L, "Jasmine", Level.Third, jasminGrades),
            new Student(4L, "Jimmy", Level.Fourth, jimmyGrades),
            new NaughtyStudent(5L, "Esther", Level.First, estherGrades),
            new Student(6L, "Jacob", Level.Second, jacobGrades),
            new Student(7L, "Janeen", Level.Third, janeenGrades),
            new Student(8L, "Johansen", Level.Fourth, johansenGrades),
            new Student(9L, "Josephine", Level.First, josephineGrades),
            new NaughtyStudent(10L, "Jack", Level.Second, jackGrades),
            new Student(11L, "Jocelyn", Level.Third, jocelynGrades),
            new Student(12L, "Audrey", Level.Fourth, audreyGrades)
        );


        List<Student> firstYearStudents = students.stream().filter(student -> student.getYear() == Level.First).toList();
        List<Student> thirdAndFourthYearStudents = students.stream()
                .filter(student -> student.getYear() == Level.Third || student.getYear() == Level.Fourth).toList();

//        List<Character> vowel = List.of('a', 'e', 'i', 'o', 'u');
//        List<Student> physicsFourthYear = students.stream()
//             .filter(student -> student.getYear() == Level.Fourth  && vowel.contains(student.getName().toLowerCase().charAt(0))).toList();

        List<Student> physicsFourthYear = students.stream()
                .filter(student -> student.getYear() == Level.Fourth && student.getName().toLowerCase().matches("^[aeiou]")).toList();

        Lecturer programmingLecturer = new Lecturer("Sam");
        Lecturer gardeningLecturer = new Lecturer("Hornbeam");
        Lecturer physicsLecturer = new Lecturer("Einstein");

        Course introToProgramming = new Course("Introduction to programming", firstYearStudents, Level.First);
        Course advancedGardening = new Course("Advanced Gardening", thirdAndFourthYearStudents, Level.Fourth);
        Course physics = new Course("Physics", physicsFourthYear, Level.Fourth);

        introToProgramming.setLecturer(programmingLecturer);
        advancedGardening.setLecturer(gardeningLecturer);
        physics.setLecturer(physicsLecturer);

        System.out.println(introToProgramming);
        System.out.println(advancedGardening);
        System.out.println(physics);
    }
}
