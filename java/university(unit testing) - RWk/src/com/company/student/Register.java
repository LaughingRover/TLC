package com.company.student;


import java.util.Comparator;
import java.util.List;

public class Register {

    /**
     * Register has a constructor parameter that takes a list of Nameable objects.
     *
     * Add a function getRegister which returns a list of Strings, the names of the students.
     *
     * Create a unit test to check that your Register functionality does the right thing.
     *
     * Add a function to Register that gets the highest grade of all students' grades.
     *
     * Ensure that your constructor can be invoked with a List<NaughtyStudent>.
     * Investigate wildcards to be sure this is the case.
     *
     * Refactor your Register class to use Java Streams
     */
    public Register() {
    }

        /**
         *  Extend your register with a function to return a student by name.
         *  getStudentsByName func takes a list of names and returns a List<Student>
         *      with the students who exist in the class.
         *      If there is no student in the register with that name,
         *      you should throw a StudentNotFoundException.
         *
         *  Write unit tests to check the behaviour of your new function.
         *      Check that a Student is returned when one with the right name exists,
         *      and that an exception is thrown if no student with that name exists.
         *
         *  It should return an Optional<Student>, empty if there is no student with that name.
         */
    public String getStudentByName() {
        return null;
    }

    /**
     * Extend your Register class with a method called getRegisterByLevel which takes a Level
     * and returns a list of the names of students studying at that Level.
     *
     * Refactor your getRegisterByLevel code to return a Map<Level, List<Student>>.
     */
    public List<Student> getRegisterByLevel() {
        return null;
    }

    /**
     * In your Register class, create a function called PrintReport which returns a formatted
     * string of all the names of the students grouped by their Level.
     */
    public String printReport() {
        return null;
    }

    /**
     * Add a sort() function to your Register that takes a Comparator<Student>
     * and returns a list of the students sorted according to the comparator.
     * @return
     */
    public Comparator<Student> sort() {
        return null;
    }

    /**
     * Add a function to Register that gets the highest grade of all students' grades.
     * @return
     */
    public Double getHighestStudentGrade() {
        return null;
    }

}
